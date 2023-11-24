/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10.sayıdan.tek.olanları;

import java.util.Scanner;

/**
 *
 * @author YusufOpens
 */
public class SayıdanTekOlanları {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner k =new Scanner(System.in);
       int ekt=0;
        
        for(int i=0;i<5;i++ ){
         System.out.println("Bir sayı giriniz");
        int a=k.nextInt();
        if(a%2==1 && a>=ekt){
        ekt=a;
        }

        }
        
if(ekt!=0)System.out.println("En büyük tek sayı = "+ekt);
    
else    System.out.println("TEK SAYI GİRİNİZ");    
    
    
    }
  
}
