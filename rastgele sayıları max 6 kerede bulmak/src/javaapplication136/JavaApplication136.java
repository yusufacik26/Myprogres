/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication136;


import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author YusufOpens
 */
public class JavaApplication136 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
      Scanner ka=new Scanner(System.in);
      Random r= new Random();
      int a=r.nextInt(10)+1;
      int num;
      int sayac=0;
      while(sayac<6){
      num=ka.nextInt();
      sayac++;
      if(num==a)System.out.println("TEBRİKLER CEVABI BULDUNUZ"+a+" ve "+sayac+" kerede buldunuz");break;
    
      
      
      
      }
      if (sayac==6){
          System.out.println(a+" sayısı cevaptır maalesef bilemediniz");
          
                  }
      
                  
      
      }
      
      
   
    
    }  
    

