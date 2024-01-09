
package karaktersayısı.metod;


public class KaraktersayısıMetod {
   
public static String text(String d[][],int a ){
    String bos="";
 for(int i = 0 ; i <d.length;i++){
    
   for(int j = 0 ; j<d[0].length;j++){
      if(d[i][j].length()==a) {bos=d[i][j];
       System.out.println(bos);}
   
   }
  bos="";
 }

return bos;


}
    
    public static void main(String[] args) {
        String [][]d={ {"ada","adam","yusuf"},
                        {"emin","alp","eda"} ,
                        {"alperen","ibrahim","mustas"}
        };
        
        text(d,3);
    }
    
}
