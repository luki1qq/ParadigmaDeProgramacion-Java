
package ejercicio.pkg5;

import javax.swing.JOptionPane;

public class Ejercicio5 {
    // Construir un programa que simule el funcionamiento de una calculadora que
    // puede realizar las cuatros operaciones aritmeticas basicas (Suma,resta,producto
    // y division) con valores numericos enteros. El usuario debe especificar la operacion.
    // con el primer caracter del primer parametro de la linea de comandos: S o s 
    // para la suma, R o r para la resta, P,p,M o m para el producto y D o d para la division.
    public static void main(String[] args) {
        int numero,numero2,suma,resta,mult,div;
        char operacion;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero : "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero : "));
        operacion = JOptionPane.showInputDialog("Digite la opearcion que desea realizar : ").charAt(0);
        //charAt 0 toma el primer caracter.
        switch(operacion){
            case 's':   // el caracter lo debemos poner con comilla simple.
                //Como no se le puso un brake a este, lo va a evaluar a los dos de la misma manera.
            case 'S': suma = numero+numero2;
                      JOptionPane.showMessageDialog(null, "La suma es :"+suma);
                      break;
            case 'r':
            case 'R': resta = numero-numero2;
                      JOptionPane.showMessageDialog(null, "La resta es : "+resta);
                      break;
            case 'p':
            case 'P':
            case 'm':
            case 'M': mult = numero*numero2;
                      JOptionPane.showMessageDialog(null, "La multiplicacion es : "+mult);
                      break;
            case 'd':
            case 'D': div = numero/numero2;
                      JOptionPane.showMessageDialog(null, "La division es: "+div);
                      break;
            default: JOptionPane.showMessageDialog(null, "Error, valor equivado");
        }
    }
    
}
