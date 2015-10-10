/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.farmacia.repository;

import java.util.List;
import org.farmacia.domain.Laboratorio;

/**
 *
 * @author Equipo
 */
public interface LaboratorioDAO {
    void registrar(Laboratorio laboratorio);
    List<Laboratorio> listar();
    Laboratorio get(String nombre);
}
