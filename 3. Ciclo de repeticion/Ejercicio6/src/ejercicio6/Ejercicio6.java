/*
    Ejercicio 6 :Pedir numeros hasta que se teclee un 0, mostrar la suma 
    de todos los numeros introducidos 
 */
package ejercicio6;

import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int numero,suma;
       numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero : "));
       suma = numero;
       while(numero != 0){
           suma = suma + numero;
           numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero : "));
       }
       JOptionPane.showMessageDialog(null,"La suma total es "+suma);
    }
    
}
