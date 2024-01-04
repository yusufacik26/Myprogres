
package javaapplication191;

import java.util.Scanner;


public class JavaApplication191 {
   
    public static String ters(String s){
     String st="";
        for(int i=s.length()-1;i>=0;i--){  
            st+=s.charAt(i);
         }     
        
        
        
        st=st.replace(" ", "");
        return st;        
    
   
    
    
    
    }
 
    
    
    
    
    public static void main(String[] args) {
               Scanner k = new Scanner(System.in);
       String s=k.nextLine();
               
               System.out.println(ters(s));
               
               
               
    }
}

    
    

