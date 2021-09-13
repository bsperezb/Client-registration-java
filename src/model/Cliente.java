/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author brayan
 */
public class Cliente {
    private int id ;
    private int doc_identidad;
    private String nombres;
    private String apellidos;
    private int telefono;

    public Cliente(){
        
    }
    
    public Cliente(int id, int doc_identidad, String nombres, String apellidos, int telefono) {
        this.id = id;
        this.doc_identidad = doc_identidad;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDoc_identidad() {
        return doc_identidad;
    }

    public void setDoc_identidad(int doc_identidad) {
        this.doc_identidad = doc_identidad;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "CLIENTE{" + "nombres=" + nombres + ", apellidos=" + apellidos + '}';
    }
    
    
    
}
