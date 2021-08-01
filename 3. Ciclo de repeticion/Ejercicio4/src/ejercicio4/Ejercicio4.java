
package ejercicio4;

import javax.swing.JOptionPane;

/**
 * Ejercicio4: Pedir numeros hasta que se teclee uno negativo, y 
 * mostrar cuantos numeros se han introducido.
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero,contador = 1;
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero : "));
        
        while(numero>=0){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero : "));
            contador++;
        }
        JOptionPane.showMessageDialog(null, "La cantidad de numeros introducidos fueron "+contador);
    }
    
}
