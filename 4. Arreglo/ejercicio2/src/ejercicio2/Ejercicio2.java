/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import javax.swing.JOptionPane;

/**
Ejercicio 2: Leer 5 numeros, guardarlos en un arreglo y 
* mostrarlos en el orden inverso al introducido.
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        int[] numeros = new int[10];
        for(int i = 0;i<5;i++){
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(i+"Ingrese un numero : "));
        }
        for(int i = 4;i>0;i--){
            JOptionPane.showMessageDialog(null, "Los numeros ingresados fueron "+numeros[i]);
        }
    }
    
}
