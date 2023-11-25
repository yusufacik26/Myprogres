/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iki.sayının.bölme.işlemini.çıkartma.ike.yap;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author YusufOpens
 */
public class İkiSayınınBölmeIşleminiÇıkartmaIkeYap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int x= 0;
int y= 0;
for (int z = 0; z < 7; z++)
{                            //  0     1     2   3    4      5    6    7       7nin işlemleri      
if (( x++ > 2 ) && (y++ > 2))// 0 0  1 0   2 0  3 0   4 1   5 2  6 3  7 4      8  12   8 11
{                            

}
System.out.println(x + " " + y);
    }
}
}