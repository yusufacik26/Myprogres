
package javaapplication222;


public class JavaApplication222 {
 
    public static String ters(String a ){ // soru rekürsif dediği için biraz değiştirmem lazımdı burda parametre olarak bir String aldım
   String bos="";   //yeni ters string için ayrı bir string ekledim

        for (int i = a.length()-1 ; i>=0; i--) { //Stringin son elemanından başlayıp ters şekilde elemanlarını ekleyen
                                                 // bir döngü
            bos+=a.charAt(i);
            
            
        }
bos=bos.replace(" ", ""); // burada boşlukları kaldırdım

return bos; //son bos'u döndürdüm

}
   
    public static void main(String[] args) {
        String a =" anam babam";
        
        System.out.println(ters(a)); 
        
        
    }
    
}
