/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.farmacia.domain;

import java.util.Date;
import org.farmacia.domain.enumeration.MedicamentoTipo;

/**
 *
 * @author bruno
 */
public class Medicamento extends Pojo{
    private Lote lote;
    private String codigo;
    private String descripcion;
    private double precio_compra;
    private MedicamentoTipo medicamentoTipo;
    private double precioVenta;
    private Date fechaVencimiento;
    private Laboratorio laboratorio;

    public Medicamento() {
    }
    
    

    public double getPrecio_compra() {
        return precio_compra;
    }

    public void setPrecio_compra(double precio_compra) {
        this.precio_compra = precio_compra;
    }
    

    public Lote getLote() {
        return lote;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public MedicamentoTipo getMedicamentoTipo() {
        return medicamentoTipo;
    }

    public void setMedicamentoTipo(MedicamentoTipo medicamentoTipo) {
        this.medicamentoTipo = medicamentoTipo;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Laboratorio getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }
  
    
}
