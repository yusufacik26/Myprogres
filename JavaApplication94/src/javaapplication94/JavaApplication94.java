/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication94;

import java.util.Scanner;

/**
 *
 * @author YusufOpens
 */
public class JavaApplication94 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner klavye=new Scanner(System.in);
        int toplam2 = 0; 
        int us2 = 1; 
        System.out.println("n degerini giriniz:"); 
        int n = klavye.nextInt(); 
         
        for (int x = 1; x <= n; x++) { 
            for (int i = 1; i <= x; i++) { 
                us2 *= (x+1); 
            } 
            toplam2 += us2; 
            us2 = 1; 
        } 
        System.out.println("Sonuc = " + toplam2); 
   
   
    }
    
}
