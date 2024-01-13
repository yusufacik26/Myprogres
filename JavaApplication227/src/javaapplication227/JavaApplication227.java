
package javaapplication227;


public class JavaApplication227 {
 
    public static int fakt(int n){
    
    int top=1;
    if(n==0) System.out.println(top);
    else{
       for(int i =1;i<=n;i++){
       top*=i;
       
       
       
       }
    
    
    
    
    }
    
    
    
    
    
    return top;
    
    }
    
    
  
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(fakt(5));
    
    }
    
}
