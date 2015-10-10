/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.farmacia.repository;

import java.util.Date;
import java.util.List;
import org.farmacia.domain.Pedido;

/**
 *
 * @author Equipo
 */
public interface PedidoDAO {
    void registrar(Pedido pedido);
    Pedido get(Integer pedidoId);
    List<Pedido> listar(Date fechaInicio,Date fechaFin);
    void actualizar(Pedido pedido);
}
