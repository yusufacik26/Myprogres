
package partidizi;

import java.util.Scanner;


public class PARTİdizi {


    public static void main(String[] args) {
    Scanner k = new Scanner(System.in);
        int p[] = new int[5];
    int tumOylar = 0 ;
    
    
      for(int i = 0; i<5; i++ ){
          System.out.println(i+1+". partinin oy sayısını giriniz");
          p[i] = k.nextInt();
      tumOylar += p[i];
      }
      int eb=p[0];
    for(int i = 0; i<5; i++ ){
        System.out.println(i+1+" .parti oy sayısı"+p[i]);
         System.out.println("Yüzdelik oranı ise %" + ((double) p[i] / tumOylar) * 100);
    }
    
      
      
      
     
        
        
    }
    
}
