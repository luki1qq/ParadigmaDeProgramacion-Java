//Encapsulamiento y metodos accesores (Getters y setters)

// Setters: set(establecer) -> se utiliza para establecer un valor
// get : get(acceder) -> Se utiliza para acceder al valor de tu atributo
package paquete1;


public class Clase1{
    private int edad;  // Al estar privado solo puede ser accedido por esta clase.
    private String nombre;
    public void setEdad (int edad){
        this.edad = edad;  // De esta forma podemos acceder a edad mediante el metodo setter.
    }
    // Para mostrar el atributo utilizamos un metodo llamado getter
    public int getEdad(){
        return edad;
    }
    // Si queremos que netbeans nos cree el codigo getter y setter lo que debemos hacer
    /* Es apretar segundo click insert code y seleccionar getter y setter. */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
