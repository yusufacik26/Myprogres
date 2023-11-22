/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication97;

import java.util.Scanner;

/**
 *
 * @author YusufOpens
 */
public class JavaApplication97 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner k=new Scanner(System.in);
    
     System.out.println("Ne kadar sayı girmek istediğinizi girin...");
        int n=k.nextInt();
     
     System.out.println("Sayı giriniz");
  int a =k.nextInt();
  
  int ek=a;
  int eb=a;
     for(int i =1;i<n;i++){
         System.out.println("Sayı giriniz");
      a =k.nextInt();
     if(a<=ek) ek=a;
     if(a>=eb)eb=a;
     }
        System.out.println("En küçük sayı = "+ek);
        System.out.println("En büyük sayı = "+eb);
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
    }
    
}
