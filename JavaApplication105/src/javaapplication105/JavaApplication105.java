/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication105;

import java.util.Scanner;

/**
 *
 * @author YusufOpens
 */
public class JavaApplication105 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner k=new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
int a =k.nextInt();
int divisor=0;
for(int i =1;i<a;i++){
if(a%i==0){
divisor+=i;

}


}
if(a==divisor)System.out.println("MÜKEMMEL SAYI");
else System.out.println(a+" sayısı mükemmel sayı değilidir");



    }
    
}
