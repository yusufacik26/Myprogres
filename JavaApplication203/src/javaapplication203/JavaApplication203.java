
package javaapplication203;


public class JavaApplication203 {
  
  public static void array(String d[][],String a[]){
      int id=0;
   for(int i =0;i<d.length;i++){
     for(int j = 0 ; j < d[0].length;j++){
       
          a[id++]= d[j][i];
 
     }
   
   }
  for(int i = 0 ; i <a.length;i++){
      System.out.print(a[i]+" ");
  
  
  }
  
  }

    public static void main(String[] args) {
               String[][] d = {
                {"A", "B", "C"},
                {"1", "2", "3"},
                {"X", "Y", "Z"}
        };
String d1[]=new String[d.length*d[0].length];

       
        array(d,d1);
        
        
    }
    
}
