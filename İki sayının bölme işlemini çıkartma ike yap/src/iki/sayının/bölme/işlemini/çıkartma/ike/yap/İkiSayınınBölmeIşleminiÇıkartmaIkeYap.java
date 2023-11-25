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
        Scanner k=new Scanner(System.in);
         System.out.println("Bölmek istediğiniz sayıyı giriniz");
        int a =k.nextInt();
          System.out.println("Kaç kere bölmek istediğinizi giriniz");
        int b =k.nextInt();
         int sayac=0;
         while(a>=b){
         a=a-b;
         sayac++;
         
         
         
         
         }
        System.out.println("Bölüm "+sayac+" kalan "+a);
        
        
        
        
    }
    
}
