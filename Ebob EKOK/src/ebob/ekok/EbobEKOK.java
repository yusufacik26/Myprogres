/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebob.ekok;

import java.util.Scanner;

/**
 *
 * @author YusufOpens
 */
public class EbobEKOK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
         System.out.println("Lütfen iki sayı giriniz");
        int a =k.nextInt();
        int b =k.nextInt();
        int ebob=1;
        int ekok=1;
        int i=2;
        if(a>b){
            while(i<b){
            i++;
            if(a%i==0&&b%i==0){
            ebob=i;
                         }

                     }

                }
        else{
        while(i<a){
            i++;
            if(a%i==0&&b%i==0){
            ebob=i;
                              }            
        }                  
             }
      ekok=(a*b)/ebob;

            System.out.println("EBOB=== "+ebob);
                System.out.println("EKOK=== "+ekok);

    }
    
}
