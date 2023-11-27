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
     int ort =0;
      int a =k.nextInt();
     do{
         if(a%2==0){
         ort+=a;
         
         
         }
           a=k.nextInt();
     
     
     }
      
     while (a!=9999);
      
        System.out.println("toplam sonucunuz = "+ort);
      
      
      
      
      
      
      
      
      
      
      
    }
    
}
