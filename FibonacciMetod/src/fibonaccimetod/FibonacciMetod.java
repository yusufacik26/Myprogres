
package fibonaccimetod;


public class FibonacciMetod {
  
    
    public static int fibo(int n){
    int f1=1;
    int f2=1;
    int fn=1;
    
        System.out.print(f1+" "+f2+" ");
        
        for(int i =0; i < n ; i++){
        fn=f1+f2;
            System.out.print(fn+" ");
        f1=f2;
        f2=fn;
        
        }
    
    
    
    
    return fn;
    
    
    
    }
    public static void main(String[] args) {
        int n =5;
        fibo(n);
    }
    
}
