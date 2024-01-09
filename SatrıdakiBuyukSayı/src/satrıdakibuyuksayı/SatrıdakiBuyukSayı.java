
package satrıdakibuyuksayı;


public class SatrıdakiBuyukSayı {
 public static int buyuk(int d[][]){
 int max=d[0][0];
  for(int i =0;i<d.length;i++){
   for(int j=0;j<d[0].length;j++){
    if(d[i][j]>max) max=d[i][j];
    
   
   }
      System.out.println(max);
 max=0;
  }
 return max;
 
 
 
 }
   
    public static void main(String[] args) {
        int d[][]={  {1,2,3},
                    {-1,23,4},
                    {11,33,55}
  
        };
       buyuk(d);
    }
    
}
