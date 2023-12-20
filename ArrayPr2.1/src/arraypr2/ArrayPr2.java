/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraypr2;

import java.util.Arrays;

/**
 *
 * @author YusufOpens
 */
public class ArrayPr2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
      int[] dizi = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        System.out.println("İLK DİZİ  "+Arrays.toString(dizi));
        int removeIndex=4;
        for(int i =removeIndex;i<dizi.length-1;i++){
        dizi[i]=dizi[i+1];
        
        
        }
        System.out.println("Yer değiştirilmiş dizi "+Arrays.toString(dizi));


    }



}
      
      
      
      
    
    

