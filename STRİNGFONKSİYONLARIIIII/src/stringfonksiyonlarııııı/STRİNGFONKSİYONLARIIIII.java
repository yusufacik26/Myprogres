/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringfonksiyonlarııııı;

import java.util.Scanner;

/**
 *
 * @author YusufOpens
 */
public class STRİNGFONKSİYONLARIIIII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String isim="Yusuf Açık";
       


//DİZİNİN UZUNLUĞUNU GÖSTERİR
       
        System.out.println(isim.length());
        
        //DİZİDEKİ TÜM HARFLERİ BÜYÜK YAPAR
        String buyukisim=isim.toUpperCase();
        
           System.out.println(buyukisim);
        
           
           
           //DİZİDEKİ TÜM HARFLERİ KÜÇÜK YAPAR
           String kucukisim=isim.toLowerCase();
           System.out.println(kucukisim);
           

            // DİZİ İçerisinde (   yusuf açık    )gibi boşlukları siler
        System.out.println(isim.trim());
        //Değişkenin hemen yanına ekleme fonksiyonu
        String ad="Yusuf";
        ad=ad.concat(" ");
        String soyad="Açık";
        String tamisim=ad.concat(soyad);
        System.out.println(tamisim);
        
        
        //DİZİDEKİ SEÇİLEN İNDİSDEKİ KARAKTERİ VERME
        String ism="Yusuf";
                System.out.println(ism.charAt(2));
        
        
        
        //DİZİDEKİ SEÇİLEN İNDİSDEKİ KARAKTERİN İNDİSİNİ VERME
        System.out.println(ism.indexOf("u"));
        
        
        System.out.println(ism.substring(0,3)); //Belirli bir aralıktan diziyi okumaya başlatıp sonra belirlenen aralığa kadar yazdırma
        
        
        
        System.out.println(ism.contains("Yusuf"));//Belirli bir yazıyı o string içinde var mı diye  bakar
        
        
        // REPLACE METODU ADINDAN DA ANLAYABİLECEĞİMİZ GİBİ VERİLEN STRİNGİN İÇİNDEN BİZİM BELİRDEĞİMİZ STRİNG İLE YER DEĞİŞTİRİR
        
        ism="Attila Canlı";
        
    ism=ism.replace("Canlı","ÖLÜ");
        System.out.println(ism);
        
        //Stringi parçalara ayırma
        String söz="ne mutlu Türküm diyene";
         String kelimeler[]=söz.split(" ");
         System.out.println(kelimeler[0]);
         System.out.println(kelimeler[1]);
         System.out.println(kelimeler[2]);
         System.out.println(kelimeler[3]);
         
         //TC KİMLİK UYGULAMASI MAAŞ -ZAMAN
         Scanner k=new Scanner(System.in);
         String kimlik=k.nextLine();
         char sonrakam=kimlik.charAt(10);
         switch(sonrakam){
             case '0' :System.out.println("01.01.2023"); break;
             case '2':System.out.println("02.01.2023"); break;
             case '4':System.out.println("03.01.2023"); break;
             case '6':System.out.println("04.01.2023"); break;
             case '8':System.out.println("05.01.2023"); break;
             default :System.out.println("Bir hata oluştu lütfen doğru tc girin"); break;
         
         
         
         
         }
         
         
         
         
         
         
         
         
         
         
         
         
    }
    
}
