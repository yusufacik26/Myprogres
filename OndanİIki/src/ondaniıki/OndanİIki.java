/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ondaniıki;

/**
 *
 * @author YusufOpens
 */
public class OndanİIki {

 public static String binary(int a ){
  
    String bin="";
 while(a>0){
 bin=a%2+bin;
 
 a=a/2;
 
 
 
 }
 
 
 
 
 
 return bin;
 } 
    public static void main(String[] args) {
        // TODO code application logic here
        int a =42;
      String c = binary(42);
        System.out.println(c);
        
        
        
    }
    
}
