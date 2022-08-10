/*
 Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package ejercicio42;
public class ejercicio42 {
public static void main(String[] args) {
        // TODO code application logic here
     
    int v1 [] = {3,60552,654,2,5426,90,3259,12548,12369,565};
    int aux=1,n,division;
    for (int i=0 ; i<v1.length;i++){
    
     if(v1[i]<10){aux=1;
         System.out.println("El número en la posición "+(i+1)+" : "+v1[i]+" tiene "+aux+" cifras");}
     else{
        
         n=v1[i];
         aux=1;
         
         do{
        
             division=n/10;
              aux++;
             n=division;
    
    }while(n>=10);
                
        System.out.println("El número en la posición "+(i+1)+" : "+v1[i]+" tiene "+aux+" cifras");
       
    }
    
    }
    
}
}