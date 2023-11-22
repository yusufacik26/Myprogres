/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication97;

import java.util.Scanner;

/**
 *
 * @author YusufOpens
 */
public class JavaApplication97 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner k=new Scanner(System.in);
        System.out.println("Please enter a number...");
        int num=k.nextInt();
        int i=1;
while(i<num){
    
        System.out.print(" "+i);
i*=4;
} 
        System.out.println("\n");
   for(int j=1;j< num;j*=5){
       System.out.print(" "+j);
   
   
   }
        System.out.println("\n"); 
    
    
    }

    }

