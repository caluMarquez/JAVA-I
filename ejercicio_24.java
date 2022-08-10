/*

Escriba un programa que lea números enteros. Si el número es múltiplo de cinco
debe detener la lectura y mostrar la cantidad de números leídos, la cantidad de
números pares y la cantidad de números impares. Al igual que en el ejercicio
anterior los números negativos no deben sumarse. Nota: recordar el uso de la
sentencia break.


for (<inicialización>; <terminación>; <incremento>) {
<sentencias>
} 

 */

package ejercicio25;

import java.util.Scanner;


public class ejercicio25 {

  
    public static void main(String[] args) {
        // TODO code application logic here
        
          int num,c1=0,c2=0,c3=0;
           Scanner leer = new Scanner(System.in);  
        
        do{ 
            System.out.println("Ingrese un numero negativo o positivo, para detenerse ingrese un multiplo de 5 ");
       
          num = leer.nextInt(); 
        
        if(num > 0 ){
         c1=c1+1;
          
        
        if (num%2==0){
           c2 = c2+1;
        } else c3 = c3+1; 
        
        
        }} while (num%5!=0); 
        
        System.out.println("La cantidad de numeros ingresados positivos es de "+c1);
        System.out.println("La cantidad de numeros pares ingresados es "+c2);
        System.out.println("La cantidad de numero impares ingresados es "+c3);
    }
    
}
