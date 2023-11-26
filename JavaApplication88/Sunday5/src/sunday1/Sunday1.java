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
        System.out.println("Bir sayı giriniz");
       String st1=k.next();
       String sr2="";
   for(int i=st1.length()-1;i>=0;i--){
      char c =st1.charAt(i);
      sr2+=c;
   
  
   }
if(sr2.equals(st1))System.out.println("Palindrom sayı");
else System.out.println("Palindrom sayı değil");    
    
    }
}