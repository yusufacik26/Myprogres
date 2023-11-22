/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fakt;

import java.util.Scanner;

/**
 *
 * @author YusufOpens
 */
public class Fakt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner k =new Scanner(System.in);
        System.out.println("Üssünüzü girin");
      int a=k.nextInt();//Üs olacak sayı
        System.out.println("Taban değerinizi girin");
      int b =k.nextInt();//taban olacak sayı
      int total=1;
      for(int i =1;i<=a;i++){
      total*=b;
      }
        System.out.println("Result = "+total);
      
      
    }
    
}
