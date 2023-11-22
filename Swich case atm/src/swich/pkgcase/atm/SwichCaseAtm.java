/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swich.pkgcase.atm;

import java.util.Scanner;

/**
 *
 * @author YusufOpens
 */
public class SwichCaseAtm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner k=new Scanner(System.in);
        
      int  select;
        int balance=2000;
        int right=3;
        while(right>0){
            System.out.println("Kullanıcı adınızı giriniz");
        String userName=k.nextLine();
        System.out.println("Şifrenizi giriniz ");
        String password=k.nextLine();
       if(userName.equals("yusuf")&&password.equals("12345ysf")){
      do{     
       System.out.println("Yapmak istediğiniz işlemi giriniz");
       System.out.println("1-----Para çekme\t"
                + "2-----para yatırma\t"
                + "3----- Hesap bakiyesi gösterme\t "
                + "4----- çıkış\t");    
       select=k.nextInt();
       
        
       switch(select){ 
           case 1: System.out.println("Çekmek istediğiniz tutarı giriniz");
                   int price=k.nextInt();
             if(price>balance){
                System.out.println("Yetersiz bakiye");
                break;
                     
                     }
             else
                balance-= price; break;
                    
           case 2:System.out.println("Yatırmak istediğiniz miktarı girin");          
                   price=k.nextInt();
                  balance+=price;
                  break;
           case 3:System.out.println("BAKİYENİZ =="+balance);
           break;
           
           case 4:System.out.println("İyi günler dileriz");
           break;
    
       }
      }
      while(select!=4);System.out.println("Tekrar görüşmek üzere");
      break;
      
       }
       else {
           right--;
           System.out.println("Lütfen şifrenizi ve kullanıcı adınızı  düzgün giriniz");
           System.out.println("Kalan hakkınız = "+right);
       if(right==0)System.out.println("HESAP BLOKE EDİLDİ");
       }
        }
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
    }
    
}
