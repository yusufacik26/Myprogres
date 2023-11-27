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
        System.out.println("Bir kelime dizisi girin");
      String str=k.nextLine();
      str=str.toLowerCase();
      int sayac=0;
      for(int i =0;i<=str.length()-1;i++){
      char c=str.charAt(i);
      if(c=='x')sayac++;
      
      
      }
        System.out.println("Bu kelime dizisinde x veya X karakterinin sayı adedi "+sayac+" tanedir");
    }
    
}
