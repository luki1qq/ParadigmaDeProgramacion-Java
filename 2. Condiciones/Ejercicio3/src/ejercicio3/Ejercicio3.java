
package ejercicio3;

import javax.swing.JOptionPane;

public class Ejercicio3 {

    // Ejercicio 3: En MegaPlaza se hace un 20% de descuento a los clientes
    //Cuya compra supere los $300. ¿ Cual será la cantidad que pagará una 
    // una persona por su compra?
    public static void main(String[] args) {
        float ingreso;
        ingreso = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de su compra : "));
        // Tambien podriamos haber utilizado un float, y nuestro ingreso quedara de la siguiente manera.
        // ingreso = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de su compra : "));
        if(ingreso > 300){
            JOptionPane.showMessageDialog(null, "Su compra se hara con descuento 20%");
            ingreso = ingreso * 0.8f;
            JOptionPane.showMessageDialog(null, "El valor que pagara será "+ ingreso);
        }
        else{
            JOptionPane.showMessageDialog(null, "Debera pagar por su compra "+ ingreso);
        }
    }
    
}
