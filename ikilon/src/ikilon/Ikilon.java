
package ikilon;

public class Ikilon {
public static int bin(int a){
    int dec=0;
    int us=1;


          while(a>0){
            int bas=a%10;

             dec+=bas*us;
               us*=2;
                a/=10;


               }




return dec;


}
  
    public static void main(String[] args) {
       int a=10101;
    
        System.out.print( bin(a));
    
    }
    
}
