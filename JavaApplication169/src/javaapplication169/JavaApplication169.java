/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication169;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author YusufOpens
 */
public class JavaApplication169 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Random r= new Random();
        Scanner k =new Scanner(System.in);
      int d1[]=new int[10];
      int dt[]=new int[10];
       int count =0;
      for(int i =0;i<4;i++){
       d1[i]=r.nextInt(12)+1;
             
      }
         for(int i =0;i<4;i++){
          if(d1[i]%2!=0) {
              dt[count]=d1[i];
             count++; 
          }
        
         }
        System.out.println("TEK SAYILARI İÇEREN DİZİNİN ELEMANLARI");
         for(int i =0;i<count;i++){
             System.out.println(i+1+". eleman "+dt[i]);
             
         }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
