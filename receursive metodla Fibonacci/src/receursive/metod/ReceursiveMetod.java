/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package receursive.metod;

/**
 *
 * @author YusufOpens
 */
public class ReceursiveMetod {

  static int fib(int n ){
  if(n ==1 || n==2){
      return 1 ;}///Değer olarak 1 değerini döndürür eğer f 1 veya f2 ise sonuç olarak bize 2 değerini verir.
  return fib(n-1)+fib(n-2);
  
  }
    public static void main(String[] args) {
        System.out.println(fib(7));  
    }
    
}
