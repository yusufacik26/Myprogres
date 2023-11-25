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
        System.out.println("Üssünü almak istediğiniz sayı");
        int a=k.nextInt();
        System.out.println("üssü gir");
        int b =k.nextInt();
        int top=1;
        for(int i =1;i<=b;i++){
        top*=a;
        
        
        }
        System.out.println(top);
        
        
        
        
        
        
    }
    
}
