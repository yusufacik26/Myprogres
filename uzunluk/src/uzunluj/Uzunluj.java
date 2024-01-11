
package uzunluj;

import java.util.Scanner;

public class Uzunluj {

    
    public static void main(String[] args) {
       Scanner k = new Scanner(System.in);
       
       int count =0;
       
       
       int max=0;
       while(count<3){
           System.out.println("X ve Y koordinati girin");
       int x =k.nextInt();
       int y = k.nextInt();
       
       int uzun=((x*x)+(y*y));
       
       if(max<uzun) max = uzun;

       
       
       
       count++;


       }
        System.out.println(max);
       
       
       
    }
    
}
