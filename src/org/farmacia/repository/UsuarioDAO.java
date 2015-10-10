/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.farmacia.repository;

import java.util.List;
import org.farmacia.domain.Usuario;

/**
 *
 * @author Equipo
 */
public interface UsuarioDAO {
    boolean login(Usuario usuario);
    void registrar(Usuario usuario);
    List<Usuario> listar();
}
