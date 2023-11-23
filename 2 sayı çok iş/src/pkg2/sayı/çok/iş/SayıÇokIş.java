/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.sayı.çok.iş;

import java.util.Scanner;

/**
 *
 * @author YusufOpens
 */
public class SayıÇokIş {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner k=new Scanner(System.in);
    int a =k.nextInt();
    int b =k.nextInt();
    String  ob=1+"";
    int obtop=1;
    boolean bolum=false;
    if(a>b){
    for(int i =2;i<=b;i++){
       if(a%i==0&& b%i==0){ bolum=true;
           ob+=i;
           obtop+=i;
       }

    }
 
    }   
   else if(b>a){
    for(int i =2;i<=a;i++){
       if(b%i==0 && a%i==0){ bolum=true;
           ob+=i+" ";
           obtop+=i;}
    }
       
   } 
if(bolum==false){
        System.out.println("Aralaında asal sayılar");
        
        
}

       
        System.out.println("ortak bölenleri "+ob+" " );
        System.out.println("ob toplamı "+obtop);
       
       
       
       
    }
    
}
