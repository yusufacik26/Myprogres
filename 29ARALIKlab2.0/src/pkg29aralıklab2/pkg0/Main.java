
package pkg29aralıklab2.pkg0;


public class Main {
  
    public static int topla(int sayi1, int sayi2){
    int toplam=sayi1+sayi2;
    return toplam;
    }
   public static double average(double a, double b ){
   double sum=a+b;
   double average=(a+b)/2;
   return average;
   }
    public static void main(String[] args) {
         int toplam=topla(2,3);
         System.out.println(toplam);
       
        double avarage=average(5,4);
        System.out.println(avarage);
    }
    
}
