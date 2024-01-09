
package javaapplication201;

public class JavaApplication201 {
   
    public static int neg(int d[]){
     int top=0;
        for(int i =0; i<d.length;i++){
          if(d[i]<0) top+=d[i];
     

     }
    
    return top;
    
    }
    
    public static void main(String[] args) {
        int d[]={1,2,3,4,5,6,-1,-2,-3,-4,-5};
        
        System.out.println(neg(d));
        
        
    }
    
}
