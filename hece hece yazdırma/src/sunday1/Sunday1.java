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
  String a =k.nextLine();
  
  for(int i =0;i<=a.length();i++){  //Aslında substring komutunu anlatan çok güzel bir örnek
                                    //önce indis değerimizin nereye kadar gideceğini belirledik   burada 0.indisten a'nın son indisine kadar gittik
      System.out.println(a.substring(0,i));//Burada ise hangi indisten hangi indise yazdırmak istediğimizi belirledik

  }
 
    }
    
    
}