/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication110;

import java.util.Scanner;

/**
 *
 * @author YusufOpens
 */
public class JavaApplication110 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner k=new Scanner(System.in);
        System.out.println("Büyük sayıyı gir");
      int num1=k.nextInt();
      int num3=num1;
        System.out.println("Küçük sayıy girin");
      int num2=k.nextInt();
      int count=0; 
  while(num1>=num2){
  num1-=num2;
  count++;
  
  }
     System.out.println(num2+" sayısı "+num3+" sayısının içinde "+count+" kadar vardır");
      
     
      
      
      
      
      
      
    }
    
}
