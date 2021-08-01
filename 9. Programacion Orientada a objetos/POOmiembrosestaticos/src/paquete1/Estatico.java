/*
    Miembros estaticos de una clase
    Son los miembros que le pertenecen a la clase
    El static lo que realiza es que cada vez que cambiamos
    la variable en alguna de la instancias esta permanece
    en todos los objetos de la misma..
    Basicamente si yo lo cambio para un objeto, cambia para
    todos los objetos.
 */
package paquete1;

public class Estatico {
    public static int sumar(int n1,int n2){
        int suma = n1 + n2;
        return suma;
    }
    private static String frase = "Primera frase";
    public static void main(String [] args){
        Estatico ob1 = new Estatico();
        Estatico ob2 = new Estatico();
        ob2.frase = "Segunda frase";
        System.out.println(ob1.frase);
        System.out.println(ob2.frase);
        // Y Como la clase es dueña del atributo podemos
        // Realizar lo siguiente.
        System.out.println(Estatico.frase); // Como podras ver se ejecuta llamando
        // A la clase 
        // Los metodos estaticos pertenecen a la clase (static)
        System.out.println("La suma es : "+Estatico.sumar(3,4));
        
    }
}  
