/*
 * Ejercicio 5: Leer por teclado dos tablas de 10 numeros enteros
 * y mezclarlas en una tercera de la forma: el 1° de A, el 1° de B,
 * el 2° de A, el 2° de B, etc.
 *
 */
package ejercicio5;

import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] tablaA = new int[10];
        int[] tablaB = new int[20];
        int[] tablaC = new int[20];
        int contador1=2,contador2=2,j=10,k=0;
        for(int i = 0;i<20;i++){
            if(i < 10){
                 tablaA[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Tabla A "+(i+1)+" Digite el numero : "));
            }
            if(i >= 10){
                tablaB[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Tabla B "+(i+1)+" Digite el numero : "));
            }
        }
       for(int i = 0;i<20;i++){
            if(contador1 == 2 || contador1 == 1 && contador2 == 2){
            tablaC[i] = tablaA[k];
            contador1--;
            k++;
           }else    
            if(contador1 == 0 && contador2 != 0){
                tablaC[i] = tablaB[j];
                contador2--;
                j++;
            }else
            if(contador2 == 0){
                contador1 = 2;
                contador2 = 2;
                i--;
            }
        }
        for(int i = 0;i<20;i++){
            JOptionPane.showMessageDialog(null, "La tabla C esta conformada por "+tablaC[i]);
        }
    }
    
}
