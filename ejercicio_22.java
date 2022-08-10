/*
Realizar un programa que pida dos números enteros positivos por teclado y
muestre por pantalla el siguiente menú:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
 */

package ejercicio23;

import java.util.Scanner;


public class ejercicio23 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        double n1,n2;
        String l;
        int menu;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresar dos numero naturales positivos ");
        n1 = leer.nextDouble();
        n2 = leer.nextDouble();
        l="N";
        
        do{  
            System.out.println("Ingrese opción de menu. 1) SUMAR 2) RESTAR 3) MULTIPLICAR 4) DIVIDIR 5) SALIR");
        menu = leer.nextInt();
        switch (menu){
            case 1 : System.out.println("La suma de ambos valores es de "+(n1+n2));
                continue;
            case 2 : System.out.println("La resta de los valores es de "+(n1-n2));
                continue;
            case 3 : System.out.println("La multiplicacion de los valores es de "+(n1*n2));
                continue;
            case 4 : System.out.println("La division de los valores es de "+(n1/n2));
                continue;
            case 5 : System.out.println("Esta segure que desea salir del proframa? S/N");
                l = leer.next();
         if (l.equals ("S")) { System.out.println("Se procedera a salir");
                break; }
          
            
         
        }}while (menu < 5 || l.equals ("N") );
      
                
       }
    }
    

