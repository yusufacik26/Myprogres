/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xxxxx;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author YusufOpens
 */
public class XXXXX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Klavyeden girilen iki sayının aralarında asal
//olup olmadığını bulan, asal değilse ortak bölenlerini
//ve ortak bölenlerinin toplamını bulan program
        Scanner k =new Scanner(System.in);
 int a =k.nextInt();
 int b =k.nextInt();
 String ob="";
 int obtop=1;
 int sayac=0;
 if(a>b){
 for(int i =2;i<=b;i++){
     if(b%i==0&& a%i==0){
        sayac++;
          ob+=i+" ";
 obtop+=i;
 }
         }
  if(sayac==0)System.out.println("ARALARINDA ASALDIR");
     else {System.out.println("ORTAK BÖLENİ "+ob);
            System.out.println("ORTAK BÖLENLERİ TOP "+obtop); 
             
             }
               
                           }   
 
  else {
 
  for(int i =2;i<=a;i++){
     if(a%i==0&& b %i==0){
        sayac++;
          ob+=i+" ";
          obtop+=i;
     }
     
 
 }
  if(sayac==0)System.out.println("ARALARINDA ASALDIR");
     else {System.out.println("ORTAK BÖLENİ "+ob+" ");
            System.out.println("ORTAK BÖLENLERİ TOP "+obtop); 
             
             }
               
 
 }
        
    }     
        
}   
        
        
        
        
        
        
