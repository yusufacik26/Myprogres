/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fbionaccilab;

import java.util.Scanner;

/**
 *
 * @author YusufOpens
 */
public class FbionacciLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner k=new Scanner(System.in);
       int f1=0;
       int f2=1;
       int f3=0;
        System.out.print("0"+"1"+" ");
       for(int i =0;i<10;i++){
       f3=f1+f2;
       f1=f2;
       f2=f3;
           System.out.print(" "+f3);
       
       }
       
       
    }
    
}
