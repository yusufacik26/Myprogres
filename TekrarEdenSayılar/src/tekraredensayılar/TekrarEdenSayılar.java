/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tekraredensayılar;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author YusufOpens
 */
public class TekrarEdenSayılar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner k = new Scanner(System.in);
      Random r = new Random();
        System.out.println("Dizinin boyutunu giriniz ");
          int a = k.nextInt();
        int d[]= new int[a];  
        int count =0;  
        
        for(int i = 0; i<a;i++){
        d[i]=r.nextInt(100)+1;
        
        
        }
      for(int i = 0;i<a ; i++){
         for(int j = i;j<a;j++){
        if(d[i]==d[j])count++;
      
      }
          System.out.println(d[i]+" sayısı "+count + " kere geçmiştir");
      
      }
      
      
      
      
      
      
      
    }
    
}
