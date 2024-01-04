
package javaapplication192;

import java.util.Scanner;


public class JavaApplication192 {

    public static void  tekMi(String d[][]){
    
        for(int i =0;i<d.length;i++){
            
          for(int j =0; j<d[0].length;j++){
           if(d[i][j].length()==1)    
                  System.out.println(d[i][j]);
          
          
          }
        
        }
     
    
    
    
    
    
    }
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String d[][]= new String[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                d[i][j]=k.nextLine();
            }
        }
        tekMi(d);
            
        }
    
}
