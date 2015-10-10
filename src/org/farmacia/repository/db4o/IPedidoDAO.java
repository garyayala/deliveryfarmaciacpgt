/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.farmacia.repository.db4o;

import java.util.Date;
import java.util.List;
import org.farmacia.domain.Pedido;
import org.farmacia.repository.PedidoDAO;
import org.farmacia.repository.util.Conexion;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Equipo
 */
public class IPedidoDAO implements PedidoDAO{
    private Conexion conexion;
    
    @Override
    public void registrar(Pedido pedido) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pedido get(Integer pedidoId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Pedido> listar(Date fechaInicio, Date fechaFin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar(Pedido pedido) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Autowired
    public void setConexion(Conexion conexion) {
        this.conexion = conexion;
    }
}
