
package ejercicio2;

import javax.swing.JOptionPane;

public class Ejercicio2 {
    // Ejercicio : Programa que lea un caracter por teclado y compruebe si es una 
    // Letra mayuscula.

    public static void main(String[] args) {
        char letra;
        letra = JOptionPane.showInputDialog("Digite una letra : ").charAt(0);
        if(Character.isUpperCase(letra)){ //Character Lo podemos utilizar cuando
            // Querramos.
            JOptionPane.showMessageDialog(null, "Es una letra mayuscula ");
        }else{
            JOptionPane.showMessageDialog(null, "Es una letra minuscula ");
        }
        
    }
    
}
