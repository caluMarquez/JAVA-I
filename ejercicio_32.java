/*
 Se dispone de un conjunto de N familias, cada una de las cuales tiene una M
cantidad de hijos. Escriba un programa que pida la cantidad de familias y para cada
familia la cantidad de hijos para averiguar la media de edad de los hijos de todas las
familias.

 */

package ejercicio33;

import java.util.Scanner;


public class ejercicio32 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        int hi,n,aux=0;
        
        System.out.println("Ingrese la cantidad de familias ");
        Scanner leer = new Scanner(System.in);
        n=leer.nextInt();
        
        for (int i = 1; i < n+1; i++) {
                
                System.out.println("Ingrese numero de hijos de la familia "+i);
                hi = leer.nextInt();
                aux=aux+hi;
        }
 
            System.out.println("El promedio de hijos por familia es de "+(aux/n));
       
    }
    
}
