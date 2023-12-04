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

  static int asal(int a){
   int sayac=0;
   int i=3;
   if(a%i==0) sayac++;
   if(sayac==0)System.out.println("Asal ");
   else {System.out.println("Asal değil");}
   return i++;
      
      
  }
    public static void main(String[] args) {
        asal(51);
    }
    
}
