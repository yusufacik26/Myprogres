/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basamak;

import java.util.Scanner;

/**
 *
 * @author YusufOpens
 */
public class Basamak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner k=new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int num=k.nextInt();
        int total=0;
        while(num>0){
        total+=num%10;
            
            num=num/10;
        
        }
        System.out.println(total);
    }
    
}
