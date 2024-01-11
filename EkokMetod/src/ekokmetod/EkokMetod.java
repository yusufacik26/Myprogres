
package ekokmetod;

import java.util.Scanner;
public class EkokMetod {
    
    public static int ekok(int a,int b ){
    int ek=1;
    int temp=2;
    if(a==b) ek=a;
    
    if(a<b){
        for(int i =1;i<=b;i++){
          if(a%i==0 && b%i ==0) temp=i;
        
        }

             }  
     else if (a>b) {
             for (int i = 0; i < a; i++) {
              if(a%i==0 && b%i ==0) temp=i;
}
    }
    
    ek=(a*b)/temp;
        System.out.println(ek);
    
    
    return ek;
    }

    
    public static void main(String[] args) {
        Scanner k= new Scanner(System.in);
        int a=k.nextInt();
        int b = k.nextInt();
    
        ekok(a,b);
        
        
        
        
        
        
    }
    
    
    
    
}
