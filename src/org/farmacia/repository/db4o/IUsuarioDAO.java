/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.farmacia.repository.db4o;

import com.db4o.ObjectSet;
import com.db4o.query.Query;
import java.util.List;
import org.farmacia.domain.Usuario;
import org.farmacia.repository.UsuarioDAO;
import org.farmacia.repository.util.Conexion;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Equipo
 */
public class IUsuarioDAO implements UsuarioDAO{
    private @Autowired Conexion conexion;
    
    @Override
    public boolean login(Usuario usuario) {
        try{
            ObjectSet<Usuario> obj = conexion.getDb().queryByExample(usuario);
            
            System.out.println("obj:"+obj);
            
            return (null != obj && obj.size() > 0);
        }catch(Exception e){
            System.out.println("Excepcion: "+e.getMessage());
        }finally{
//            conexion.getDb().close();
        }
        
        return false;
    }

    @Autowired
    public void setConexion(Conexion conexion) {
        this.conexion = conexion;
    }

    @Override
    public void registrar(Usuario usuario) {
        try{
            conexion.getDb().store(usuario);
            conexion.getDb().commit();
        }catch(Exception e){
            System.out.println("Excepcion: "+e.getMessage());
        }finally{
//            conexion.getDb().close();
        }
    }

    @Override
    public List<Usuario> listar() {
        List<Usuario> list = null;
        
        try{
            Query query = conexion.getDb().query();
            query.constrain(Usuario.class);
            
            list = query.execute();
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
//            conexion.getDb().close();
        }

        return list;
    }
    
    
}
