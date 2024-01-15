
package pratik;




public class Pratik {

    
  public static String sutun(String [][]s){
  String bos="";
  
      for (int i = 0; i < s.length; i++) {
           for (int j = 0; j < s[0].length; j++) {
              bos+=s[j][i];              
          }
           System.out.println(bos);
         bos="";
      }
  return bos;
  }
    public static void main(String[] args) {
String[][] twoDArray = {
            {"A", "B", "C"},
            {"D", "E", "F"},
            {"G", "H", "I"}
        }; 

    
    sutun(twoDArray);
    
    
    
    
    
    
    
    
    
    }
    
    

        

        
        
        
        
        
        
    }
    
    
       

    

