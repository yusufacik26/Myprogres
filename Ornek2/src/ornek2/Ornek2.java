
package ornek2;

import java.util.Random;


public class Ornek2 {
public static int[] dizi(){
    Random r = new Random();
    int d[]=new int[10];
     for(int i =0;i<d.length;i++){
      d[i]=r.nextInt(10)+1;    
    }
   return d;


}
public static void yaz(int[]d){
  for(int i =0;i<d.length;i++){
      System.out.println(d[i]);
  }


}
  
  public static int[] tekcift(int d[]){
  int tek=0;
  int cift=0;
    for(int i =0;i<d.length;i++){
     if(d[i]%2==0) cift++;
     else tek++;
    
    }
  int t[]=new int[tek];
  int t1=0;
  int c[]=new int[cift];
  int c1=0;
    
    for(int i =0;i<d.length;i++){
     if(d[i]%2==0){ cift++;
     c[c1]=d[i];
     c1++;
     
     }
     
     else {tek++;
     t[t1]=d[i];
     t1++;
     }    
    }
      System.out.println("--------------tekler--------------");
  yaz(t);
  
      System.out.println("----------ciftler--------------");
  yaz(c);
  return d;
  }
    public static void main(String[] args) {
      Random r = new Random();
      int d[]=dizi();
      yaz(d);
      tekcift(d);
    }
    
}
