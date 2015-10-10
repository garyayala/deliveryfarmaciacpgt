/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.farmacia.domain;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 *
 * @author Equipo
 */
public class Pojo implements Serializable{
    private Timestamp fechaRegistro;

    public Timestamp getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Timestamp fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    
    
}
