
package palindrom.metod;


public class PalindromMetod {
public static String palindrom(String d[][]){
String b="";
String e="";

 for(int i =0;i<d.length;i++){
     
  for(int j =0;j<d[0].length;j++){
      e=d[i][j];
       for(int k = e.length()-1;k>=0;k--){
       b+=e.charAt(k);
       
       
       }
      if(b.equals(e)) System.out.println(b); 
  b="";
  }
 
 
 }

return b;

}
    
    public static void main(String[] args) {
        String[][] d = {
            {"kek", "1221", "Csd"},
            {"123", "kabak", "311"},
            {"323", "aga", "sda"}
        };
        palindrom(d);
    }
  
    
}
