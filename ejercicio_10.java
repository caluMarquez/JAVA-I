/*
Crear un programa que dado un numero determine si es par o impar.
 */

package ejercicio11;

import java.util.Scanner;

public class ejercicio11 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        int n ; 
        System.out.println("Ingrese un número entero");
        Scanner leer = new Scanner(System.in);
        
        n=leer.nextInt();
        
        if (n%2==0){
            System.out.println("El número ingresado es par");
        } else { System.out.println("El número ingresado es impar");
    }
    
    }
}