
package ejercicio1;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio1 {

    /*
    Ejercicio : Leer un numero y mostrar su cuadrado, repetir
    el proceso hasta que se introduzca un numero negativo.
     */
    public static void main(String[] args) {
    //    Scanner entrada = new Scanner(System.in); // Lo utilizamos para ingresar por consola.
    
        
        int numero,n=10;
        for(int i = 0;i<n;i++){
       //     numero = entrada.nextInt();
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero : "));
                    if (numero >= 0){
                numero = numero*numero;
                JOptionPane.showMessageDialog(null, "El numero elevado al cuadrado es "+numero);
                n++;
            }else{
                JOptionPane.showMessageDialog(null,"El numero ingresado no es valido!");
                break;
            }
        }
    }
    
}
