/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string.ayrı.ayrı.yazdırma;

import java.util.Scanner;

/**
 *
 * @author YusufOpens
 */
public class StringAyrıAyrıYazdırma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner k=new Scanner(System.in);
       String str="Merhaba Ben Yusuf Açık";
       String kelime="";
       
   for(int i =0;i<=str.length()-1;i++){
      if(str.charAt(i)==(' ')){
           System.out.println(kelime); 
         kelime="";
             
      }
      else{
      kelime+=str.charAt(i);
 
   if (i == str.length() - 1) {
            System.out.println(kelime);
   }
      }  
    
    
    
    
}
      
       
       
       
       
       
       
       
   }
    }
