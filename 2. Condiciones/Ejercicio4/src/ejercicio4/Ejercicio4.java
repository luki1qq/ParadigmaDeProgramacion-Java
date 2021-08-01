/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;
// Ejercicio 4: Un obrero necesita calcular su salario semanal, el cual se
// Obitnee de la siguiente manera: * Si trabaja 40 horas o menos se le paga 

import javax.swing.JOptionPane;

// $16 por hora. * Si trabaja mas de 40 horas se le paga $16 por cada una de las
// primeras 40 horas y $20 por cada hora extra.

public class Ejercicio4 {

    public static void main(String[] args) {
        int salario,horas,pago;
        horas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas : "));
        if(horas > 40){
            pago = horas - 40;
            pago = pago * 20;
            salario = pago + (40*16);
            JOptionPane.showMessageDialog(null, "El salario total es : "+ salario);
        }else{
            horas = horas * 16;
            JOptionPane.showMessageDialog(null, "El salario total es : "+ horas);
        }
    }
    
}
