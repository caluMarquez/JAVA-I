/*
 Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.
¿No te acordás los números romanos? Consultalos acá.
 */

package ejercicio15;

import java.util.Scanner;


public class ejercicio15 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Ingrese un numero entre 1 y 10 para conocer su equivalente en numero romano");
        int n; 
        Scanner leer = new Scanner(System.in);
        n=leer.nextInt();
        
        if (n<11 && n>0){
        switch (n){
            case 1: System.out.println(" I ");
                break;
            case 2: System.out.println(" II ");
                break;
            case 3: System.out.println(" III ");
                break;
            case 4: System.out.println(" IV ");
                break;
            case 5: System.out.println(" V ");
                break; 
            case 6: System.out.println(" VI ");
                break; 
            case 7: System.out.println(" VII ");
                break;    
            case 8: System.out.println(" VIII ");
                break;
            case 9: System.out.println(" IX ");
                break;
            case 10: System.out.println(" X ");
                break;    
        }} else {System.out.println("El numero ingresado no es correcto");}
    }
    
}

