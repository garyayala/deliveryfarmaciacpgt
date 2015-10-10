/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.farmacia.repository;

import java.util.List;
import org.farmacia.domain.Cliente;

/**
 *
 * @author Equipo
 */
public interface ClienteDAO {
    void registrar(Cliente cliente);
    List<Cliente> listar();
    Cliente get(String valor);
}
