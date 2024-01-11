
package aynıstring;


public class AynıString {
public static String ayni(String a,String b){
String bos="";



      for(int i = 0 ; i < a.length();i++){
           if(a.charAt(i)==b.charAt(i)) bos+=a.charAt(i);

}
 
      System.out.println(bos);
      return bos;





}
    
    public static void main(String[] args) {
       String a="Kelamlcc";
       String b ="Kalemlik";
    
    
    ayni(a,b);
    
    
    
    
    
    
    
    
    
    
    }
    
    
    
    
}
