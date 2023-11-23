/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string.uzun.olanı.bulma;

import java.util.Scanner;

/**
 *
 * @author YusufOpens
 */
public class StringUzunOlanıBulma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner k=new Scanner(System.in);
       String uzunstr="";
       int sayac=0;
       String str="";
       
       do{
       str=k.nextLine();
       if(str.length()>=uzunstr.length()){
       uzunstr=str;
   
       }
       sayac++;
       }
       while(!str.equals("EXIT"));
        System.out.println("Girilen String sayısı "+sayac);
        System.out.println("EN BÜYÜĞÜN UZUNLUĞU ="+uzunstr.length());
        System.out.println("En uzun metin = "+uzunstr);
       
    }
    
}
