/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication96;

import java.util.Scanner;

/**
 *
 * @author YusufOpens
 */
public class JavaApplication96 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner k =new Scanner(System.in);
        String userName;
        String password;
        int right=3;
        int balance=1500;
        int select;
        while(right>0){ System.out.print("Kullanıcı Adınız :");
            userName = k.nextLine();
            System.out.print("Parolanız : ");
            password = k.nextLine();
        if(userName.equals("patika")&&password.equals("1234kod")){
          System.out.println("Hesabınıza başarıyla giriş yaptınız!!");
            do{
            
            System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
            System.out.println("Yapmak istediğiniz işlemi seçiniz");
            select=k.nextInt();
            if(select == 1){
                System.out.println("Yatırmak istediğiniz para miktarını girin");
                int price=k.nextInt();
            balance+=price;
                System.out.println("Para miktarınız ="+balance);
            }
            else if (select == 2){
                System.out.println("Çekmek istediğinz para miktarını giriniz");
                int price=k.nextInt();
            if(price>balance)System.out.println("YETERSİZ BAKİYE");
            
            else { 
            balance-=price;
                System.out.println("Bakiyeniz = "+balance);
                 }       
            }
            else if (select==3){
                    System.out.println("Bakiyeniz ="+balance);
                             }         
           }

        while(select!=4);
            System.out.println("GÖRÜŞMEK ÜZERE");
        break;
        }
        else{
            right--;
            System.out.println("Hatalı kullanıcı adı veya şifre lütfen tekrar deneyiniz");
            if(right==0)System.out.println("Hesabınız bloke olmuşuştur");
            else{
            
            
            System.out.println("Kalan hakkınız = "+right);
            }

        }

        }
        

        
    }
    
}
