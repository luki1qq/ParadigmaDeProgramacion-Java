
package ClasesYObjetos;

public class Persona {
    //Atributos
    String nombre;
    int edad;
    
    //Metodos 
    /*
        El primer metodo que se realizan en una clase es el
    constructor, Recordemos las caracteristicas que tiene
    - Debe ser publico
    - No devuelve ningun valor (Es decir no tiene ningun valor de retorno)
    - Se pone el mismo nombre que el de la clase
    */
    //Metodo constructor
    public Persona(String _nombre,int _edad){
        nombre = _nombre;
        edad = _edad;
        
    }
    // Se puede utilizar de esta manera tambien..
    /*
        Lo que difiere es que en el primero podemos utilizar _, 
         en lugar de utilizar la palabra reservada this (Ya que si utilizamos
    Solamente nombre y nombre = nombre java se confunde..
        public Persona(String nombre,int edad){
        this.nombre = nombre;
        this.edad = edad;
    } Se utiliza el this para marcar el atributo 
    */
    public void mostrarDatos(){
        System.out.println("El nombre es : "+nombre);
        System.out.println("La edad es : "+edad);
    }
}
