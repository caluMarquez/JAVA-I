/*
 Implementar un programa que dado dos números enteros determine cuál es el
mayor y lo muestre por pantalla.
 */

package ejercicio10;



import java.util.Scanner;

public class ejercicio10 {

  
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n,nn,max=0; 
        System.out.println("Ingrese dos numeros enteros ");
        Scanner leer = new Scanner(System.in);
        
        n= leer.nextInt();
        nn= leer.nextInt();
        
        if (n==nn){
            System.out.println("Los numeros ingresados son iguales");
    }
        
        else if(n>nn){
           max=n;
           System.out.println("El numero mayor es "+max);
       } else {
           max=nn;
           System.out.println("El numero mayor es "+max);
       }
        
    }
    
}
