/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odev2;

import java.util.Scanner;

/**
 *
 * @author YusufOpens
 */
public class Odev2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner k =new Scanner(System.in);
        System.out.println("İKİ string girin");
        String s1=k.nextLine();
        String s2=k.nextLine();
        int sayac;
        for(int i =0;i<=s1.length()-1;i++){
         sayac=0;
         
          for(int j=0;j<=s2.length()-1;j++){
          if(s1.charAt(i)==s2.charAt(j)){
              sayac++;}
           
          }
             if(sayac>=1)System.out.println(s1.charAt(i));
              
              
              
          
          
          
          
          }

        
        }
        
        
        
        
        
        
    }
    

