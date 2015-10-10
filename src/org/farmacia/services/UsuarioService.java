/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.farmacia.services;

import org.springframework.stereotype.Service;

/**
 *
 * @author Equipo
 */
@Service(value = "usuarioService")
public class UsuarioService {
    public boolean login(String usuario,String password){
        return true;
    }
}
