/*Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a
cada una. A continuación, realizar las instrucciones necesarias para que: B tome el
valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar
los valores iniciales y los valores finales de cada variable. Utilizar sólo una variable
auxiliar.*/

package ejercicio9;


public class ejercicio9 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        int A=2,B=4,C=6,D=8,AUX;
        
        System.out.println(A+" "+B+" "+C+" "+D);
        
        AUX = B;
        B=C;
        C=A;
       A=D;
       D=AUX;
        
        System.out.println(A+" "+B+" "+C+" "+D);
        
    }
    
}
