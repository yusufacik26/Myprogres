
package hogwartkorumak;

import java.util.Arrays;
public class HogwartKorumak {

    public static String palindrom(String s [][]){
    
    String p="";
    String palindrom[]=new String[(s.length)*(s[0].length)];
    int id=0;
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[0].length; j++) {
              for(int k=s[i][j].length()-1;k>=0;k--)         {
              p+=s[i][j].charAt(k); 
              }
              if(p.equals(s[i][j])){
                palindrom[id]=p;
                id++;
              }
              p="";
            }   
        }
        System.out.println(Arrays.toString(palindrom));
    
    return p;
    }
    
    public static void main(String[] args) {
        String s[][]={  {"aga","yusuf","ada"},
                        {"talat","necmi","nazif"}
        };
    
    palindrom(s);
    
    
    }
    
}
