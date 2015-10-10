package org.farmacia.services;

import java.util.Date;
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
    
    public void nuevoCliente( Cliente cliente){
        cliente.setFechaRegistro(null);
        clienteDAO.registrar(cliente);
    }
}
