/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.unbosque.clase7grupo16;

import com.edu.unbosque.clase7grupo16.Controlador.Pagos;
import com.edu.unbosque.clase7grupo16.Modelo.Persona;//Buenas Practicas de MVC 
import com.edu.unbosque.clase7grupo16.Modelo.Profesor;
import com.edu.unbosque.clase7grupo16.Modelo.Alumno;
import com.edu.unbosque.clase7grupo16.Vista.Formulario;
/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona Anton=new Persona();
        Anton.setTipoSang("+");
        Anton.setNombre("Frank");
        Anton.setGrupoSan("AB");
        Anton.setEstrato(3);
        
        System.out.println("Nombre: "+Anton.getNombre());
        Persona Braile=new Persona();
        System.out.println(Braile.getEstrato());
        
        Profesor Misael = new Profesor();
        Misael.setApellido1("Perilla");
        Misael.setTipoSang("O");
        System.out.println(Misael.getApellido1()+"\t"+Misael.getGrupoSan());
        
        Alumno Carlos =new Alumno();
        Carlos.setCurso("16");
        Carlos.setGrado(2);
        Carlos.setNombre("Carlos Andres");
        
        Alumno Daniel=new Alumno();
        Daniel.setNombre("Daniel Fernando");
        System.out.println(Daniel.getNombre());
        
        
        Formulario F=new Formulario();
        Pagos pagarMisael=new Pagos(F, Misael);
        F.setVisible(true);
        F.setDefaultCloseOperation(3);
        
        
        
    }
    
}
