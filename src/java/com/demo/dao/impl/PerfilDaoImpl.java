/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.dao.impl;

import com.demo.dao.Perfildao;
import com.demo.modelo.Perfil;
import com.demo.util.HibernateUtil;
import java.util.List;
import org.hibernate.classic.Session;

/**
 *
 * @author carlos
 */
public class PerfilDaoImpl implements Perfildao{

    @Override
    public void actualizar(Perfil perfil) {
        Session session= HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.update(perfil);
            session.beginTransaction().commit();
            
        } catch (Exception e) {
          System.out.println("error al actualizar el perfil"+e.getMessage());
          session.beginTransaction().rollback();
                 
        }
        
        
    }

    @Override
    public Perfil buscarporId(Integer id) {
          Session session= HibernateUtil.getSessionFactory().openSession();
        return (Perfil) session.load(Perfil.class, id);
    }

    @Override
    public List<Perfil> buscarTodos() {
          Session session= HibernateUtil.getSessionFactory().openSession();
          return session.createQuery("from Perfil").list();
          
        
    }
    
}
