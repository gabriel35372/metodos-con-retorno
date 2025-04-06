/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author joseg
 */
public class Calculadora {

   public static void main(String[] args){
     int n1=Integer.parseInt(JOptionPane.showInputDialog("Digital el numero 1:"));
     int n2=Integer.parseInt(JOptionPane.showInputDialog("Digital el numero 2:"));
     
    Operaciones op= new Operaciones();
    int suma=op.sumar(n1, n2);
    int resta= op.resta(n1, n2);
    int multiplicacion=op.multiplicacion(n1, n2);
    int division= op.divicion(n1,n2);
    op.mostrarResultados(suma,resta,multiplicacion,division);
     
  }
}
