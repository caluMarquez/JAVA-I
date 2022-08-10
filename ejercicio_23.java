/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
 */

package ejercicio24;

import java.util.Scanner;


public class ejercicio24 {


    public static void main(String[] args) {
        // TODO code application logic here
        
        int x,contador=0,suma=0 ;
        
        
        do {    
            System.out.println("Ingrese un numero positivo o negativo ");
              Scanner leer = new Scanner(System.in); 
              x=leer.nextInt();
              contador=contador+1;
              
              if (x > 0 ) {
                  suma = suma + x ; 
                  
               }
              
               if (x==0){ System.out.println("Se capturo el numero cero");
               break;}
              
              
        } while (contador<20 );
     
       System.out.println("La suma de los numeros positivos es de "+suma);
        
    }
    
}
