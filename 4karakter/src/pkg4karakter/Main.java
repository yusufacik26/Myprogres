/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4karakter;

/**
 *
 * @author YusufOpens
 */
public class Main {
    public static String kelime(String d[][]){
        String s="";
        for (int i = 0; i <d.length; i++) {
            for (int j = 0; j < d[0].length; j++) {
                if(d[i][j].length()==4){
                s=d[i][j];
                    System.out.println(s);
                
                }
                
            }
        }
 return s;
 
 
 
 }
    public static void main(String[] args) {
        String [][] d= {  {"adam","mercimek","apta"},
                          { "madam","dasa","fdsa"            }
        
        
        
        
        };
    kelime(d);
    
    
    }
    
}
