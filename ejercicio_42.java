/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
pida al usuario un numero a buscar en el vector. El programa mostrará donde se
encuentra el numero y si se encuentra repetido
 */

package ejercicio43;

import java.util.Scanner;


public class ejercicio43 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Ingrese la dimension del vector");
        Scanner leer = new Scanner(System.in);
        int n=leer.nextInt();
        int v[]=new int [n]; 
        
        for (int i=0; i<n ; i++){
        v[i]=(int)(Math.random()*9+1); 
        
        }
        
        System.out.println("Ingrese el numero que quiere encontrar");
        int x = leer.nextInt();
        int c=0;
        
        for(int i = 0 ; i<n ; i++ ){
        if (v[i]==x){
            System.out.println("El numero "+x+" se encontro en el lugar "+(i+1)+" del vector ");
        c++;}
         
        }
        
        if (c>0){
            System.out.println(" El numero "+x+" se encontro "+c+" cantidad de veces repetido en el vector");}
    }
    
}
