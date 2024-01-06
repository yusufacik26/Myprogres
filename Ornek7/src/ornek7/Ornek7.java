
package ornek7;

import java.util.Scanner;

public class Ornek7 {

    
    
    public static void main(String[] args) {
       Scanner k = new Scanner(System.in);
       int toplam=0;
       int sayac=0;
       
       
       while(sayac<10){
           int a;
        do{
            a =k.nextInt();
        toplam+=a;
        
        }
      while(a!=0);
       if(a==0) {
           System.out.println(toplam);
       toplam=0;
       
       sayac++;
       }
       
       }
       
       
       
       
       }
       
       
       
       
       
       
       
       }
       
       
        
        
        

    

