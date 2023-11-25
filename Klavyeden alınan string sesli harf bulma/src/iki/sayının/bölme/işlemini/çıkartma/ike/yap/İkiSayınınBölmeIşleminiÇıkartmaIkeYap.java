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
        System.out.println("Bir cümle ya da string girin");
        String s=k.nextLine();
        int sesli=0;
        for(int i =0;i<=s.length()-1;i++){
        char c =s.charAt(i);
        if(c=='i'||c=='a'||c=='e'||c=='o'||c=='u')sesli++;
        
        }
        
        
        System.out.println(s+" cümlesindeki sesli harf sayısı "+sesli+" tane");    
    }
    
}
