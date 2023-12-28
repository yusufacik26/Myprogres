/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication170;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author YusufOpens
 */
public class JavaApplication170 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner k = new Scanner(System.in);

    int d[]={1,2,3,4,5,6,7,8,9};
    int finder=3;
    
    boolean bul=false;
    int yer=0;
    
    for(int i =0;i<d.length;i++){
      if(d[i]==finder){
       bul = true;
          yer=i;
      break;
      
      
      }
    
    
    }
    if(bul!=false){
        System.out.println("Aranan sayı "+finder+" ve indisi ise "+yer+" dir.");
    }
    else{
        System.out.println("Aranan sayı bulunamadı");
    
    }
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
