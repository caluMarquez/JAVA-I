/*
 Realizar un algoritmo que calcule la suma de todos los elementos de un vector de
tamaño N, con los valores ingresados por el usuario.
 */

package ejercicio40;

import java.util.Scanner;


public class ejercicio40 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
       
        int n,suma=0;
        System.out.println("Ingrese la dimension del vector");
        Scanner leer = new Scanner(System.in);
        n=leer.nextInt();
        int vector []=new int[n];
        
        for(int i = 0 ; i<n ; i++){
            System.out.println("Para la posicion "+(i+1)+" ingrese un valor numerico.");
        vector[i]=leer.nextInt();
        suma=suma+vector[i];
        
        }
        
        System.out.println("Los valores del vector suman "+suma);
    }
    
}
