
package ClasesYObjetos;

/**
 * Para crear una clase 1.
 * 1- Creamos nuestro proyecto.
 * 2- Creamos el paquete.
 * 3- Creamos la clase.
 */
public class Coche {
    // Atributos de mi clase.
    String color;
    String marca;
    int km;  
    // Creamos el metodo main.
    public static void main(String [] args){
        Coche coche1 = new Coche(); // Creamos 1 objeto.
        coche1.color = "blanco";
        coche1.marca = "Audi";
        coche1.km = 0;
        // Rellenamos los atributos de mi objeto.
        System.out.println("El color del coche 1 es: "+coche1.color);
        System.out.println("La marca del coche 1 es: "+coche1.marca);
        System.out.println("El kilometraje del coche es : "+coche1.km);
        Coche coche2 = new Coche(); // Creamos otro objeto y le agregamos nuevos atributos.
        coche2.marca = "Ferrari";
        coche2.km = 100;
        coche2.color = "Rojo";
        System.out.println("El color del coche 2 es : "+coche2.color);
        System.out.println("La marca del coche 2 es : "+coche2.marca);
        System.out.println("El kilometro dle coche 2 es : "+coche2.km);
        
    }
    
}
