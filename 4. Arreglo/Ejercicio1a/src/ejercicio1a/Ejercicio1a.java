/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1a;

import javax.swing.JOptionPane;

/**
 * Leer 5 numeros , guardarlos en un arreglo y mostrarlos
 * en el mismo orden introducido.
 */
public class Ejercicio1a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float[] numeros = new float[5];
        for(int i = 0;i<5;i++){
            numeros[i] = Float.parseFloat(JOptionPane.showInputDialog("Digite el numero "+i+": ");
        }
        for(int i = 0;i<5;i++){
            JOptionPane.showMessageDialog(null, "\nNum "+i+" : "+numeros[i]);
        }
    }
    //El resuelto por ProgramacionATS, lo realizo sin el JOptionPane.
}
