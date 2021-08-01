
package paquete2;
// Si queremos instanciar un objeto de una clase que no esta
// En este pauqete se utiliza lo siguiente.

import paquete1.Clase1;

public class Clase3 {
    public static void main(String [] args){
        Clase1 Objeto1 = new Clase1();
        Objeto1.atributoo1 = 15;
        Objeto1.atributo1 = 15; // <- Ver , Al tener un modificador de acceso por defecto, no nos dejara iniciar
        // Desde una clase que no se encuentra en el mismo paquete.
    }
}
