/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.farmacia.services;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.farmacia.domain.Cliente;
import org.farmacia.domain.Direccion;
import org.farmacia.domain.Pedido;
import org.farmacia.domain.enumeration.PedidoStatus;
import org.farmacia.repository.ClienteDAO;
import org.farmacia.repository.PedidoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Equipo
 */
@Service(value = "pedidoService")
public class PedidoService {
    private @Autowired PedidoDAO pedidoDAO;
    private @Autowired ClienteDAO clienteDAO;
    
    public Map<String,Object> registrar(String calle,String numero,Integer clienteId,String fechaStr){
        Map<String,Object> data = new HashMap<String,Object>();
        
        Cliente cliente = clienteDAO.get(clienteId);
        
        if(null == cliente){
            data.put("status", false);
            data.put("message", "");
            
            return data;
        }
        
        DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = null;
        
        try{
            fecha = sdf.parse(fechaStr);
        }catch(ParseException ex){
            
        }
        
        if(null == fecha){
            data.put("status", false);
            data.put("message", "");
            
            return data;
        }
        
        Pedido pedido = new Pedido();
        pedido.setStatus(PedidoStatus.REGISTRADO);
        
        Direccion direccion = new Direccion();
        direccion.setCalle(calle);
        direccion.setNumero(numero);
        
        pedido.setDireccion(direccion);
                
        pedidoDAO.registrar(pedido);
        
        return data;
    }
}
