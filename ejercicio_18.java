/*
 *Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
la nota se pedirá de nuevo hasta que la nota sea correcta.
 */

package ejercicio19;

import java.util.Scanner;


public class ejercicio19 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        int nota; 
        do{
        System.out.println("Ingrese una nota del 1 al 10");
        Scanner leer = new Scanner(System.in);
        nota = leer.nextInt();
        if (nota>10 || nota < 1 ){
            System.out.println(" La nota no esta entre 1 y 10 ingresela de nuevo");}
        } while (nota >10 || nota < 1);
        
        System.out.println("La nota "+nota+" es correcta");
    }
}

         