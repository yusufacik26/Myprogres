
package metod.dizi;


public class MetodDizi {
  public static int[] metod1(int[] a){
      int[] sonuc=new int[a.length];
      for(int i =0;i<a.length;i++){
         sonuc[i]=a[i]*a[i];
      
      }
      return sonuc;
  
  }
  public static int kare(int B[]){
      int toplam=0;
      for(int i = 0; i<B.length;i++){
      toplam+=B[i];
      
      }
  return toplam;
  
  }
    
    public static void main(String[] args) {
         int d[]=new int[10];
      for (int i = 0; i < d.length; i++) {
          d[i]=i;  
        }
       int dizi[]=metod1(d); 
      
       int top=kare(dizi);
        
        System.out.println(top);
        
    }
    
}
