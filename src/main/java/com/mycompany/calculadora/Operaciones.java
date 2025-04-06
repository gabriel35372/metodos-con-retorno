package com.mycompany.calculadora;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author joseg
 */
public class Operaciones {
    
    public  int sumar(int numero1,int numero2){
        int sumar=numero1+numero2;
        return sumar;
    } 
    public int resta(int numero1,int numero2){
        int resta=numero1-numero2;
        return resta;
    }
    public int multiplicacion(int numero1,int numero2){
        int multiplicacion=numero1*numero2;
        return multiplicacion;
    }
    public int divicion(int numero1, int numero2){
        int divicion=numero1/numero2;
        return divicion;
    }
    
   
    
    public void mostrarResultados(int sumar, int resta, int multiplicacion, int divicion){
        System.out.println("La suma es "+sumar);
        System.out.println("La resta es "+resta);
        System.out.println("La multiplicacion es  "+multiplicacion);
        System.out.println("La divicion es "+ divicion);
    }
}
