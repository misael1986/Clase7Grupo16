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
public class Persona {

    public Persona() {
        this.estrato=0;

    }

    protected String nombre, primerApellido, SegundoApellido;
    protected String fechaNac;
    protected int estrato;
    private char TipoSang;
    private String GrupoSan;

    //Getter y Setter : Obtener y Asignar
    public void setNombre(String n) {//Setter para nombre
        this.nombre = n;
    }

    public void setApellido1(String n) {//Setter para Apellido
        this.primerApellido = n;
    }

    public void setApellido2(String n) {//Setter para Apellido 2
        this.SegundoApellido = n;
    }

    public void setFechaNac(String n) {//Setter para nombre
        this.fechaNac = n;
    }

    public void setEstrato(int n) {//Setter para nombre
        this.estrato = n;
    }

    public void setGrupoSan(String n) {//Setter para nombre
        this.GrupoSan = n;
    }

    public void setTipoSang(String n) {//Setter para nombre
        this.TipoSang = n.charAt(0);//charAt saca el CHar en la posición dada
    }

    public String getNombre() {//Getter para nombre
        return this.nombre;
    }

    public String getApellido1() {//Getter para nombre
        return this.primerApellido;
    }

    public String getApellido2() {//Getter para nombre
        return this.SegundoApellido;
    }

    public String getFechaNac() {//Getter para nombre
        return this.fechaNac;
    }

    public int getEstrato() {//Getter para nombre
        return this.estrato;
    }

    public String getGrupoSan() {//Getter para nombre
        return this.GrupoSan;
    }

    public char setTipoSang() {//Getter para nombre
        return this.TipoSang;
    }

}
