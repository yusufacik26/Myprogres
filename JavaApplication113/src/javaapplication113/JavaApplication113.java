/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication113;

import java.util.Scanner;

/**
 *
 * @author YusufOpens
 */
public class JavaApplication113 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner k=new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        String num1=k.nextLine();
      String  num2="";
    for(int i=num1.length()-1;i>=0;i--){
   char c =num1.charAt(i);
   num2+=c;
        System.out.print(c);
    
    }
    if(num1.equals(num2))System.out.println("POLİNDROM");
     
    }
    
}
