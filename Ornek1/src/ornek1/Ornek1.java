
package ornek1;

import java.util.Scanner;

public class Ornek1 {
public static int tek(int a){
 int tektop=0;
  while(a>0){
   int bas=a%10;
    if(bas%2!=0){
    tektop+=bas;  
    }
  a=a/10;
  }
return tektop;
}
    public static int cift(int a){
    int cifttop=0;
     while(a>0){
      int bas=a%10;
      if(bas%2==0){
       cifttop+=bas;
      
      }
     a/=10;
     
     }
    return cifttop;

    }
    public static void main(String[] args) {
       Scanner k= new Scanner(System.in);
       
        System.out.println("sayı gir");
        int a =k.nextInt();
       
        System.out.println("Tek sayıların toplamı "+tek(a));
        System.out.println("Çift sayıların toplamı "+cift(a));
       
       
       
       
       
       
       
    }
    
}
