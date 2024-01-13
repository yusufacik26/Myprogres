
package karehesabı;


public class KareHesabı {
public static void kareAl(int d []){
    for (int i = 0; i < 10; i++) {
        d[i]=d[i]*d[i];
    }



}
public static int sonuc(int d[] ){
 int top=0;
    for (int i = 0; i < 10; i++) {
        top+=d[i];
    }
return top;
}
    
    public static void main(String[] args) {
        int d []={0,1,2,3,4,5,6,7,8,9};
     kareAl(d);
      sonuc(d);
        System.out.println(sonuc(d));
     
    
    
    
    }
    
}
