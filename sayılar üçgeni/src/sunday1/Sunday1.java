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
        System.out.println("Bir sayı girin");
      int a =k.nextInt();
      for(int i =1;i<=a;i++){
        for(int j=1;j<=i;j++){
            System.out.print( i+" ");
        
        }
          System.out.println("");
      
      
      }
    



    }


 


}