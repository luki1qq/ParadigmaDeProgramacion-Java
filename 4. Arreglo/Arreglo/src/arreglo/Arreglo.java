/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class Arreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Declarar un arreglo
        //int[] edad = new int[4];
        int nElementos;
        nElementos = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de elementos : "));
        // Creamos el arreglo, vamos a utilizar de tipo caracter.
        char[] letras = new char[nElementos];
        System.out.println("Digite los elementos del arreglo : ");
        for(int i = 0;i<nElementos;i++){
            System.out.println((i+1)+". Digite un caracter: ");
            letras[i] = entrada.next().charAt(0); // charAt guarda el primer caracter.
        }
        System.out.println("¬nLos caracteres del arreglo son: ");
        for(int i = 0;i<nElementos;i++){
            System.out.println(letras[i]+" ");
        }
    }
    
}
