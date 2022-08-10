/*Escribir un programa que pida una frase y la muestre toda en mayúsculas y
después toda en minúsculas. Nota: investigar la función toUpperCase() y
toLowerCase() en Java.*/

package ejercicio3;

import java.util.Scanner;


public class ejercicio3 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Por favor ingrese una frase");
        String  frase ; 
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
                
                frase = leer.next();
                System.out.println(frase.toUpperCase());
                System.out.println(frase.toLowerCase());
    }
    
}
