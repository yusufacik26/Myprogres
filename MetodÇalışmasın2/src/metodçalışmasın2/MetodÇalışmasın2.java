/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodçalışmasın2;




public class MetodÇalışmasın2 {
static void summ(int a ,int b ){
int result=a +b;
    System.out.println(result);

}
  static int sum(int a, int b){
 int result=a+b;
return result; //BURASININ SEBEBİ BİZE BİR DEĞER DÖNDÜRMESİNİ İSTEDİĞİMİZ İÇİN VAR CEVABI ALABİLMEK İÇİN YANİ
  }
    public static void main(String[] args) {
        System.out.println(sum(2,4));  
        summ(2, 5);
    }
    
}
