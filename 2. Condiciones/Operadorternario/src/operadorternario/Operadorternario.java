
package operadorternario;

import javax.swing.JOptionPane;

public class Operadorternario {

    public static void main(String[] args) {
        //System.out.println("Hola mundo"); // con sout y tabulador realiza lo mismo.
        int numero;
        String mensaje;
        // El joptionpage te entrega un string.
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero : "));
        
        mensaje = (numero %2==0) ? "Es par" : "Es impar";  // Cumple la primera condicion si es verdadera.
        // O cumple la segunda condicion si es falsa, es decir se queda una de las dos.
        JOptionPane.showMessageDialog(null, mensaje); // Te muestra el mensaje
                
    }
    
}
