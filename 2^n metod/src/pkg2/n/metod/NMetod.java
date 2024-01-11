
package pkg2.n.metod;


public class NMetod {
public static int bul(int n ){
    int s=1;
    int top=0;
    
   for(int i =0;i<=n;i++){
    top+=s;
    s=s*2;
   }
    System.out.println(top);
    
    
    return n;
}
   
    public static void main(String[] args) {
        bul(2);
    }
    
}
