/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 */

package ejercicio34;

import java.util.Scanner;


public class ejercicio34 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner leer = new Scanner(System.in); 
         int k,i,j,n,cont=0;
         
         do{
         System.out.println("Ingrese un numero ");
         n=leer.nextInt();
         if (n<1 || n>20 ){
             System.out.println("El numero es incorrecto, debe estar entre 1 y 20");
             
             continue;
             
         }else{
         cont++;
            System.out.print(+n);
                 for(i=0;i<n;i++){
                     System.out.print("*");}}
         
         }while(cont<4);
   
    
}
}
