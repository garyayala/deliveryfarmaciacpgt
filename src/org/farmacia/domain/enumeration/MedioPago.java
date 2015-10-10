/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.farmacia.domain.enumeration;

/**
 *
 * @author Equipo
 */
public enum MedioPago {
    EFECTIVO("EFECTIVO")
    ,TARJETA("TARJETA");
    
    private String nombre;

    public String getNombre() {
        return nombre;
    }
    
    
    
    MedioPago(String nombre){
        this.nombre = nombre;
    }
    
    public static MedioPago parse(String id){
		MedioPago obj = null;
       for(MedioPago item : MedioPago.values()){
           if(item.nombre.equals(id)){
        	   obj = item;
               break;
           }       
       }
       return obj;
    }
}
