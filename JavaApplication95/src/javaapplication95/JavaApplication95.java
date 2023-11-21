/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication95;

import java.util.Scanner;

/**
 *
 * @author YusufOpens
 */
public class JavaApplication95 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner klavye=new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz ");
           int age=klavye.nextInt();
        System.out.println("Gitmek istediğiniz mesafeyi girin");
           int km=klavye.nextInt();
        double tutar=0;
        System.out.println("Lütfen bilet türünüzü seçiniz");
          System.out.println("Eğer tek yön ise 1' gidiş-dönüş ise 2 yi seçiniz");
            int ticket=klavye.nextInt();
        
        if(km<0||age<0||ticket<0||ticket>2){
            System.out.println("Lütfen girdiğiniz değerlerin doğru olduğundan emin olunuz");
         }
        else {if(age<12){
        tutar+=(km*(0.10))-(km*(0.10))/2;
           }
              else if (age>12&&age<24){
               tutar+=(km*(0.10))-(km*(0.10))/10;
             }
             
              else if(age>24&&age<65){
              tutar+=(km*(0.10));
                } 
              else if (age>65){
              tutar+=(km*(0.10))-((km*(0.10))*(3/10));
              }
              
          if(ticket==2){
           tutar-=(km*(0.10))/5;
          
          
          }
        
        }
        System.out.println("Bilet fiyatınız "+tutar+" TL'dir");
        
        
        
        
    }
    
}
