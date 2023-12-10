/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dizi.alıştırma;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author YusufOpens
 */
public class DiziAlıştırma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner k=new Scanner(System.in);
        int dizi[][]=new int[3][3];
        for(int i =0;i<=dizi.length-1;i++){
          for(int j=0;j<=dizi[0].length-1;j++){
          dizi[i][j]=k.nextInt();
          }
                
        } 
        for(int i =0;i<=dizi.length-1;i++){
          for(int j=0;j<=dizi[0].length-1;j++){
          
              System.out.print(dizi[i][j]+" ");
          }
        
            System.out.println("");
        
        
        }
      
       Random r =new Random();
        int array[][]=new int[3][4];
        for(int i =0;i<=array.length-1;i++){
          for(int j=0;j<=array[0].length-1;j++){
          array[i][j]=r.nextInt(100)+1;
              System.out.print(array[i][j]+" ");
          }
        
           System.out.println("");
        
        
        }
     
        
       
       
       
       
       
       
       
       
       
               
    }
    
}
