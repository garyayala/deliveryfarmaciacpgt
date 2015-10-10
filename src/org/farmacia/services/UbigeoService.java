/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.farmacia.services;

import java.util.List;
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
    
    private List<Provincia> listarProvincias(){
        return ubigeoDAO.listarProvincias();
    }
    
    private List<Distrito> listarDistritos(Integer provinciaId){
        return ubigeoDAO.listarDistritos(provinciaId);
    }
}
