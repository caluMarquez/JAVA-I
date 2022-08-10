/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
promedio de n números (n>0). El valor de n se solicitará al principio del programa y
los números serán introducidos por el usuario. Realice dos versiones del programa,
una usando el bucle “while” y otra con el bucle “do - while”.
 */

package ejercicio22;

import java.util.Scanner;


public class ejercicio22 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Ingrese la cantidad de numero a leer ");
        Scanner leer = new Scanner(System.in);
        int n,i,max,min;
        double suma,contador=1;
        n=leer.nextInt();
        System.out.println("Ingrese un numero ");
        i = leer.nextInt(); 
        
      suma=i;
       max=i;
       min=i; 
                      
      do{ System.out.println("Ingrese un numero ");
      i=leer.nextInt();
        
        contador = contador+1;
        suma=suma+i;
        
        if (i>max){
        max = i ;
               } if (i<min ) 
                   min=i;
        
        }while (contador < n  );
        
       
        System.out.println("El promedio de los numeros ingresados es de "+(suma/n));
        System.out.println("El maximo de los numeros ingresados es de "+max);
        System.out.println("El minimo de los numeros ingresados es de "+min);


        
        
    }
    
}
