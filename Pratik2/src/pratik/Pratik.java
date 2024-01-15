
package pratik;




public class Pratik {

    
    public static String harf(String s [][]){
    
    String a="";
        for (int i = 0; i <s.length; i++) {
            for (int j = 0; j < s[0].length; j++) {
                 if(s[i][j].charAt(0)=='A') {
                 a=s[i][j];
                 
                 
                 System.out.println(a);               
            
                 
                 
                 }
                 a=" ";
            
            }
            
            }
    
    
    
    
    return a;
    
    
    } 
    
   
    
    public static void main(String[] args) {
   String[][] s = {
                {"Alice", "Aardvark", "Apple"},
                {"africa", "Ant", "Avocado"},
                {"Abacus", "Alligator", "Apricot"}
        };
       
    harf(s);
    
    
    }
    
    
       
       
    }
    

