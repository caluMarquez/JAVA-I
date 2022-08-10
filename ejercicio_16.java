/*
Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
descuento en todos los tipos de tratamientos odontológicos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
descuento para los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre
dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real
que represente el costo del tratamiento (previo al descuento) y determine el importe
en efectivo a pagar por dicho socio.
 */

package ejercicio17;

import java.util.Scanner;


public class ejercicio17 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        System.out.println("Ingrese A - B - C para identificar rango de socio");
        String rango; 
        
     Scanner leer = new Scanner(System.in);
     
     rango = leer.next();
     
        System.out.println(" Ingrese valor sin el signo $ del tratamiento");
        
        int x;
        double i;
        
        x = leer.nextInt();
        
        switch(rango){
            case "A": 
        i = x * 0.5 ; 
                System.out.println("El valor a pagar es de $"+i);
                break;
            case "B": 
              i = x * 0.35 ; 
              i = x - i ;
                System.out.println("El valor a pagar es de "+i);
                break;
            case "C": 
                System.out.println("El valor a pagar es $"+x);
                break;
                
        }}
        
        
    

    }