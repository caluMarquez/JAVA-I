/*Escribir un programa que lea un número entero por teclado y muestre por pantalla
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().*/

package ejercicio7;

import java.util.Scanner;

public class ejercicio7 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Ingrese un numero entero ");
        int x; 
        
        Scanner leer = new Scanner(System.in);
        
        x = leer.nextInt();
        
        double x1,x2,x3; 
        
        x1 = x * 2; 
        x2 = x * 3 ; 
        x3 = Math.sqrt(x); 
        
        System.out.println(" El doble de su numero es " +x1 );
         System.out.println(" El triple de su numero es " +x2 );   
          System.out.println(" La raíz cuadrada de su numero es " +x3 );
          
    }
    
}
