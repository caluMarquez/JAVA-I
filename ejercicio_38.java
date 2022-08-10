/*
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y
los muestre por pantalla en orden descendente.
 */

package ejercicio39;


public class ejercicio39 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n = 101;
        int vector[]=new int [100];
        
        for (int i = 0 ; i < 100 ; i++){
        vector[i]=n-i-1; 
        
            System.out.println("["+vector[i]+"]");}
        
    }
    
}
