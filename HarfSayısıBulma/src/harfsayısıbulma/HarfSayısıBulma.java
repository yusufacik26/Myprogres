
package harfsayısıbulma;

public class HarfSayısıBulma {
  public static int harfBul(String s , char c){
    int num=0;
  
      for(int i =0; i <s.length();i++){
       char a =s.charAt(i);
       
       if(a==c) num++;
      
      
      
      
      }
      System.out.println(num);
      
  return num;
  
  }
   
    public static void main(String[] args) {
       String d="anam babam neslim";
       char c ='a';
       harfBul(d,c);
    
    }
    
}
