
package yerdeğitirensayılar;

import java.util.Scanner;

public class YerDeğitirenSayılar {

    public static void main(String[] args) {
       Scanner k = new Scanner(System.in);
        System.out.println("Dizi boyutunu gir");   
        int a = k.nextInt();
        int d[]=new int[a];
        
        for(int i = 0 ;i<a;i++){
            System.out.println("Değerleri girin");
        d[i]=k.nextInt();
        
        } for(int i = 0 ;i<a;i++){
            System.out.print(d[i]+" ");
        }
        
        for(int i = 0;i<a;i+=2){
        if(i+1<a){
        int temp = d[i];
                d[i] = d[i + 1];
                d[i + 1] = temp;
        }
        }
         System.out.println("\nYENİ DİZİ:");
        for (int i = 0; i < a; i++) {
            System.out.print(d[i] + " ");
        }
    }
}

