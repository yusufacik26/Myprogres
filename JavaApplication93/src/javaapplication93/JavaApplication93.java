/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication93;

import java.util.Scanner;

/**
 *
 * @author YusufOpens
 */
public class JavaApplication93 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner klavye = new Scanner(System.in); 
        System.out.println("Bir sayı giriniz");
        int taban =klavye.nextInt();
        System.out.println("Üssü girin");
    int ussu=klavye.nextInt();
    
    int total=1;
    if(ussu==0)System.out.println("sonucunuz = "+total);
    
    for(int i =1;i<=ussu;i++){
    total*=taban;
    
    
    
    }
        System.out.println("sonucunuz = "+total);
    }
    
}
