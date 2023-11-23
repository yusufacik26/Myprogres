/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication109;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author YusufOpens
 */
public class JavaApplication109 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner k=new Scanner(System.in);

 Random r=new Random();
     int sayi=r.nextInt(49)+1;
       int sayac=0;
       int a ;
       do{
           System.out.println("Sayı tahmininiz");
        a =k.nextInt();
       
       if(a>sayi){System.out.println("sayıyı küçült");
       sayac++;
       
       }
       else if(a<sayi){
           System.out.println("Sayıyı büyüt ");
       sayac++;
       }
       
       
       
       
       }
    while(a!=sayi);
        System.out.println(sayac+". kerede buldunuz");
   
    
    
    
    
    
    
    
    }
       
       

       
    }
    
