
package finalsoru;

import java.util.Scanner;


public class FinalSoru {

    
    public static void main(String[] args) {
      Scanner k = new Scanner(System.in);
      int count =0;
      int sayac=0;
      int id=0;
      int sayi[]=new int[10];  
      
      
      
      while(count<5){
        int num=k.nextInt();
        sayac=0;
        if(num==1) continue;
        for(int i =2; i<num;i++){
              if(num%i==0) sayac++;
        
        }
           if(sayac==0){
           sayi[id]=num; 
           id++;
           count++;
           }
           
      }
      int max=sayi[0];
         for(int i=0;i<sayi.length;i++){
           if(sayi[i]>max) max=sayi[i];
           
           
         
         
         }
        System.out.println(max);

    }
    
}
