/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.dao;

import com.demo.modelo.Perfil;
import java.util.List;

/**
 *
 * @author carlos
 */
public interface Perfildao {
    
    public void actualizar(Perfil perfil);
    public Perfil buscarporId(Integer id);
    public List<Perfil> buscarTodos();
    
    
}
