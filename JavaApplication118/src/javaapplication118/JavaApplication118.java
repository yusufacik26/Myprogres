/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication118;

import java.util.Scanner;

/**
 *
 * @author YusufOpens
 */
public class JavaApplication118 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner k=new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
       int a=k.nextInt();
       int bastop=0;
       while(a>0){
      bastop+= a%10;
       a=a/10;
       }
        System.out.println("Toplamı "+bastop);
       
       
    }
    
}
