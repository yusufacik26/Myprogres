
package pratik;

import java.util.Scanner;


public class Pratik {
    
    
    
    public static int aSayısı(String s ){

int ct=0;
for(int i = 0 ; i<s.length();i++){

    
    char c = s.charAt(i);
        if(c=='a') ct++;


}
        System.out.println(ct);
return ct;
}



    public static void main(String[] args) {

        int count=0;
        
        for(int i =3;i<100;i+=2){
            for (int j = 2; j < i+2; j++) {
                if((i%j==0)&& ((i+2)%j==0)) count++;
                
            }
        if(count ==0 ) System.out.println(i+"  "+ (i+2));
        
        
        
        
        
        
        
        }
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
       
       
    }
    

