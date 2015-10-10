/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.farmacia.repository.db4o;

import com.db4o.ObjectSet;
import com.db4o.query.Query;
import java.util.List;
import org.farmacia.domain.Cliente;
import org.farmacia.repository.ClienteDAO;
import org.farmacia.repository.util.Conexion;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Equipo
 */
public class IClienteDAO implements ClienteDAO{
    private Conexion conexion;
    
    @Override
    public void registrar(Cliente cliente) {
        try{
            conexion.getDb().store(cliente);
            conexion.getDb().commit();
        }catch(Exception e){
            System.out.println("Excepcion: "+e.getMessage());
        }finally{
//            conexion.getDb().close();
        }
    }

    @Override
    public List<Cliente> listar() {
        List<Cliente> list = null;
        
        try{
            Query query = conexion.getDb().query();
            query.constrain(Cliente.class);
            
            list = query.execute();
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
//            conexion.getDb().close();
        }

        return list;
    }

    @Override
    public Cliente get(String dni) {
        try{
            Cliente cliente = new Cliente();
            cliente.setDni(dni);
            
            ObjectSet<Cliente> obj = conexion.getDb().queryByExample(cliente);
            
            System.out.println("obj:"+obj);
            
            return (null != obj && obj.size() > 0) ? obj.get(0) : null;
        }catch(Exception e){
            System.out.println("Excepcion: "+e.getMessage());
        }
        
        return null;
    }

    @Autowired
    public void setConexion(Conexion conexion) {
        this.conexion = conexion;
    }
}
