/*
 * Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere
el límite inicial.
 */

package ejercicio20;

import java.util.Scanner;

public class ejercicio20 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        int n,i,suma=0; 
        System.out.println("Ingrese el valor limite ");
        
        Scanner leer = new Scanner(System.in);
        n = leer.nextInt();
        
        do {
            System.out.println("Ingrese los valores a sumar ");
            i=leer.nextInt();
        suma=suma+i; 
           
        } while (suma <= n );
        
        if (suma >= n) System.out.println("La suma de los numeros ingresados es de "+suma);
    }
    
}
