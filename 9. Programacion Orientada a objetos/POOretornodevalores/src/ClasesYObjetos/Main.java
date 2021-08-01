
package ClasesYObjetos;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String [] args){
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero : "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero : "));
        Operacion op = new Operacion();
        int suma = op.sumar(n1, n2);
        int resta = op.restar(n1, n2);
        int division = op.division(n1, n2);
        int multiplicacion = op.multiplicar(n1, n2);
        op.mostrarResultados(suma, resta, multiplicacion, division);
    }
    
}
