/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication115;

import java.util.Scanner;

/**
 *
 * @author YusufOpens
 */
public class JavaApplication115 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.println("Bir cümle giriniz");
       String str=k.nextLine();
        int bos=0;
        for(int i =0;i<=str.length()-1;i++){
        char c =str.charAt(i);
        if(c==' ') bos++;

        }
        System.out.println("BU cümlede "+bos+" tane boşluk bulunmakta");

        
    }
    
    
}
