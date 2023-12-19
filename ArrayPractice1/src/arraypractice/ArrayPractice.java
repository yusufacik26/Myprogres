/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraypractice;

import java.util.Scanner;

/**
 *
 * @author YusufOpens
 */
public class ArrayPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner k =new Scanner(System.in);
        System.out.println("Dizinizin eleman sayısını giriniz");
       int elemants=k.nextInt();
        int array[]= new int[elemants];
        for(int i =0;i<array.length;i++){
            System.out.println("Dizinin "+(i+1)+" . elemanını giriniz");
            array[i]=k.nextInt();
        
        
        }
        
        
    }
    
}
