/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraypractice;

import java.util.Scanner;

/**
 *
 * @author YusufOpens
 */
public class ArrayPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner k =new Scanner(System.in);
  int dizi[]=new int[5];
  int dizitek[]=new int[dizi.length];
  int sayac=0;
    for(int i =0;i<dizi.length;i++){
      dizi[i]=k.nextInt();   
      if(dizi[i]%2==1){
      
          dizitek[sayac]=dizi[i];
      sayac++;
      }
    }
   
   for(int i =0;i<sayac;i++){
       System.out.println("eleman sayısı"+i+"  "+dizitek[i]);
      
      
      }


 
    
    }
}