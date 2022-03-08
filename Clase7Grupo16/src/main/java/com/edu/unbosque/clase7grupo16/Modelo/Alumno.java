/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.unbosque.clase7grupo16.Modelo;

/**
 *
 * @author Usuario
 */
public class Alumno extends Persona {

    private String curso;
    private int grado;
    private float puntosSisben;

    public void setCurso(String c) {
        this.curso = c;
    }

    public void setGrado(int g) {
        this.grado = g;
    }

    public void setSisben(float s) {
        this.puntosSisben = s;
    }

    public String getCurso() {
        return this.curso;
    }

    public int setGrado() {
        return this.grado;
    }

    public float setSisben() {
        return this.puntosSisben;
    }

}
