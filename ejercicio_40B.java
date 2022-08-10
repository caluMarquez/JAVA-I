/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicioB41;

/**
 *
 * @author Cecilia
 */
public class ejercicioB41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        int v[]= {2,2,2,5};
        int v2[]= {2,2,2,5};
        boolean verificacion = true;
        
        for(int i = 0 ; i<v.length && verificacion;i++){
            
            
        if(v[i] == v2[i]){
          
       }else {
            verificacion=false;
            System.out.println("Los vectores son diferentes en la posicion "+(i+1));
        break;}
       
            
      }
        if (verificacion){ System.out.println("Los vectores son iguales");}
        
      }
        
    }
    
