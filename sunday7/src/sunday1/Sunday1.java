/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sunday1;

import java.util.Scanner;

/**
 *
 * @author YusufOpens
 */
public class Sunday1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.println("Bir string girim");
   String s=k.nextLine();
        System.out.println("Bir string daha gir");
   String s2=k.nextLine();
    int sayac;
 
    
   for(int i =0;i<=s.length()-1;i++){
     
    sayac=0;
       char c1=s.charAt(i);
   
       for(int j=0;  j<=s2.length()-1 ;j++){
    char c2=s2.charAt(j);
    
    if(c1==c2)sayac++;

    }
   if(sayac>=1)System.out.println(c1);

   }

    
    }
    
    
}