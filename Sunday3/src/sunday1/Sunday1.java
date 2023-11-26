/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sunday1;

import java.util.Scanner;

/**
 *
 * @author YusufOpens
 */
public class Sunday1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.println("Bir binary sayı giriniz");
int b=k.nextInt();
        int sonuc=0;    //YAPILIŞ MATEMATİĞİ ŞUDUR BİNARY SAYILAR BİRLER BASAMAĞINDAN İTİBAREN 2NİN KUVVETLERİNDEN BAŞLAR
       int i=1;        // BU YÜZDEN BİNARY SAYININ HER BASAMAĞINI 2ÜSSÜ 0 DAN BAŞLAYARAK HER BASAMAĞI ÇARPIP SONUÇLARINI TOPLADIK
int kalan;
       while(b>0){
           kalan=b%10;     //11111 İÇİN        //2^0*1=1     2^1*1=2   2^2*1=4......  2^4*1=16 ==== 31
           sonuc+=kalan*i;
          i*=2; 
          b/=10;

}
        System.out.println(sonuc);
        
        
       
        
    }
    
}
