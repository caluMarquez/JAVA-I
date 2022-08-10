/*
 Crear un programa que dibuje una escalera de números, donde cada línea de
números comience en uno y termine en el número de la línea. Solicitar la altura de la
escalera al usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123

for (<inicialización>; <terminación>; <incremento>) {
<sentencias>
}
 */

package ejercicio30;

import java.util.Scanner;


public class ejercicio30 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero");
        int n,i,j;
        n = leer.nextInt();
        
        for(i=1 ; i<n+1 ; i++){
            System.out.println(" ");
        for(j=1 ; j<i+1 ; j++){
            System.out.print(+j);
        }}
        
    }
    
}
