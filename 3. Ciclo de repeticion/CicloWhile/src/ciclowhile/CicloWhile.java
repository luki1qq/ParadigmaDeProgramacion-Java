/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclowhile;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class CicloWhile {

  
    public static void main(String[] args) {
        int i = 1;
        /* while(i<=10){
            System.out.println(i);
            i++;
        }*/
        
        /*do{
            i++;
            System.out.println(i);
        }while(i!=10);
        */
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite la cantidad de terminos: ");
        int contador;
        contador = entrada.nextInt();    
        for(i = 0;i<=contador;i++){
            System.out.println(i);
        }
    }
    
}
