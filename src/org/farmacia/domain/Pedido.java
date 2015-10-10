/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.farmacia.domain;

/**
 *
 * @author bruno
 */
import java.util.*;
import org.farmacia.domain.enumeration.MedioPago;
import org.farmacia.domain.enumeration.PedidoStatus;

public class Pedido extends Pojo{
    private List<ItemPedido> item;
    private Usuario usuario;
    private double precio_total;
    private Date fecha_pedido;
    private MedioPago medioPago;
    private PedidoStatus status;
    private Direccion direccion;
    private Cliente cliente;

    public Pedido() {
    }

    
    public Date getFecha_pedido() {
        return fecha_pedido;
    }

    public void setFecha_pedido(Date fecha_pedido) {
        this.fecha_pedido = fecha_pedido;
    }

    public List<ItemPedido> getItem() {
        return item;
    }

    public void setItem(List<ItemPedido> item) {
        this.item = item;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public double getPrecio_total() {
        return precio_total;
    }

    public void setPrecio_total(double precio_total) {
        this.precio_total = precio_total;
    }

    public PedidoStatus getStatus() {
        return status;
    }

    public void setStatus(PedidoStatus status) {
        this.status = status;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public MedioPago getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(MedioPago medioPago) {
        this.medioPago = medioPago;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
}
