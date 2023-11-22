/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication107;

import java.util.Scanner;

/**
 *
 * @author YusufOpens
 */
public class JavaApplication107 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("BİR SAYI GİR");
        int a =kb.nextInt();
       int sayac =0;
        for(int i=2;i<a;i++){
          for(int j=2;j<i;j++){
          if(i%j==0)sayac++;
          
          }      
            if(sayac==0)System.out.println(i);  
        sayac=0;
        }
        
        
        
        
        
        
        
        
        
    }
    
}
