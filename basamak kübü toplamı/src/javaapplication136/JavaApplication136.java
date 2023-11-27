/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication136;


import java.util.Scanner;

/**
 *
 * @author YusufOpens
 */
public class JavaApplication136 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
      Scanner ka=new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
     int a =ka.nextInt();
        int top=0;
     while(a>0){
      int kalan=a%10;
      top+=kalan*kalan*kalan;
      a=a/10;
   
     
     }
        System.out.println("Sonucnuuz "+top);
    }
    
}
