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
     int tek=0;
     int cift=0;
     int a ;
      for(int i =0;i<10;i++){
     a =ka.nextInt();
          if(a%2==0)cift+=a;
          else tek+=a;
      }
        System.out.println("Çift sayıların toplamı = "+cift);
        System.out.println("Tek sayıların toplamı = "+tek);
     
     
     
    }
    
}
