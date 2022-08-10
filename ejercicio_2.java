/*Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre
por pantalla.*/

package ejercicio2;

import java.util.Scanner;


public class ejercicio2 {

 
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Esribe tu nombre");
        
       Scanner leer = new Scanner (System.in).useDelimiter("/n");
       
       String nombre; 
       
       nombre = leer.next();
       
        System.out.println("Su nombre es "+nombre);
       
    }
    
}
