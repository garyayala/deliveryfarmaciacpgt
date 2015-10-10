/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

/**
 *
 * @author bruno
 */
import java.util.*;
public class Pedido {
    private List<ItemPedido> item;
    private Usuario usuario;
    private double precio_total;
    private Date fecha_pedido;
    private int estado_pedido;
    private TipoPago tipo_pago;

    public int getEstado_pedido() {
        return estado_pedido;
    }

    public void setEstado_pedido(int estado_pedido) {
        this.estado_pedido = estado_pedido;
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
    
    
}
