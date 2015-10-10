/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.farmacia.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.farmacia.domain.Usuario;
import org.farmacia.repository.UsuarioDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Equipo
 */
@Service(value = "usuarioService")
public class UsuarioService {
    private @Autowired UsuarioDAO usuarioDAO;
    
    public boolean login(String username,String password){
        Usuario usuario = new Usuario();
        usuario.setUsuario(username);
        usuario.setPassword(password);
        
        return usuarioDAO.login(usuario);
    }
    
    public Map<String,Object> registrar(String nombres,String apellidos,String username,String password){
        Map<String,Object> data = new HashMap<String,Object>();
        
        try{
            Usuario usuario =  new Usuario();
            usuario.setUsuario(username);
            usuario.setNombre(nombres);
            usuario.setApellidos(apellidos);
            usuario.setPassword(password);
            
            usuarioDAO.registrar(usuario);
            
            data.put("status", true);
        }catch(Exception ex){
            data.put("status", false);
            data.put("message", "Hubo un error al registrar el usuario:"+ex.getMessage());
        }
        
        return data;
    }
    
    public List<Usuario> listar(){
        return usuarioDAO.listar();
    }
}
