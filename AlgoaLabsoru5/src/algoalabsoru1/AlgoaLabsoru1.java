/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoalabsoru1;

import java.util.Random;

/**
 *
 * @author YusufOpens
 */
public class AlgoaLabsoru1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Random r =new Random();
   int d[][]=new int[3][3];
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
 for(int i =0;i<d.length;i++){
     for(int j =0;j<d[i].length;j++){
      int i1=(int)(Math.random()*d.length);
      int j1 =(int)(Math.random()*d[i].length);
      int temp=d[i][j];
      d[i][j]=d[i1][j1];
      d[i1][j]=temp;
     }
     System.out.println("--------------------------");
    }  
     for(int i =0;i<d.length;i++){
     for(int j =0;j<d[i].length;j++){
         System.out.print(d[i][j]+" ");

     }
        System.out.println("");
    }  
    
    }

}







    
    
