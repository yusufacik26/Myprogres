
package pratik;




public class Pratik {

    
    public static int neg(int []d){
    
    
    int negatifler=0;
    
        for (int i = 0; i <d.length; i++) {
            if(d[i]<0) negatifler+=d[i];
        }
    
    return negatifler;
    
    
    
    
    
    }


    public static void main(String[] args) {
int d[]={1,2,3,4,5,6,7,7,-4,8,-1,-2,-4};


        System.out.println(neg(d));    

    
    
    
    
    
    
    
    
    
    
    
    }
    
    

        

        
        
        
        
        
        
    }
    
    
       

    

