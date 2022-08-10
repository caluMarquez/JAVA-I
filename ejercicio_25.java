/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
tipo de dispositivo lee caracteres enviados por un sensor. Las lecturas se realizan
de a 5 caracteres (buffer) por vez, los cuales deben llegar con un formato fijo: el
primer carácter tiene que ser X y el último tiene que ser 0.
Las secuencias leídas que respeten el formato se consideran correctas, la
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
secuencia distinta de FDE que no sea correcta se considera inválida. Al finalizar el
proceso, se imprime un informe indicando la cantidad de lecturas correctas e
inválidas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring() y Length().
 */

package ejercicio26;

import java.util.Scanner;


public class ejercicio26 {
  
 
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        int c1=0,c2=0;
        String n,i,j; 
        
        do { System.out.println("Ingrese la secuencia");
       n=leer.next();
       if(n.length()==5){
       i = n.substring(0, 1); 
       j= n.substring(4,5); 
       
        if (i.equals("X") && j.equals("0")){
            c1++ ;
        }else {c2++;}
     
        }}while(!n.equals("&&&&&"));
                
        System.out.println("Correctas "+c1);
        System.out.println("Incorrectas "+c2);
        
    }
    
}
