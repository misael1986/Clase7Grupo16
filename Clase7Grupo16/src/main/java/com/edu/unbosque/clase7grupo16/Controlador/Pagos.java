/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.unbosque.clase7grupo16.Controlador;

import com.edu.unbosque.clase7grupo16.Vista.Formulario;
import com.edu.unbosque.clase7grupo16.Modelo.Profesor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Usuario
 */
public class Pagos implements ActionListener{
    
    Formulario form;
    Profesor prof;
    
    public Pagos(Formulario f,Profesor p){
        this.form=f;
        this.prof=p;
        this.form.calc.addActionListener(this);
        
    
    }
    
    public double[] PagoProfesor(){
        this.prof.setSalario(Integer.parseInt(this.form.T_sueldo.getText()));
        return this.prof.pagoMensual();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==this.form.calc && 
                this.form.Tipo.getSelectedItem()=="Profesor"){
            double pago[]=PagoProfesor();
            this.form.Pagar.setText("Salud: $"+pago[0]+"\t"+
                    "Pension: $"+pago[1]+"\t"+
                    "ARL: $"+pago[2]);
            
        }
    }
    
    
}
