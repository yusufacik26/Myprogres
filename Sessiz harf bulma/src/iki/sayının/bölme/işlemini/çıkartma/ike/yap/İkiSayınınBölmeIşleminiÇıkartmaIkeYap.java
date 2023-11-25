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
        System.out.println("Bir cümle giriniz giriniz");
        String s=kb.nextLine();
            int say=0;
          for(int i =0;i<=s.length()-1;i++){
          char c =s.charAt(i);
          if(c!='a'&&c!='e'&&c!='i'&&c!='o'&&c!='u'&&c!=' ')say++;

            }
        System.out.println(s+" CÜMLESİNDEKİ SESSİZ HARF SAYISI "+say+" tane");
        
        
        
        
        }

    
    
    
    
    
    }
