/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gdscevent;

import java.util.Scanner;

/**
 *
 * @author YusufOpens
 */
public class GDSCEVENT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner k =new Scanner(System.in);
     /* String ornek= k.nextLine();
      for(int i=ornek.length()-1;i>=0;i--){
          System.out.println(ornek.charAt(i));*/
      //indis olarak 0 dan başlat ama karakter olarak diyorsa 1den başlat
      //next ile nextLıne arasındaki fark şudur: nextLine stringin tamamını alır fakat next ise boşluktan sonrasını görmez boşluk gördüğünde stringin sonlandığını düşünür!!!!
      //boşlukta bir karakter quiz 2.soru!!!
    /*    System.out.println("bir string giriniz"); 
     String s=k.nextLine();
     for(int i =s.length()-1;i>=0;i--){
         System.out.print(s.charAt(i));*/
    
    //Klavyeden string alarak olan çözüm
   /* String str=k.nextLine();
    String tersStr="";
    for(int i =str.length()-1;i>=0;i--){
    tersStr+=str.charAt(i);
        
    
    
    
    
    
    }
    System.out.println(tersStr);*/
   
 /*       System.out.println("Bir string giriniz");
   
        String a=k.nextLine();
   
       int sayac=1;
        for(int i =0;i<a.length();i++){
   char c =a.charAt(i);
   if(c==' '){
  sayac ++;
   }
   
   
   
   
   }
        System.out.println("Bu cümledeki kelime sayısı "+sayac);*/
        System.out.println("küçük sayıyı girin");
        int a =k.nextInt();
        System.out.println("Büyük sayıyı girin ");
int b =k.nextInt();
int sayac=0;
 if(a>b){

for(int i=b;i<a;i++){
 if(i%2==0) sayac++;



}
        System.out.println(sayac);
   
    }
 else {for(int i=a;i<=b;i++){
 if(i%2==0) sayac++;



}
        System.out.println(sayac);
 
 
 }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    
     
     
     
     }
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      }
              

        
        
        
        
    
    

