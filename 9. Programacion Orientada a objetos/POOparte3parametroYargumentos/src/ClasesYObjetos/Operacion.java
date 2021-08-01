/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesYObjetos;

/**
 *
 * @author lucas
 */
public class Operacion {
    //Atributos
    int suma;
    int resta;
    int multiplicacion;
    int division;
    // Declaramos parametros en los metodos
    public void sumar(int numero1,int numero2){
        suma = numero1+numero2;
    }
    public void restar(int numero1,int numero2){
        resta = numero1 - numero2;
    }
    public void multiplicar(int numero1,int numero2){
        multiplicacion = numero1 *numero2;
    }
    public void dividir(int numero1,int numero2){
        division = numero1 / numero2;
    }
    public void mostrarResultados(){
        System.out.println("La suma es : "+suma);
        System.out.println("La resta es : "+resta);
        System.out.println("La multiplicaion es : "+multiplicacion);
        System.out.println("La division es : "+division);
        
    }
}
