/*
 Realice un programa para que el usuario adivine el resultado de una multiplicación
entre dos números generados aleatoriamente entre 0 y 10. El programa debe
indicar al usuario si su respuesta es o no correcta. En caso que la respuesta sea
incorrecta se debe permitir al usuario ingresar su respuesta nuevamente. Para
realizar este ejercicio investigue como utilizar la función Math.random() de Java.
 */

package ejercicio28;

import java.util.Scanner;


public class ejercicio28 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        double n1,n2,resultado,rta;
        int m,n;
        m=0;
        n=10;
               
        n1 = Math.floor(Math.random()*(n-m+1)+m);
        
        n2=Math.floor(Math.random()*(n-m+1)+m); 
        
        System.out.println("Adivina el producto entre dos numeros que estan entre 0 y 10 ");
        Scanner leer = new Scanner(System.in);
        
        resultado=n1*n2;
        
        do{
        rta= leer.nextInt();
        if (rta!=resultado){
            System.out.println("Fallaste! Intentalo de nuevo");}
        }while(rta!=resultado);
       
        System.out.println("Lo hiciste! Los numeros eran "+n1+" y "+n2);
    
}
}
