/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.unbosque.clase7grupo16.Vista;

import java.awt.FlowLayout;
import javax.swing.*;

/**
 *
 * @author Usuario
 */
public class Formulario extends JFrame {

    public JTextField T_nombre, T_sueldo;
    public JLabel L_nombre, L_sueldo,Pagar;
    public JComboBox Tipo;
    public JButton calc;

    public Formulario() {

        this.setTitle("Calcular Pagos");
        this.setLayout(new FlowLayout());
        this.setSize(300,300);

        T_nombre = new JTextField(10);
        T_sueldo = new JTextField(10);
        L_nombre = new JLabel("Nombre: ");
        L_sueldo = new JLabel("Digite Salario: ");
        String tip[] = {"Alumno", "Profesor", "Particular"};
        Tipo = new JComboBox(tip);
        calc = new JButton("Calcular");
        this.Pagar= new JLabel();

        this.add(this.L_nombre);
        this.add(this.T_nombre);
        this.add(this.L_sueldo);
        this.add(this.T_sueldo);
        this.add(this.Tipo);
        this.add(this.calc);
        this.add(this.Pagar);

    }

}
