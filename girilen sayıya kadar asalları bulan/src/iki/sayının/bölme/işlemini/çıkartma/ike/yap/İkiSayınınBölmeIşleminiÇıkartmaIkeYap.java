/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iki.sayının.bölme.işlemini.çıkartma.ike.yap;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author YusufOpens
 */
public class İkiSayınınBölmeIşleminiÇıkartmaIkeYap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int a =kb.nextInt();
       int sayac=0;
       for(int i=2;i<a;i++){
       sayac=0;
         for(int j=2;j<i;j++){
            if(i%j==0)sayac++;
       }
       if(sayac==0)System.out.print(i+" ");
       
       }
        
        
        
        
        
        
        
        }

    
    
    
    
    
    }
