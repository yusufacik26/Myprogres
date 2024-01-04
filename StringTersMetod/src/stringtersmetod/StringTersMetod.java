
package stringtersmetod;

import java.util.Scanner;

public class StringTersMetod {

    public static void Ters(String s){
     String ters="";
       for(int i =s.length()-1;i>=0;i--){
         ters+=s.charAt(i);
       
       }
        System.out.println(ters);


}
 
    
    
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Bir cümle girin");
         String a =k.nextLine();
        Ters(a);
        
    }
    
}
