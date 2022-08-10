/*Dada una cantidad de grados centígrados se debe mostrar su equivalente en
grados Fahrenheit. La fórmula correspondiente es: F = 32 + ( 9 * C / 5).*/

package ejercicio5;

import java.util.Scanner;


public class ejercicio5 {

     public static void main(String[] args) {
        // TODO code application logic here
         
         System.out.println("Ingrese la temperatura en grados C");
         
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
         Double n1,n2 ; 
         
         n1 = leer.nextDouble();
         
         n2 = 32 + (1.8 * n1); 
         
         System.out.println(" La temperatura en grados Fahrenheit es "+n2);
    }
    
}
