/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xxxxx;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author YusufOpens
 */
public class XXXXX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner k =new Scanner(System.in);
        Random r =new Random();
        int count=0;
        int a;
        int b;
        do{
        count++;
        a=r.nextInt(50)+1;
        b =k.nextInt();
        if(a>b)System.out.println("Sayınızı büyütün");
       else if (b>a)System.out.println("Sayınıızı küçültün ");
        
        }
        while(b!=a);
               System.out.println("Tebrikler "+count +" kerede bildiniz");
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
