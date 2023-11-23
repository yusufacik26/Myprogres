/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication109;

import java.util.Scanner;

/**
 *
 * @author YusufOpens
 */
public class JavaApplication109 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
System.out.println("Bir kelime giriniz:");
String kelime=s.nextLine();
System.out.println("Kaç karakter ayrılsın?");

int sayi=s.nextInt();
for (int i = 0; i < kelime.length()+1-sayi; i++) {
System.out.println(kelime.substring(i,i+sayi));
}
       
       
       
       
       
       
       
       
       
       
       
    }
    
}
