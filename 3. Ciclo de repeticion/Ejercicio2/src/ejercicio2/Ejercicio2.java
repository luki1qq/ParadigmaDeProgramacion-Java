
package ejercicio2;

import javax.swing.JOptionPane;

/*
    Leer un numero e indicar si es positivo o negativo.
   El proceso se repetira hasta que se introduzca un 0.
*/
public class Ejercicio2 {


    public static void main(String[] args) {
        int numero;
        
        // Recordemos que cuando utilizamos el integerparseint antes es para convertir a entero el JoptionPane.
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero : ")); 
            if(numero > 0){
                JOptionPane.showMessageDialog(null, "Es positivo");
            }else if(numero<0){
                JOptionPane.showMessageDialog(null, "Es negativo ! ");
            }
        }while(numero != 0);
        
    }
    
}
