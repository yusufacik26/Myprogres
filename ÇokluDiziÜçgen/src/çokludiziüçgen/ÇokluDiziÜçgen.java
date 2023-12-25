
package çokludiziüçgen;

import java.util.Scanner;

public class ÇokluDiziÜçgen {

    public static void main(String[] args) {
       Scanner k =new Scanner(System.in);
       int d [][]=new int[5][5];
       int a = 5;
       
       for(int i = 0 ; i <d.length; i++){
        for(int j = 0 ; j < d[0].length; j++){
        d[i][j]=k.nextInt();
        
        
        }  
       }
       for(int i = 0 ; i <d.length; i++){
        for(int j = 0 ; j < a; j++){
            System.out.print(d[i][j]);
        }
           System.out.println("");
      a--;
    }
    
}
}