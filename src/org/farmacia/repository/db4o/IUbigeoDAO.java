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
            conexion.getDb().close();
        }

        return provincias;
    }

    @Override
    public List<Distrito> listarDistritos(Integer provinciaId) {
        List<Distrito> distritos = null;
        
        try{
            Query query = conexion.getDb().query();
            query.constrain(Provincia.class);
            query.descend("id").constrain(provinciaId).equal();
            
            distritos = query.execute();
        }catch(Exception ex){
            
        }finally{
            conexion.getDb().close();
        }

        return distritos;
    }

    @Autowired
    public void setConexion(Conexion conexion) {
        this.conexion = conexion;
    }
 
    
}
