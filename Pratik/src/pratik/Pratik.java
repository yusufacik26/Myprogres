
package pratik;

import java.util.Random;


public class Pratik {

    public static String ebek( int []a ){
      int max=a[0];
      int min =a[0];
      String ebek="";
        for (int i = 0; i <a.length; i++) {
            if(a[i]>max) max=a[i];
            if(a[i]<min) min = a[i];
        }
        ebek=max+"en büyük olan ve    "+min+" en küçük olan";
        System.out.println(ebek);
    return ebek;
    
    
    
    
    
    }
    
    public static void main(String[] args) {
    
       int []a={1,2,3,4,5,6,7,8,9,10,-2};
       
       ebek(a);
       
       
       }
       
       
    }
    

