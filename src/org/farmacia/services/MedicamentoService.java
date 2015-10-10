/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.farmacia.services;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.farmacia.domain.Laboratorio;
import org.farmacia.domain.Medicamento;
import org.farmacia.domain.enumeration.MedicamentoTipo;
import org.farmacia.repository.LaboratorioDAO;
import org.farmacia.repository.MedicamentoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Equipo
 */
@Service(value = "medicamentoService")
public class MedicamentoService {
    private @Autowired MedicamentoDAO medicamentoDAO;
    private @Autowired LaboratorioDAO laboratorioDAO;
    
    public Map<String,Object> registrar(String descripcion,String precioventa,String precioCompra
                                ,Date fecha,String stock,String tipo,String lab){
        Map<String,Object> data = new HashMap<String,Object>();
        System.out.println("fecha:"+fecha);
        try{
            Laboratorio laboratorio = laboratorioDAO.get(lab);
            
            if(null == laboratorio){
                data.put("status", false);
                data.put("message", "El laboratorio enviado no es válido");
                
                return data;
            }
            
            DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            
            Medicamento medicamento =  new Medicamento();
            medicamento.setDescripcion(descripcion);
            medicamento.setMedicamentoTipo(MedicamentoTipo.parse(tipo));
            medicamento.setPrecio_compra(Double.parseDouble(precioCompra));
            medicamento.setFechaVencimiento(fecha);
            medicamento.setPrecioVenta(Double.parseDouble(precioventa));
            medicamento.setLaboratorio(laboratorio);
            
            medicamentoDAO.registrar(medicamento);
            
            data.put("status", true);
        }catch(Exception ex){
            data.put("status", false);
            data.put("message", "Hubo un error al registrar el medicamento:"+ex.getMessage());
        }
        
        return data;
    }
    
    public List<Medicamento> listar(){
        return medicamentoDAO.listar();
    }
    
    public List<Medicamento> listar(String nombre){
        return medicamentoDAO.listar(nombre);
    }
}
