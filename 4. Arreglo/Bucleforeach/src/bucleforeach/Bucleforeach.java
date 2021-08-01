
package bucleforeach;

/**
 *
 * @author lucas
 */
public class Bucleforeach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] nombres = {"Alejandro","Maria","Juan","Luis"};
        /*for(int i = 0;i<4;i++){ // Si queremos saber el numero de elementos que tiene nuestro 
            // Arreglo podemos utilizar el lenght.(nombredelarreglo) <- Devuelve un int.
            System.out.println(nombres[i]);
        }*/
        /* Utilizacion del bucle for each
        */
        for(String i:nombres){ //Tipo de dato- variable - : -nombredelarreglo
            System.out.println("Nombre : "+i);
    }
    
}
