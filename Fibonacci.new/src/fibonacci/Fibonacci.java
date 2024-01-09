
package fibonacci;

import java.util.Scanner;

public class Fibonacci {

   
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int f1=1;
        int f2=1;
        int f3=0;
        System.out.print(f1+" "+f2+" ");
        for(int i =2;i<10;i++){
        f3=f1+f2;
            System.out.print(f3+" ");
        f1=f2;
        f2=f3;
        }
        
    }
    
}
