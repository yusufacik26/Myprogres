

package pkg29aralıklabders;
public class Main {

public static void yazdir(){ //void geri parametre olarak döndürmez sadece tek bir değeri alır 
    System.out.println("Günlerden CUMa");

}    
public static void selamla(String isim){
    System.out.println("Merhaba "+isim);

}

public static void toplaveYazdir(int a, int b){
    System.out.println("a ve b sayılarının toplamının sonucu "+(a+b)+" dir");

}



    public static void main(String[] args) {
        yazdir();
        selamla("Yusuf");
        toplaveYazdir(1,2);
    }
    
}
