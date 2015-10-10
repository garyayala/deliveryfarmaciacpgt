package org.farmacia.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.farmacia.domain.Cliente;
import org.farmacia.repository.ClienteDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Equipo
 */
@Service(value = "clienteService")
public class ClienteService {
    private @Autowired ClienteDAO clienteDAO;
    
    public Map<String,Object> nuevoCliente( Cliente cliente){
        Map<String,Object> data = new HashMap<String,Object>();
        
        try{
            cliente.setFechaRegistro(null);
            clienteDAO.registrar(cliente);
            
            data.put("status", true);
        }catch(Exception ex){
            ex.printStackTrace();
            
            data.put("status", false);
            data.put("message", "Hubo un error al registrar al cliente:"+ex.getMessage());
        }
        
        return data;
        
    }
    
    public List<Cliente> listar(){
        return clienteDAO.listar();
    }
            
}
