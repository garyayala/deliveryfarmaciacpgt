/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.farmacia.repository.db4o;

import com.db4o.ObjectSet;
import com.db4o.query.Query;
import java.util.List;
import org.farmacia.domain.Laboratorio;
import org.farmacia.repository.LaboratorioDAO;
import org.farmacia.repository.util.Conexion;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Equipo
 */
public class ILaboratorioDAO implements LaboratorioDAO{
    private Conexion conexion;
    
    @Override
    public void registrar(Laboratorio laboratorio) {
        try{
            conexion.getDb().store(laboratorio);
            conexion.getDb().commit();
        }catch(Exception e){
            System.out.println("Excepcion: "+e.getMessage());
        }finally{
//            conexion.getDb().close();
        }
    }

    @Override
    public List<Laboratorio> listar() {
        List<Laboratorio> list = null;
        
        try{
            Query query = conexion.getDb().query();
            query.constrain(Laboratorio.class);
            
            list = query.execute();
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
//            conexion.getDb().close();
        }

        return list;
    }

    @Autowired
    public void setConexion(Conexion conexion) {
        this.conexion = conexion;
    }

    @Override
    public Laboratorio get(String nombre) {
        try{
            
            ObjectSet<Laboratorio> obj = conexion.getDb().queryByExample(new Laboratorio(nombre));
            
            System.out.println("obj:"+obj);
            
            return (null != obj && obj.size() > 0) ? obj.get(0) : null;
        }catch(Exception e){
            System.out.println("Excepcion: "+e.getMessage());
        }
        
        return null;
    }
    
    
}
