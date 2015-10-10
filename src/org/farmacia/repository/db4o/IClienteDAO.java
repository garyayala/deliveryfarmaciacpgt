/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.farmacia.repository.db4o;

import java.util.List;
import org.farmacia.domain.Cliente;
import org.farmacia.repository.ClienteDAO;
import org.farmacia.repository.util.Conexion;

/**
 *
 * @author Equipo
 */
public class IClienteDAO extends Conexion implements ClienteDAO{

    @Override
    public void registrar(Cliente cliente) {
        try{
            getDb().store(cliente);
            getDb().commit();
        }catch(Exception e){
            System.out.println("Excepcion0: "+e.getMessage());
        }finally{
            getDb().close();
        }
    }

    @Override
    public List<Cliente> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cliente get(Integer clienteId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cliente get(String valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
