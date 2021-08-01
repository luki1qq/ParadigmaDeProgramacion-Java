
package ejercicio5;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 * Ejercicio 5: realizar un juego para adivinar un numero. Para ello generar un numero
 * aleatorio entre 0-100, y luego ir pidiendo numeros indicando es mayor o es menor
 * segun sea mayor o menor con respecto a N. El proceso termina cuando el usuario acerta.
 * Mostrar el numero de intentos
 */
public class EJercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random num_rand = new Random();
        int maximo = 100;
        int numero,num_aleat,intentos=0;
        num_aleat = num_rand.nextInt(maximo);
        do{
            JOptionPane.showMessageDialog(null, num_aleat);
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero : "));
            intentos++;
        }while(numero != num_aleat);
        JOptionPane.showMessageDialog(null, "El numero de intentos que realizo "+intentos+" El numero a encontrar era "+numero);
    }
    
}
