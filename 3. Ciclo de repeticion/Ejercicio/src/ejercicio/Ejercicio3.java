/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import javax.swing.JOptionPane;

/**
Ejercicio 3 : Leer numeros hasta que se introduzca un 0.
 Para cada uno indicar si es par o impar.
 */
public class Ejercicio3 {

  
    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero : "));
        while(numero!=0){
            if(numero%2==0){
                JOptionPane.showMessageDialog(null, "El numero "+numero+" es par");
            }else{
                JOptionPane.showMessageDialog(null, "El numero "+numero+" es impar");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero : "));
        }
    }
    
}
