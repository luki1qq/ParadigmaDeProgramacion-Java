
package ejercicio1;

import javax.swing.JOptionPane;


public class Ejercicio1 {
    // Pedir dos numeros y decir cual es el mayor o si son iguales.
    public static void main(String[] args) {
        int numero1,numero2;
        
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero : "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero  : "));
        if(numero1 > numero2){
            JOptionPane.showMessageDialog(null, "El numero mayor es "+numero1);
        }
        else if(numero2>numero1){
            JOptionPane.showMessageDialog(null, "El numero mayor es "+numero2);
        }else{
            JOptionPane.showMessageDialog(null, "Los numeros son iguales");
        }
        
    }
    
}
