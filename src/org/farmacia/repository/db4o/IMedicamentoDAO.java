/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.farmacia.repository.db4o;

import com.db4o.query.Query;
import java.util.List;
import org.farmacia.domain.Medicamento;
import org.farmacia.repository.MedicamentoDAO;
import org.farmacia.repository.util.Conexion;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Equipo
 */
public class IMedicamentoDAO implements MedicamentoDAO{
    private @Autowired Conexion conexion;
    
    @Override
    public void registrar(Medicamento medicamento) {
        try{
            conexion.getDb().store(medicamento);
            conexion.getDb().commit();
        }catch(Exception e){
            System.out.println("Excepction: "+e.getMessage());
            e.printStackTrace();
        }finally{
//            conexion.getDb().close();
        }
    }

    @Override
    public List<Medicamento> listar() {
        List<Medicamento> medicamentos = null;
        
        try{
            Query query = conexion.getDb().query();
            query.constrain(Medicamento.class);
            
            medicamentos = query.execute();
        }catch(Exception ex){
            
        }finally{
//            conexion.getDb().close();
        }

        return medicamentos;
    }

    @Autowired
    public void setConexion(Conexion conexion) {
        this.conexion = conexion;
    }

    @Override
    public List<Medicamento> listar(String nombre) {
        List<Medicamento> medicamentos = null;
        
        try{
            Query query = conexion.getDb().query();
            query.constrain(Medicamento.class);
            query.descend("descripcion").constrain(nombre.trim().toLowerCase());
            
            medicamentos = query.execute();
        }catch(Exception ex){
            
        }finally{
//            conexion.getDb().close();
        }

        return medicamentos;
    }

    
}
