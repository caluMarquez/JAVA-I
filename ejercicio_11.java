/*
 * Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.
 */

package ejercicio12;

import java.util.Scanner;


public class ejercicio12 {

  
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Ingrese la contraseña");
        String x; 
       Scanner leer=new Scanner(System.in).useDelimiter("\n");
       
       x = leer.next(); 
       
       if (x.equals("eureka")){
           System.out.println("La contraseña es correcta");
       } else { System.out.println("La contraseña es incorrecta");
    }
    
}
}
     