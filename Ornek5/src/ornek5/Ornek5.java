
package ornek5;

import java.util.Scanner;


public class Ornek5 {
public static int decimal(int a){
int dec=0;
int us=1;
    while(a>0){
      int bas=a%10;
      dec+=bas*us;
      us*=2;
 a=a/10;
    } 
    
 return dec;

}
    
    public static void main(String[] args) {
        Scanner k= new Scanner(System.in);
        System.out.println("Binary sayı gir");
        int b =k.nextInt();
        
        System.out.println(decimal(b));
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
