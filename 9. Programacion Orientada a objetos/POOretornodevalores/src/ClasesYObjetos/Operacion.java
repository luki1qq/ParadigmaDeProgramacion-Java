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
    public int restar(int numero1,int numero2){
        int resta = numero1 - numero2;
        return resta;
    }
    public int multiplicar(int numero1,int numero2){
        int multiplicar = numero1 * numero2;
        return multiplicar;
    }
    public int sumar(int numero1,int numero2){
        int sumar = numero1 + numero2;
        return sumar;
    }
    public int division(int numero1,int numero2){
        int division = numero1+numero2;
        return division;
    }
    public void mostrarResultados(int sumar,int resta, int multiplicacion, int division){
        System.out.println("La suma es : "+sumar);
        System.out.println("La resta es : "+resta);
        System.out.println("La multiplicacion es : "+multiplicacion);
        System.out.println("La Division es : "+division);
        
    }
}
