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
    Scanner k=new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
    int a=k.nextInt();
    
    int sayac=0;
    
    
    while(a>0){
    a=a/2;
    sayac++;
    
    
    }
        System.out.println(sayac+" kadar bölünür ");
    
}
}