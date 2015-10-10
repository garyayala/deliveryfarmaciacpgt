/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.farmacia.repository;

import java.util.List;
import org.farmacia.domain.Medicamento;

/**
 *
 * @author Equipo
 */
public interface MedicamentoDAO {
    void registrar(Medicamento medicamento);
    List<Medicamento> listar();
    List<Medicamento> listar(String nombre);
}
