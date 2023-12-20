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
      int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
int Index_position = 2;
int newValue = 5;
System.out.println("Original Array : " + Arrays.toString(my_array));
for (int i = my_array.length - 1; i > Index_position; i--) {
my_array[i] = my_array[i - 1];
}

my_array[Index_position] = newValue;
my_array[9]=49;
System.out.println("New Array: " + Arrays.toString(my_array));
    }



}
      
      
      
      
    
    

