/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algolabsoru3;

import java.util.Random;

/**
 *
 * @author YusufOpens
 */
public class Algolabsoru3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Random r =new Random();
         int top=0;
   int d[][]=new int[2][2];
    for(int i =0;i<d.length;i++){
     for(int j =0;j<d[i].length;j++){
      d[i][j]=r.nextInt(9)+1;
     }
    }  
     
    for(int i =0;i<d.length;i++){
     for(int j =0;j<d[i].length;j++){
         System.out.print(d[i][j]+" ");

     }
        System.out.println("");
    }  
   for(int i =0;i<d[0].length;i++){
     for(int j =0; j<d.length;j++){
      top+=d[j][i];
     
     
     }
       System.out.println(i+"sütunun toplam değeri "+top);
   
   
   }
    
   
   }
    
    
}
