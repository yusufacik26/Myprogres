/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication91;

import java.util.Scanner;

/**
 *
 * @author YusufOpens
 */
public class JavaApplication91 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in); 
       double toplam = 0; 
        int faktoriyel = 1; 
        int us = 1; 
        for (int x = 1; x <= 4; x++) { 
            for (int k = 1; k <= (x+1); k++) { 
                faktoriyel *= k; 
            } 
            for (int m = 1; m <= x; m++) { 
                us *= (x+1); 
            } 
            toplam += ((double) faktoriyel / (double) us);   
        } 
        System.out.println("Sonuc = " + toplam); 
    int faktoriyel1 = 1; 
        int toplam1 = 0; 
        for (int i = 1; i <= 5; i++) { 
            for (int j = 1; j <= (i+1); j++) { 
                faktoriyel1 *= j; 
            } 
            toplam1 += faktoriyel1; 
            faktoriyel1=1; 
        } 
        System.out.println(toplam1); 
     
     
     }
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   
     
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   

