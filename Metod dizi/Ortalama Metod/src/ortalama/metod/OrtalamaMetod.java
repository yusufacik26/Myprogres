
package ortalama.metod;

public class OrtalamaMetod {
   public static void ort(int d[],int uzunluk){
     int top =0;
     int orta=0;
       for(int i =0 ;i<d.length;i++){
         top+=d[i];
   }
   orta=top/uzunluk;
   
   for(int i =0 ; i<d.length;i++){
     if(d[i]>orta){
         System.out.println(d[i]);
     }
   
   }
   
   }
  
    public static void main(String[] args) {
        int arr[] = {5, 4, 6, 9, 10,2,3,4,5,6};
        int n =arr.length;
        
        ort(arr,n);
       
        
    }
    
}
