/*
 * Leer la altura de N personas y determinar el promedio de estaturas que se
 encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package ejercicio21;

import java.util.Scanner;

public class ejercicio21 {

    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Ingrese las alturas a promediar para finalizar ingrese 0");
        Scanner leer = new Scanner(System.in);

        double x, suma = 0, promedioa, promediob, aux = 0, contador = 0, contador2 = 0;

        do {
            x = leer.nextDouble();
            suma = suma + x;
            contador2 = contador + 1 ;
            if (x <= 1.60) {
                aux = aux + x;
                contador = contador + 1 ;
            }
        } while (x != 0);

        contador = contador-1;
        contador2=contador2-1;
        promedioa = aux / contador;
        promediob = suma / contador2;

        System.out.println("El promedio de estaturas que se encuentra por debajo del 1.60 ms es de " + promedioa);
        System.out.println("El promedio de estaturas en general es de " + promediob);

    }

}
