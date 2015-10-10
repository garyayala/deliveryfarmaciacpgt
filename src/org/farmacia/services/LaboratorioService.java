/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.farmacia.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.farmacia.domain.Laboratorio;
import org.farmacia.repository.LaboratorioDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Equipo
 */
@Service(value = "laboratorioService")
public class LaboratorioService {
    private @Autowired LaboratorioDAO laboratorioDAO;
    
    public Map<String,Object> registrar(String nombre){
        Map<String,Object> data = new HashMap<String,Object>();
        
        try{
            Laboratorio laboratorio =  new Laboratorio();
            laboratorio.setNombre(nombre);
            
            laboratorioDAO.registrar(laboratorio);
            
            data.put("status", true);
        }catch(Exception ex){
            data.put("status", false);
            data.put("message", "Hubo un error al registrar el laboratorio:"+ex.getMessage());
        }
        
        return data;
    }
    
    public List<Laboratorio> listar(){
        return laboratorioDAO.listar();
    }
    
    public Laboratorio get(String nombre){
        return laboratorioDAO.get(nombre);
    }
}
