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
        Random r=new Random();
        int a;//sayıyı belirle
        int eb=0; //en küçük sayıyı atayacağın bir değişken belirle
        for(int i =0;i<5;i++){ //kaç tane sayı oluşacağını belirle
        a=r.nextInt(10)+1;// rastgele sayıları alan kod
        if(a>=eb) eb=a;//koşul ve sonuç
        
        }
              System.out.println("En büyük sayı "+eb);
        
        
        
        }

    
    
    
    
    
    }
