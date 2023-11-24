/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boşluk;

import java.util.Scanner;

/**
 *
 * @author YusufOpens
 */
public class Boşluk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner k=new Scanner(System.in);
      int bos=0;
        System.out.println("Bir string giriniz");
      String str=k.nextLine();
      
      for(int i =0;i<=str.length()-1;i++)
      {
      char c =str.charAt(i);
      if(c==' ')bos++;
   
      
      }      
        System.out.println("Bu cümledeki boşluk sayısı "+bos);   
      
      
      
      
      
      
    }
    
}
