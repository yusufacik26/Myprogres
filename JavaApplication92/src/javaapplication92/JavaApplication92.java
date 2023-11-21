/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication92;

import java.util.Scanner;

/**
 *
 * @author YusufOpens
 */
public class JavaApplication92 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner klavye = new Scanner(System.in);      
   System.out.println("Lütfen 2 string giriniz"); 
   String str1=klavye.nextLine();
    String str2=klavye.nextLine();
    for(int i=0;i<=str1.length()-1;i++){
     for(int j=0;j<=str2.length()-1;j++){
     if(str1.charAt(i)==str2.charAt(j))
     {System.out.println("Str1 stringining "+i+"indisindeki karakter ile str2 stringinin"+j+".indisindeki karakter aynıdır" );}

     
    }
    
}
    }}