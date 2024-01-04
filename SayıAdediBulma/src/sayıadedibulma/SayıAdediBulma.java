
package sayıadedibulma;

import java.util.Scanner;


public class SayıAdediBulma {

    public static int bul(int sayi,int aranan){
     int count =0;
     while(sayi>0){
      int num=sayi%10;
      
      if(num==aranan){ 
          count++;
      }
       sayi=sayi/10;
     
     
     }
        System.out.println(aranan +" sayısı "+count +" kere vardır");
 
        
        return count;
    
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        Scanner k= new Scanner(System.in);
        
        System.out.println("Sayı gir");
        int a =k.nextInt();
        System.out.println("Aramak istediğin sayıyı gir ");
        int b=k.nextInt();
        
        
        bul(a,b);
    }
    
}
