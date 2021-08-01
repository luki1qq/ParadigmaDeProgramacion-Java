
package ejercicio6;
// Hacer un programa que simule un cajero automatico con un saldo inicial de 
// $1000 dolares, con el siguiente menu de opciones :

import javax.swing.JOptionPane;

// 1. Ingresar dinero a la cuenta.
// 2. Retirar dinero de la cuenta.
// 3. Salir.



public class Ejercicio6 {

    
    public static void main(String[] args) {
        final int saldo_inicial = 1000; //Constante 
        int opcion;
        float ingreso,saldoActual,retiro;
        
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenedio a su cajero automatico: \n"
        + "1. Ingresar dinero a la cuenta\n"
        + "2. Retirar dinero de la cuenta\n"
        + "3. Salir"));
        
        switch(opcion){
                case 1: ingreso = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad que desea ingresar en cuenta : "));
                        saldoActual = saldo_inicial + ingreso;
                        JOptionPane.showMessageDialog(null, "Dinero en cuenta : "+saldoActual);
                        break;
                case 2: retiro = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad que desea retirar : "));
                        
                    if(retiro>saldo_inicial){
                        JOptionPane.showMessageDialog(null, "No cuenta con el saldo suficiente");
                        
                    }else{
                        saldoActual = saldo_inicial - retiro;
                        JOptionPane.showMessageDialog(null, "Dinero en cuenta : "+saldoActual);
                    }
                case 3: break;
                default: JOptionPane.showMessageDialog(null, "El numero ingresado no es valido ");
        }   
    }
    
}
