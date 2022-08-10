/*Escribir un programa que pida dos números enteros por teclado y calcule la suma
de los dos. El programa deberá después mostrar el resultado de la suma*/

package ejercicio1;

import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        int numero1, numero2,suma;
        System.out.println("Escriba dos numeros enteros ");
        numero1=leer.nextInt();
        numero2=leer.nextInt();
        
        suma=numero1+numero2;
        
        System.out.println("La suma de ambos numeros es de "+suma);
    }
    
    
    
}
