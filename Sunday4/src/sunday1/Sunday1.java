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
        int a =k.nextInt();
        int topl=0;
      while(a>0){
      int kalan=a%10;
      topl+=kalan;
      a/=10;
      
      }
        System.out.println("TOPLAM = "+topl);
        
       
        
    }
    
}
