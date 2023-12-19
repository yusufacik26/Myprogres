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
  int dizi1[]=new int[5];
  int dizi2[]=new int[dizi1.length];

    for(int i =0;i<dizi1.length;i++){
    dizi1[i]=k.nextInt();
    
    } 
  for(int i = 0, j=dizi1.length-1 ; i<dizi1.length; i++, j--){
     dizi2[j]=dizi1[i];
    
    
   
}
 for(int i =0;i<dizi1.length;i++){
     System.out.println((i+1)+" . eleman  "+dizi1[i]);
     
 }
        System.out.println("------------------------------");
     for(int i =0;i<dizi2.length;i++){
     System.out.println((i+1)+" . eleman  "+dizi2[i]);
 
 }
    
    }
}