/*
Crear una función rellene un vector con números aleatorios, pasándole un arreglo
por parámetro. Después haremos otra función o procedimiento que imprima el
vector.
 */

package ejercicio44;

import java.util.Scanner;


public class ejercicio44 {


    public static void main(String[] args) {
        // TODO code application logic here
        
      
        Scanner leer = new Scanner(System.in);
        int n = leer.nextInt();
        int v[]=new int [n];
        
        relleno(v,n);
        impresion(v,n);
    }
   
    public static void relleno(int v[], int n){
    
        for (int i = 0 ; i < n ; i++){
            
            v[i]=(int)(Math.random()*100+1);
            
        }
    
    }
    
    public static void impresion(int v[], int n){
    for (int i = 0 ; i < n ; i++){
        System.out.print("["+v[i]+"]");
    }
    }
}
