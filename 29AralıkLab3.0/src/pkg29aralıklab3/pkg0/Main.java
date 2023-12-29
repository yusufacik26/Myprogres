
package pkg29aralıklab3.pkg0;

import java.util.Scanner;



public class Main {
 static int bul(String s,char c){
int count =0;
 for(int i =0 ; i<s.length();i++){
  if(s.charAt(i)==c) count++;

}
return count;

}  

 
    public static void main(String[] args) {
        Scanner k =new Scanner(System.in);
        System.out.println("Bir string girin");
        String metin =k.nextLine();
        System.out.println("Bir karakter  girin");
        char harf=k.next().charAt(0);
        int sonuc=bul(metin,harf);
        System.out.println(sonuc);
        
        
        
        
    }
    
}
