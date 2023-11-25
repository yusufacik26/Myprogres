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
        System.out.println("Bir binary sayı girin");
        String a=kb.nextLine();
        String comp="";
        for(int i =0;i<=a.length()-1;i++){
         char c =a.charAt(i);
         if(c=='1'){
             c='0';
             comp+=c;
         }
         else if (c=='0'){c='1';
         comp+=c;
         
         
         }
        }
        System.out.println(comp);
    }
}