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
 
      Scanner k=new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int a =k.nextInt();
        int us;
       int toplam=1;
        for(int i =1;i<=6;i++){
            us=1;
          for(int j=1;j<=i;j++){
               us*=a;
        
               }  
       
        toplam+=us;
        
        
        }
        System.out.println("toplamınız "+toplam);
        
        
        
        
    }
    
}
