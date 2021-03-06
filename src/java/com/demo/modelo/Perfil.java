package com.demo.modelo;
// Generated Apr 29, 2013 12:45:57 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Perfil generated by hbm2java
 */
public class Perfil  implements java.io.Serializable {


     private Integer id;
     private String descripcion;
     private boolean mant;
     private boolean mantClie;
     private boolean mantProv;
     private boolean reporte;
     private boolean repClie;
     private boolean repProv;
     private boolean conf;
     private boolean confPerf;
     private boolean confUsuarios;
     private Set<Usuario> usuarios = new HashSet<Usuario>(0);

    public Perfil() {
    }

	
    public Perfil(String descripcion, boolean mant, boolean mantClie, boolean mantProv, boolean reporte, boolean repClie, boolean repProv, boolean conf, boolean confPerf, boolean confUsuarios) {
        this.descripcion = descripcion;
        this.mant = mant;
        this.mantClie = mantClie;
        this.mantProv = mantProv;
        this.reporte = reporte;
        this.repClie = repClie;
        this.repProv = repProv;
        this.conf = conf;
        this.confPerf = confPerf;
        this.confUsuarios = confUsuarios;
    }
    public Perfil(String descripcion, boolean mant, boolean mantClie, boolean mantProv, boolean reporte, boolean repClie, boolean repProv, boolean conf, boolean confPerf, boolean confUsuarios, Set<Usuario> usuarios) {
       this.descripcion = descripcion;
       this.mant = mant;
       this.mantClie = mantClie;
       this.mantProv = mantProv;
       this.reporte = reporte;
       this.repClie = repClie;
       this.repProv = repProv;
       this.conf = conf;
       this.confPerf = confPerf;
       this.confUsuarios = confUsuarios;
       this.usuarios = usuarios;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public boolean isMant() {
        return this.mant;
    }
    
    public void setMant(boolean mant) {
        this.mant = mant;
    }
    public boolean isMantClie() {
        return this.mantClie;
    }
    
    public void setMantClie(boolean mantClie) {
        this.mantClie = mantClie;
    }
    public boolean isMantProv() {
        return this.mantProv;
    }
    
    public void setMantProv(boolean mantProv) {
        this.mantProv = mantProv;
    }
    public boolean isReporte() {
        return this.reporte;
    }
    
    public void setReporte(boolean reporte) {
        this.reporte = reporte;
    }
    public boolean isRepClie() {
        return this.repClie;
    }
    
    public void setRepClie(boolean repClie) {
        this.repClie = repClie;
    }
    public boolean isRepProv() {
        return this.repProv;
    }
    
    public void setRepProv(boolean repProv) {
        this.repProv = repProv;
    }
    public boolean isConf() {
        return this.conf;
    }
    
    public void setConf(boolean conf) {
        this.conf = conf;
    }
    public boolean isConfPerf() {
        return this.confPerf;
    }
    
    public void setConfPerf(boolean confPerf) {
        this.confPerf = confPerf;
    }
    public boolean isConfUsuarios() {
        return this.confUsuarios;
    }
    
    public void setConfUsuarios(boolean confUsuarios) {
        this.confUsuarios = confUsuarios;
    }
    public Set<Usuario> getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set<Usuario> usuarios) {
        this.usuarios = usuarios;
    }




}


