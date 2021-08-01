
package ClasesYObjetos;

public class Persona {
    // Atributos
    String nombre;
    int edad;
    String dni;
    /*
        Metodo constructor ,
    Cuando tenemos más de un constructor se le llama 
    sobrecarga de constructores.
    */
    public Persona(String nombre,int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    public Persona(String dni){
        this.dni = dni;
    }
    public void correr(){
        System.out.println("Soy "+nombre+", tengo "+edad+" años y estoy corriendo una maraton");        
    }
    public void correr(int km){
        System.out.println(" Ha corrido : "+km);
    }
}
