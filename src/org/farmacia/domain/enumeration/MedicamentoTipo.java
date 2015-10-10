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
public enum MedicamentoTipo {
    GENERICO("GENERICO")
    ,DEMARCA("DE MARCA");
    
    private String nombre;

    public String getNombre() {
        return nombre;
    }
    
    
    
    MedicamentoTipo(String nombre){
        this.nombre = nombre;
    }
    
    public static MedicamentoTipo parse(String id){
		MedicamentoTipo obj = null;
       for(MedicamentoTipo item : MedicamentoTipo.values()){
           if(item.nombre.equals(id)){
        	   obj = item;
               break;
           }       
       }
       return obj;
    }
}
