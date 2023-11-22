/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tersüçgen;

import java.util.Scanner;

/**
 *
 * @author YusufOpens
 */
public class TersÜçgen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.println("Üçgenin boyunu giriniz");
     
        
        int a =k.nextInt();
        for(int i =a;i>=0;i--){//10 olsa a şöyle oluyor o zaman normalde 1 .satırdan başlar ya bu sefer 10.satırı 1 olarak alıyor
            //sonra 2 yi 9 alıyor sütün sayısını arttırmak için bu şekilde yapıyoruz artırıp azaltmak için
            for(int j=1;j<=i;j++){
                System.out.print("*");
            
            
            }
            System.out.println();
        
        
        
        
        
        }
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
