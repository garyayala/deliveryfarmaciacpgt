/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.farmacia.repository.db4o;

import com.db4o.query.Query;
import java.util.List;
import org.farmacia.domain.Distrito;
import org.farmacia.domain.Provincia;
import org.farmacia.repository.UbigeoDAO;
import org.farmacia.repository.util.Conexion;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Equipo
 */
public class IUbigeoDAO implements UbigeoDAO{
    private Conexion conexion;
    
    @Override
    public List<Provincia> listarProvincias() {
        List<Provincia> provincias = null;
        
        try{
            Query query = conexion.getDb().query();
            query.constrain(Provincia.class);
            
            provincias = query.execute();
        }catch(Exception ex){
            
        }finally{
//            conexion.getDb().close();
        }

        return provincias;
    }

    @Override
    public List<Distrito> listarDistritos(String provinciaId) {
        List<Distrito> distritos = null;
        
        try{
            Query query = conexion.getDb().query();
            query.constrain(Distrito.class);
            query.descend("provincia").descend("nombre").constrain(provinciaId).equal();
            
            distritos = query.execute();
        }catch(Exception ex){
            
        }finally{
//            conexion.getDb().close();
        }

        return distritos;
    }

    @Autowired
    public void setConexion(Conexion conexion) {
        this.conexion = conexion;
    }

    @Override
    public void registrarProvincia(Provincia provincia) {
        try{
            conexion.getDb().store(provincia);
            conexion.getDb().commit();
        }catch(Exception e){
            System.out.println("Excepction: "+e.getMessage());
            e.printStackTrace();
        }finally{
//            conexion.getDb().close();
        }
    }

    @Override
    public void registrarDistrito(Distrito distrito) {
        try{
            conexion.getDb().store(distrito);
            conexion.getDb().commit();
        }catch(Exception e){
            System.out.println("Excepcion: "+e.getMessage());
        }finally{
//            conexion.getDb().close();
        }
    }
 
    
}
