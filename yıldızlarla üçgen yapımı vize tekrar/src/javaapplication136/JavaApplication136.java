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
     int n=ka.nextInt();
     for(int i =1;i<=n;i++){
       for(int j =1;j<=(n-i);j++){
           System.out.print(" ");
       
       }
     for(int k =1;k<=(2*i)-1;k++){
         System.out.print("*");
     }
         System.out.println();
     
     }
        
     
    }
    
}
