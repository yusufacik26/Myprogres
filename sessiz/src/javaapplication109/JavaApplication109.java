/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication109;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author YusufOpens
 */
public class JavaApplication109 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner k=new Scanner(System.in);
        System.out.println("Bir string girin");
String a=k.nextLine();
a=a.toLowerCase();
int count=0;
for(int i =0;i<a.length();i++){
  char c =a.charAt(i);
  if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c==' '){
  count++;
  }

}
   int sessizharf=(a.length()) -count;
        System.out.println("Cümledeki sessiz harf sayısı = "+sessizharf);
        
    
    
    
    
    }
       
       

       
    }
    
