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
      Random r=new Random();
      Scanner k=new Scanner(System.in);
     int sayac=0;
     int a =0;
     int  ran=r.nextInt(100)+901;
     while(a!=ran){
     
        System.out.println("Bir sayı girin");
        a=k.nextInt();
      if(a>ran) 
      { System.out.println("Sayınızı küçültün");
      
      }
     else if (ran>a){ System.out.println("Sayınızı büyütün");
      sayac++;}
     else break;
     }
      
        System.out.println(sayac+" kerede buldunuz");
      
    }
    
}
