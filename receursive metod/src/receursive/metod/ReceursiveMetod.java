/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package receursive.metod;

/**
 *
 * @author YusufOpens
 */
public class ReceursiveMetod {

   static int f(int n){
       System.out.println("n==>" +n);
       if(n==1){
        return 1 ;
       }
   int result =f(n-1)+ n;
       System.out.println("result =="+result);
   return result;
   
   
   
   
   
   
   
   
   
   }
    public static void main(String[] args) {
        f(3);
    }
    
}
