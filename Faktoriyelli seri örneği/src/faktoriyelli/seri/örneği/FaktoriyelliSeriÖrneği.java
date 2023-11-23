/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faktoriyelli.seri.örneği;

/**
 *
 * @author YusufOpens
 */
public class FaktoriyelliSeriÖrneği {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// 1/ 2! + 1/3! + 1/4! +...+ 1/10!
double toplam=0;
double fakt;

for(int i =2;i<=10;i++){
 
    fakt=1;
  
    
  for(int j=1;j<=i;j++){
 
       fakt=fakt*j;
       
 
   }

   toplam+=(1/fakt);

}
        System.out.println(toplam);
    
    
    
    }

}








