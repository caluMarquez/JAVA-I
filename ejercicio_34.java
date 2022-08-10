/*
 Crea una aplicación que le pida dos números al usuario y este pueda elegir entre
sumar, restar, multiplicar y dividir. La aplicación debe tener una función para cada
operación matemática y deben devolver sus resultados para imprimirlos en el main.
 */

package ejercicio35;

import java.util.Scanner;


public class ejercicio35 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in); 
        double n1,n2; 
        String m;
                
        System.out.println("Ingrese dos numeros "); 
        n1=leer.nextDouble();
        n2=leer.nextDouble();
        
        do{
            System.out.println( "Elija las opciones A) SUMAR B) RESTAR C) MULTIPLICAR D)DIVIDIR, para salir ingrese 0" );
        m=leer.next();
        
        switch(m){
            case "A":{
                System.out.println("La suma entre "+n1+" y "+n2+" es de "+suma(n1,n2));
            continue;}
            case "B":{
                System.out.println("La resta entre "+n1+" y "+n2+" es de "+resta(n1,n2));
            continue;}
            case "C":{
                System.out.println("La multiplicacion entre "+n1+" y "+n2+" es de "+multiplicacion(n1,n2));
            continue;}
            case "D":{
                System.out.println("La division entre "+n1+" y "+n2+" es de "+division(n1,n2));
            continue;}
        }
        }while(!m.equals ("0"));
    }
    
   public static Double suma(double n1, double n2){
   
       double suma = n1 + n2; 
       return suma; 
   }
   public static Double resta(double n1, double n2){
   
       double resta = n1 - n2; 
       return resta; 
   }
   public static Double multiplicacion(double n1, double n2){
   
       double multiplicacion = n1 * n2; 
       return multiplicacion; 
   }
   public static Double division(double n1, double n2){
   
       double division = n1 / n2; 
       return division; 
   }
}
