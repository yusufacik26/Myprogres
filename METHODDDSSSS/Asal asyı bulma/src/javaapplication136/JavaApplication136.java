/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication136;


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
 
      Scanner k=new Scanner(System.in);
      int num=k.nextInt();
      int sayac=0;
      for(int i=2;i<num;i++){
      if(num%i==0)sayac++;
      
      
      
      
      }
      if(sayac==0)System.out.println(num+"  asal sayıdır");
      else System.out.println("Sayı asal sayı değil");
      
      
      
      
      
    }
    
}
