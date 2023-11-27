/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication136;


import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author YusufOpens
 */
public class JavaApplication136 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
      Scanner ka=new Scanner(System.in);
      int a=ka.nextInt();
      int eb=a;
      int ek=a;
     double topg=a;
     double iki=0;
     for(int i =1;i<10;i++){
     a=ka.nextInt();
         if(a>=eb)eb=a;
     if (a<=ek) ek=a;
      topg+=a;
     
     
     
     }
    iki=(eb+ek)/2;
      topg/=10;
        System.out.println(iki);
        System.out.println(topg);
 
    
    
    
    
    
    
    
    
    
    
    
    }  
    

}