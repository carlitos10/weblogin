/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.bean;

import com.demo.dao.Perfildao;
import com.demo.dao.impl.PerfilDaoImpl;
import com.demo.modelo.Perfil;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author carlos
 */
@ManagedBean
@SessionScoped
public class PerfilBean {
private Perfil perfil;
private List<Perfil> perfiles;
    public PerfilBean() {
        
    }

    public Perfil getPerfil() {
        if(perfil==null){
            perfil=new Perfil();
        }
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public List<Perfil> getPerfiles() {
        Perfildao perfildao= new PerfilDaoImpl();
        perfiles= perfildao.buscarTodos();
        return perfiles;
    }

    
    
    
}
