/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iki.sayının.bölme.işlemini.çıkartma.ike.yap;

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
        System.out.println("satır sayısı belirleyiniz");
        int a=kb.nextInt();
        int i =1;
        for(int j=0;j<=a;j++){
         for(int k=0;k<=j;k++){
             System.out.print(i);
             System.out.print(" ");
         i++;
         }
            System.out.println("");
        
        
        
        }

    
    
    
    
    
    }
}