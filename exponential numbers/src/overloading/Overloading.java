/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;

import java.util.Scanner;

/**
 *
 * @author YusufOpens
 */
public class Overloading {

    /**
     * @param args the command line arguments
     */
     
    
    
    
    public static void main(String[] args) {
        // exponential numbers
        Scanner k=new Scanner(System.in);
        System.out.println("Please enter a number");
        int a =k.nextInt();
        System.out.println("Please enter a base number");
        int b =k.nextInt();
        int result=1;
        for(int i =0;i<b;i++){
        result*=a;
        }
        System.out.println(a+" to the power of "+b+" is equal "+result);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
