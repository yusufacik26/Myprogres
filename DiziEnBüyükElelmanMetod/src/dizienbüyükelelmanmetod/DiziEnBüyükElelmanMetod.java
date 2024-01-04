
package dizienbüyükelelmanmetod;

class DiziEnBüyükElelmanMetod {
 
    public static int max(int a[]){
    int max =a[0];
    for(int i =0;i<a.length;i++){
      if(a[i]>max) max = a[i];
    
    
    }
        System.out.println("En büyük eleman "+max);
    return max;
    }
    
    
    
    
    
    
    
    
  
    public static void main(String[] args) {
       int arr[] = {12, 13, 1, 10, 34, 10, 21, 54, 78, 3, 91, 54};
       max(arr);
    }
    
}
