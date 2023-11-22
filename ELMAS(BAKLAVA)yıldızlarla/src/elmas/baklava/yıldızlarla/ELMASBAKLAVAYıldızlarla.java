/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elmas.baklava.yıldızlarla;

import java.util.Scanner;

/**
 *
 * @author YusufOpens
 */
public class ELMASBAKLAVAYıldızlarla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner kb=new Scanner(System.in);
        System.out.println("Elmas şeklinizin boyutunu giriniz");
        int n =kb.nextInt();
       for(int i=1;i<=n;i++){//1.sütundan başladı ordan n 6 olsa i şuan 1 olduğu için 6-1 den 5.sütuna kadar boşluk bırakacak
        for(int j=1;j<=(n-i);j++){
            System.out.print(" ");
        
        }                                     //bu iki satır bitişiktir
       for(int k =1;k<=(2*i)-1;k++){//i değerinin 2 katının 1 eksiği kadar sütuna yıldız bastıracak i değeri şuan 1 olduğu için
           System.out.print("*");    //bırakılan boşukların ardına j 2i-1 değeri 1 olduğu için 1 tane yıldız koyar
            
       
       }
           System.out.println(); //Her ilk for döngüsünün sonunda bir kere alt satıra geçmesini sağlar

       }
       for(int i =n;i>=1;i--){
        for(int j=(n-i);j>=1;j--){
            System.out.print(" ");
        }
       for(int k=(2*i)-1;k>=1;k--){
           System.out.print("*");
       }
           System.out.println();
       
       
       }
       
       
       
       
       
       
       
       
       
       
       
       
       
    }
    
}
