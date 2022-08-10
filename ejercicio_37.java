/*
 Crea una aplicación que nos pida un número por teclado y con una función se lo
pasamos por parámetro para que nos indique si es o no un número primo, debe
devolver true si es primo sino false.
Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25
no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.

 */

package ejercicio38;

import java.util.Scanner;


public class ejercicio38 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        int n;
        String i;
        System.out.println("Ingrese un numero para saber si es primo ");
        
        
        do{
        n=leer.nextInt();
        resultado(n);
        System.out.println("Quiere ingresar un nuevo numero? S/N ");
           i=leer.next();
                if (i.equals("N")){
                    break;} 
                else{System.out.println("Ingrese otro numero");}
                
        }while(i.equals("S"));
    }
    
    public static void resultado(int n){
    
        if ((n%2)*1==0){
            System.out.println(" El numero "+n+" es primo");}
        else{
            System.out.println("El numero "+n+" no es primo");}
       
    }
    
}
