/*Dado un tiempo en minutos, calcular su equivalente en días, horas y minutos. Por
ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente:
1 día, 2 horas y 40 minutos.*/


package ejercicio8;

import java.util.Scanner;


public class ejercicio8 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Ingrese la cantidad en minutos ");
        Scanner leer = new Scanner(System.in);
        
        int x,x1,x2,x3,aux;
        
        x = leer.nextInt() ;
        
        x1=(int)(x/1440);
        
        aux = x % 1440;
        
        x2 = (int) aux/60; 
        
        x3 = aux % 60;
        
        System.out.println(" La cantidad de minutos ingresada equivale a "+x1+" dias, con "+x2+" horas y "+x3+" minutos. ");
        
       
        
    }
    
}
