/*
 Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).
 */

package ejercicio41;

import java.util.Scanner;


public class ejercicio41 {

    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Defina la dimension de los vectores A y B ");
        int n ;
        Scanner leer=new Scanner(System.in);
        n = leer.nextInt();
        
        int v1[]=new int[n];
        int v2[]=new int[n];
        boolean iguales = true; 
        
    
        for(int i = 0 ; i<n ; i++){
            
           v1[i]=(int)(Math.random()*10); 
           
            System.out.print("["+v1[i]+"]");
            
        v2[i]=(int)(Math.random()*10);
        
        System.out.print("["+v2[i]+"]");
        }
        
       for(int k = 0 ; k <v1.length && iguales ; k ++){
        if (v1[k] != v2[k]){
            
        iguales=false;}if (iguales){
            
            System.out.println("Los vectores son iguales");
    break;
    }else{ System.out.println("Los vectores no son iguales ");}}
   
    
    
    
        
}
}