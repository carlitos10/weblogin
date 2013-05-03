/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.dao.impl;

import com.demo.dao.UsuarioDao;
import com.demo.modelo.Usuario;
import com.demo.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author carlos
 */
public class UsuarioDaoImpl implements UsuarioDao{

    @Override
    public Usuario Buscarxusuario(Usuario usuario) {
      Session session= HibernateUtil.getSessionFactory().openSession();
      String sql = "select u from Usuario u where  username=:user and password=:pass";
      Query query = session.createQuery(sql);
      query.setString("user",usuario.getUsername());
      query.setString("pass", usuario.getPassword());
      return (Usuario) query.uniqueResult();
       
       
    }
    
}
