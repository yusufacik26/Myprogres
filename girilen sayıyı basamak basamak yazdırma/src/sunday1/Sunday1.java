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
        System.out.println("Sayı gir");
    String a =k.nextLine();
    for(int i =0;i<=a.length()-1;i++){
     for(int j =0;j<=i;j++){
         System.out.print(a.charAt(j)+" ");
 
     }
        System.out.println("");    
    
    
    }
    
    
    
}
}