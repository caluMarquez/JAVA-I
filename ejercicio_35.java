/*
Crea una aplicación que a través de una función nos convierta una cantidad de
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
pasar que será una cadena, este no devolverá ningún valor y mostrará un mensaje
indicando el cambio (void).
El cambio de divisas son:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */

package EJERCICIO36;

import java.util.Scanner;


public class ejercicio36 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        double n;
        String tipo,i; 
        Scanner leer = new Scanner (System.in);
       
        System.out.println("Ingrese la cantidad de euros que desea cambiar ");
        n=leer.nextDouble();
        
        do{
            System.out.println("A) cambiar a libras B) cambiar a yenes C) cambiar a dólares ");
            tipo=leer.next();
            cambio(tipo,n);
            System.out.println("Desea continuar con otro cambio? S/N");
        i=leer.next();
        
        if (i.equals("N")){
        break;}
        
        }while(i.equals("S"));
    }
    public static void cambio(String tipo, double n){
    
        switch(tipo){
        case "A": {System.out.println("El valor de "+n+" euros en libras es de "+(n*0.86));
        break;}
        case "B": {System.out.println("El valor de "+n+" euros en yenes es de "+(n*129.852));
        break;}
        case "C": {System.out.println("El valor de "+n+" euros en dólares es de "+(n*1.28611));
        break;}
        
        }
    }
            
            
}
