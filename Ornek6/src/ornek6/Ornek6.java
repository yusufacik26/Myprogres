
package ornek6;

import java.util.Scanner;


public class Ornek6 {
 public static String farkli(String a , String b){
String s="";

for(int i =0; i<=a.length()-1;i++){
    char x=a.charAt(i);
   char y=b.charAt(i);
    if(x!=y){
    s=s+x+y;
    }



}

return s;


}
    
    public static void main(String[] args) {
    Scanner k =new Scanner(System.in);
        
    System.out.println("İKİ string gir");
    
    String a = k.nextLine();
    String b= k.nextLine();

        System.out.println( farkli(a,b));
        
        
        
    }
    
}
