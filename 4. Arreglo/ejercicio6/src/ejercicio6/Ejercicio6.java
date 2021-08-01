/*
    Leer los datos correspondiente a dos tablas de 12 elementos
    numericos, y mezclarlos en una tercera de la forma: 3 de la tabla A
    3 de la B,otros 3 de la A, otros 3 de la B, etc.
 */
package ejercicio6;

import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        int[] tablaA = new int[12];
        int[] tablaB = new int[24];
        int[] tablaC = new int[24];
        int contadorA = 3,contadorB = 3,k=0,j=12;
        for(int i = 0;i<24;i++){
            if(i<12){
                tablaA[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero de tabla A "+(i+1)+" :"));
            }else
                if(i>=12){
                     tablaB[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero de tabla B " +(i+1)+" :")); 
                }
        }
        for(int i = 0;i<24 ;i++){
            if(contadorA != 0 && contadorB == 3){
                tablaC[i] = tablaA[k];
                k++;
                contadorA--;
            }else 
                if(contadorA == 0 && contadorB != 0){
                tablaC[i] = tablaB[j];
                j++;
                contadorB--; 
            }else if(contadorA == 0 && contadorB == 0){
                contadorB = 3;
                contadorA = 3;
                i--;
            }
        }
        for(int i = 0;i<24;i++){
            JOptionPane.showMessageDialog(null, "La tabla C esta conformada por : "+tablaC[i]);
        }
    }
    
}
