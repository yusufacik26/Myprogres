
package startwhitacharacter;

import java.util.Scanner;

public class StartwhitAcharacter {


    public static void main(String[] args) {
       String d[]=new String[5];
        Scanner k = new Scanner(System.in);
        for(int i =0;i<d.length;i++){
         d[i]=k.nextLine();
    
       }
        System.out.println("-------------RESULT--------------------");
        for (int i = 0; i <d.length; i++) {
       char c=d[i].charAt(0);
       if(c=='A')System.out.println(d[i]);
        }
        
    }
    
}
