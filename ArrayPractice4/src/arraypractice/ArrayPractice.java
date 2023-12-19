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
       
    int array[]=new int[5];
  
 
    for(int i =0;i<array.length;i++){
     array[i]=k.nextInt();

    }
      int max=array[0];
    int min=array[0];
   int Maxindis =0;
    int Minindis=0; 
       
       for(int i =0;i<array.length;i++){
    
     if(array[i]>max){max=array[i]; 
    Maxindis=i;
     } if(array[i]<min){min=array[i]; 
    Minindis=i;
     }
       }
        System.out.println("Bu dizinin en büyük değeri "+max+" elemanıdır "+ Maxindis+" indisindedir");
          System.out.println("Bu dizinin en küçük değeri "+min+" elemanıdır "+ Minindis+" indisindedir");
    


}
}