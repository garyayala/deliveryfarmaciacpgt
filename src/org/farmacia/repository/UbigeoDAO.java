/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.farmacia.repository;

import java.util.List;
import org.farmacia.domain.Distrito;
import org.farmacia.domain.Provincia;

/**
 *
 * @author Equipo
 */
public interface UbigeoDAO {
    List<Provincia> listarProvincias();
    List<Distrito> listarDistritos(Integer provinciaId);
    void registrarProvincia(Provincia provincia);
    void registrarDistrito(Distrito distrito);
}
