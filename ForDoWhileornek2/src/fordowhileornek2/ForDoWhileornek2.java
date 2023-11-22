/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fordowhileornek2;

import java.util.Scanner;

/**
 *
 * @author YusufOpens
 */
public class ForDoWhileornek2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner fak=new Scanner(System.in);
        
        int toplam=1;
        System.out.println("Bir N sayısı giriniz :");
        int N =fak.nextInt();
        
        
        for(int i=1;i<=N;i++){
            
            
            toplam*=i;
            
        
        
        }
        System.out.println("Sonucunuz :"+toplam);
        
        
        
    }
    
}
