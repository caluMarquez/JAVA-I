/*
 Realizar un programa que pida introducir solo frases o palabras de 8 de largo. Si el
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje
por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Lenght() en Java.
 */

package ejercicio13;

import java.util.Scanner;


public class ejercicio13 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Ingrese una frase o palabra de 8 caracteres de largo");
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        String texto;
        texto = leer.nextLine();
        int cantidad; 
        cantidad = texto.length();
        
        if (cantidad==8){System.out.println("CORRECTO");}
        else {System.out.println("INCORRECTO");}
    }
    
}
