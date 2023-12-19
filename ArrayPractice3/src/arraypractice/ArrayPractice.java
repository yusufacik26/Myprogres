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
       
    int array1[]=new int[10];
    int max=array1[0];
    int indis =0;
    for(int i =0;i<array1.length;i++){
     array1[i]=k.nextInt();
     if(array1[i]>max){max=array1[i]; 
    indis=i;
     }
    }
        System.out.println("Bu dizinin en büyük değeri "+max+" elemanıdır "+ indis+" indisindedir");
    
    
}

}