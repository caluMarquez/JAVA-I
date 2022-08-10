/*
 Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una
vocal. Caso contrario mostrar un mensaje.
 */

package ejercicio16;

import java.util.Scanner;


public class ejercicio16 {

  
  
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Ingrese una letra ");
        String letra; 
        Scanner leer = new Scanner(System.in); 
        
       letra = leer.next();
       
     
       switch (letra) {
          case "a" : System.out.println("Es una vocal  ");
              break;
          case "e" : System.out.println("Es una vocal  ");
              break;
          case "i" : System.out.println("Es una vocal  ");
              break;
          case "o" : System.out.println("Es una vocal  ");
              break;
          case "u" : System.out.println("Es una vocal  ");
              break;
              
          default : System.out.println("No es una vocal  ");
              break;
     }
    }
}

        
