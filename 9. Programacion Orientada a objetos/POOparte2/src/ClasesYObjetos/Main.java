
package ClasesYObjetos;


public class Main {
    // Creamos un metodo main para crear un objeto de la clase
    // Operacion
    public static void main(String [] args){
        Operacion op = new Operacion(); // Creamos un objeto de la clase operacion.
        op.leerNumeros();
        op.sumar();
        op.restar();
        op.multiplicar();
        op.division();
        op.mostrarResultados();
    }
}
