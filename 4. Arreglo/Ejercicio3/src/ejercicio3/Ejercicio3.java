/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import javax.swing.JOptionPane;

/**
 * Ejercicio 3: Leer 5 numeros por teclado
 * Almacenarlos en un arreglo y a continuacion
 * realizar la media de los numeros positivos 
 * la media de los numeros negativos y contar el
 * numero de ceros
 * 
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arreglo = new int[5];
        int mediapos = 0,medianeg = 0,contador=0,contmed=0,contneg=0;
        for(int i = 0;i<5;i++){
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el "+(i+1)+" Digito : "));
        }
        for(int i = 0;i<arreglo.length;i++){
            if(arreglo[i]>0){
                mediapos = arreglo[i];
                contmed++;
            }if(arreglo[i]<0){
                medianeg = arreglo[i];
                contneg++;
            }
            if(arreglo[i] == 0){
                contador++;
            }
        }
        mediapos = mediapos/contmed;
        medianeg = medianeg/contneg;
        JOptionPane.showMessageDialog(null, "La media de los numeros positivos es "+mediapos+" La media de los numeros "
                + "negativo es "+medianeg+" La cantidad de ceros que hay es "+contador);
    }
    
}
