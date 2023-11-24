/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faktöriyellab;

/**
 *
 * @author YusufOpens
 */
public class FaktöriyelLAB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     double top=0;
     double fak;
   for(int i =2;i<=10;i++){
   fak=1;
   for(int j =1;j<=i;j++){
   fak*=j;
   
   }
   top+=1/fak;
   }
        System.out.println(top);
       
     
     
     
     
     
     
     
     
     
     
    }
    
}
