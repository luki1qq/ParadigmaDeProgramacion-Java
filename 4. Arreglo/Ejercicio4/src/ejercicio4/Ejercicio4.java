/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import javax.swing.JOptionPane;

/**
 *
 * Ejercicio 4: Leer 10 numeros enteros, guardarlos en un arreglo.
 * Debemos mostrarlos en el siguiente orden: el primero, el segundo
 * el penultimo, el tercero, etc.
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arreglo = new int[10];
        for(int i = 0;i<10;i++){
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog(null,(i+1)+" Ingrese un numero : "));
        }
      JOptionPane.showMessageDialog(null, arreglo[0]);
      JOptionPane.showMessageDialog(null, arreglo[1]);
      JOptionPane.showMessageDialog(null, arreglo[8]);
      JOptionPane.showMessageDialog(null, arreglo[2]);
      for(int i = 3;i<10;i++){
          if(i != 8){
            JOptionPane.showMessageDialog(null, arreglo[i]);
          }
      }
     }
    
}
