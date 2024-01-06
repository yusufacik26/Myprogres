
package ornek4;

import java.util.Scanner;


public class Ornek4 {

    
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        
        int enBuyuk=0;
        
        System.out.println("Bir sayı girin");
        int a=k.nextInt();
        
        if(a>1000 && a<10000){
          while(a>0){
          int bas=a%10;
            if(bas>enBuyuk){
             enBuyuk=bas;
          }
        a=a/10;

        }
        System.out.println("En büyük eleman "+ enBuyuk);
    }
    
}
}