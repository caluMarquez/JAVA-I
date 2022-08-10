/*
 *Escriba un programa que pida una frase o palabra y valide si la primera letra de esa
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java. 

 */

package ejercicio14;

import java.util.Scanner;


public class ejercicio14 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingrese una frase que comience con A mayuscula");
        String frase;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        frase=leer.nextLine();
        
        if (frase.substring(0,1).equals("A")) {System.out.println("CORRECTO");}
        else {System.out.println("INCORRECTO");}
    }
    
}
