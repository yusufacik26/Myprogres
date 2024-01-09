
package kucukharfmetod;


public class Kucukharfmetod {
    public static String don(String a){
        String bos="";
    for(int i =0;i<a.length();i++){
        char c= a.charAt(i);
     if(c=='a'||c=='b'||c=='c'||c=='d'||c=='e'||c=='f'||c=='g'||c=='h'||c=='i'||c=='j'||c=='k'||c=='l'||c=='m'||c=='n'||c=='o'||c=='p'||c=='r'||c=='s'||c=='t'||c=='u'||c=='v'||c=='y'||c=='z'||c=='w'||c=='x'){
     bos+=c;
     
     
     }
        
    
    }
    System.out.println(bos);
    
    
    return bos;
    
    
    }

    
    public static void main(String[] args) {
        String x="aC2d+x";
        don(x);
    }
    
}
