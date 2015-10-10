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
public class ItemPedido {
    private Medicamento medicamento;
    private int cantidad;
    private double precio_item;

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio_item() {
        return precio_item;
    }

    public void setPrecio_item(double precio_item) {
        this.precio_item = precio_item;
    }
    
    
}
