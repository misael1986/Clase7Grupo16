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
public class Profesor extends Persona{
    
    private String profesion;
    private int salario;
    
    public void setProfesion(String p){
        this.profesion=p;
    }
    
    public void setSalario(int s){
        this.salario=s;
    }
    
    public String getProfesion(){
        return this.profesion;
    }
    
    public int getSalario(){
        return this.salario;
    }
    
    
    @Override
    public void setNombre(String n){//Polimorfismo Puro
        if(!n.equals("")){ this.nombre=n;}
    }
    
    
    public double[] pagoMensual(){
    
        double descuentos[]=new double[3];
        descuentos[0]=salario*0.125;//Salud
        descuentos[1]=salario*0.16;//Pension
        descuentos[2]=salario*0.00522;//ARL Riesgo Tipo 1
        return descuentos;
    }
}
