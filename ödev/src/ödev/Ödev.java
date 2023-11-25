/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ödev;

import java.util.Scanner;

/**
 *
 * @author YusufOpens
 */
public class Ödev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner k=new Scanner(System.in);
       
       int sayac;
       
        System.out.println("Bir kelime girin");
       String a =k.nextLine();
       for(int i =0;i<=a.length()-1;i++)
       {sayac=0;
           for(int j=0;j<=i;j++){
           if(a.charAt(i)==a.charAt(j)){
            sayac++;
           }
       }
        if(sayac==1){
           System.out.println(a.charAt(i));
           }
              

       }
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
    }
    
}
