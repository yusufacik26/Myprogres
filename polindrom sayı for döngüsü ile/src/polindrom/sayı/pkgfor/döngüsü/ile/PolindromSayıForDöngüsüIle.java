/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polindrom.sayı.pkgfor.döngüsü.ile;

import java.util.Scanner;

/**
 *
 * @author YusufOpens
 */
public class PolindromSayıForDöngüsüIle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        String num1=k.next();
        String num2="";
        
        for(int i=num1.length()-1;i>=0;i--){
        char c =num1.charAt(i);
        num2+=c;

        }
        if(num2.equals(num1))System.out.println("POLİNDROM SAYI");
        else System.out.println("POLİNDROM SAYI DEĞİLDİR");
        
        
    }
    
}
