/*Dada las horas trabajadas de una persona y el valor por hora. Calcular su salario e
imprimirlo. Salario = Hs. trabajadas * valor por hora*/

package ejercicio6;

import java.util.Scanner;


public class ejercicio6 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Ingrese las horas trabajdas por dia");
        
        Double horas,valor,pago; 
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        horas = leer.nextDouble();
        System.out.println("Ingrese el valor por hora ");
        
        valor = leer.nextDouble();
        
        pago = valor*horas ; 
        
        System.out.println("El pago por dia es de $ "+pago);
        
        
    }
    
}
