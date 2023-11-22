/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harmonik;

import java.util.Scanner;

/**
 *
 * @author YusufOpens
 */
public class Harmonik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner k=new Scanner(System.in);
        System.out.println("Hangi sayıya kadar harmonik toplam yapmak istediğinizi giriniz");
        int n =k.nextInt();
        double total=0.0;
        for(double i =1;i<=n;i++){
        total+=(1/i);

        }
        System.out.println("Harmonik toplamınızın sonucu = "+total);               
       
       
       
    }
    
}
