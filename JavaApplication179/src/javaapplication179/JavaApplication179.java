/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication179;

import java.util.Scanner;

/**
 *
 * @author YusufOpens
 */
public class JavaApplication179 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int[]d=new int[10];
        double tekort=0;
        double çiftort=0;
        int t=0;
        int ç=0;
        
         for(int i =0; i<d.length;i++){
           d[i]=k.nextInt();
             if(d[i]%2==0){
               t+=d[i];
                   tekort++;
           
           }else{ ç+=d[i];
         çiftort++;
           }
         }
        System.out.println("Dizideki tek sayıların ortalaması "+t/tekort);
        System.out.println("Dizideki çift sayıların ortalaması "+ç/çiftort);
        
        
        
        
        
    }
    
}
