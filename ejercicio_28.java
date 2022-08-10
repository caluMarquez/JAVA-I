/*
 Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el
operador de división. Nota: recordar que las variables de tipo entero truncan los
números o resultados.
 */

package ejercicio29;

import java.util.Scanner;


public class ejercicio29 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        int numero,contador=1; 
        numero=leer.nextInt();
        
        do{
        numero=numero/10;
        contador++;
        }while(numero>10);
        
        System.out.println("La cantidad de cifras de su numero es "+contador);
    }
    
}
