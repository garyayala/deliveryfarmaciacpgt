/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.farmacia.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.farmacia.domain.Distrito;
import org.farmacia.domain.Provincia;
import org.farmacia.repository.UbigeoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Equipo
 */
@Service(value = "ubigeoService")
public class UbigeoService {
    private @Autowired UbigeoDAO ubigeoDAO;
    
    public List<Provincia> listarProvincias(){
        return ubigeoDAO.listarProvincias();
    }
    
    public List<Distrito> listarDistritos(Integer provinciaId){
        return ubigeoDAO.listarDistritos(provinciaId);
    }
    
    public Map<String,Object> registrarProvincia(String nombre){
        Map<String,Object> data = new HashMap<String,Object>();
        
        try{
            Provincia provincia = new Provincia();
            provincia.setNombre(nombre);
            
            ubigeoDAO.registrarProvincia(provincia);
            
            data.put("status", true);
        }catch(Exception ex){
            data.put("status", false);
            data.put("message", "Hubo un error al registrar la provincia:"+ex.getMessage());
        }
        return data;
    }
    
    public Map<String,Object> registrarDistrito(String nombre,String provinciaNombre){
        Map<String,Object> data = new HashMap<String,Object>();
        
        try{
            Provincia provincia = new Provincia();
            provincia.setNombre(provinciaNombre);
            
            Distrito distrito = new Distrito();
            distrito.setNombre(nombre);
            distrito.setProvincia(provincia);
            
            ubigeoDAO.registrarDistrito(distrito);
            
            data.put("status", true);
        }catch(Exception ex){
            data.put("status", false);
            data.put("message", "Hubo un error al registrar el distrito:"+ex.getMessage());
        }
        return data;
    }
}
