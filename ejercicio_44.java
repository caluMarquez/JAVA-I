/*
 Los profesores del curso de programación de Egg necesitan llevar un registro de las
notas adquiridas por sus 10 alumnos para luego obtener una cantidad de
aprobados y desaprobados. Durante el periodo de cursado se obtienen 4 notas, 2
por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de cada
nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%

Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final
del programa los profesores necesitan obtener por pantalla la cantidad de
aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos
con promedio mayor o igual al 70% de sus notas del curso.
 */

package ejercicio45;

import java.util.Scanner;


public class ejercicio45 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        int vector[]=new int [3];
        int n1,n2,n3,n4;
        Scanner leer = new Scanner (System.in);
        int c=0,cc=0;
        for (int i = 0 ; i <3 ; i++){
        
            System.out.print("Para el alumno "+(i+1)+" ingrese Nota 1 ");
            n1=leer.nextInt();
            System.out.print("Para el alumno "+(i+1)+" ingrese Nota 2 ");
            n2=leer.nextInt();
            System.out.print("Para el alumno "+(i+1)+" ingrese Nota 3 ");
            n3=leer.nextInt();
            System.out.print("Para el alumno "+(i+1)+" ingrese Nota 4 ");
            n4=leer.nextInt();
        
            vector[i]=(int)(((n1*0.10)+(n2*0.15)+(n3*0.25)+(n4*0.50)));
            
           if(vector[i]<7) {c++;
           } else{cc++;}
           }
        
        System.out.println("La cantidad de estudiantes aprobados es de "+cc);
        System.out.println("La cantidad de estudiantes desaprobados es de "+c);
        }
        
        
    }
    

