/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sunday1;

import java.util.Scanner;

/**
 *
 * @author YusufOpens
 */
public class Sunday1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.println("Bir string girim");
   String s=k.nextLine();
        int sayac=0;
    for(int i=0;i<=s.length()-1;i++){
    sayac=0;
        char c=s.charAt(i);
    for(int j=0;j<=i;j++){
    char c1=s.charAt(j);
    if(c==c1)sayac++;
    
    
    }
    if(sayac==1) System.out.print(" "+c+" ");
    
    
    
    }
    
    
    
    
    
    
    
    
    
    }
    
    
}