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
 
      Scanner ka=new Scanner(System.in);
     int a;
     int poz=0;
     int neg=0;
       int yedi=0;
      for(int i =0;i<25;i++){
     a=ka.nextInt();
     if(a==7)yedi++;
     else if(a>0) poz++;
     else if (a<0) neg++;
     
     }
        System.out.println("Pozitif sayı adedi = "+poz);
         System.out.println("Negatif sayı adedi = "+neg);
        System.out.println("7 sayısı adedei = "+yedi);
    
    
    }  
    
}
