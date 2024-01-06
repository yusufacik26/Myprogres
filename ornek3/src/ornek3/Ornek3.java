/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ornek3;

/**
 *
 * @author YusufOpens
 */
public class Ornek3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String word[]={"Java", "Python", "C#", "JavaScript", "Ruby"};
        int max=word[0].length();
        String m=word[0];
        int min=word[0].length();
        String mini=word[0];
        
        for(int i =0;i<word.length;i++){
         if(word[i].length()>max) m=word[i]; 
        
        
        if(word[i].length()<min) mini=word[i];
        
        }
        System.out.println("En uzun kelime ==== "+m);
        System.out.println("En kısa kelime ==== "+ mini);
    }
    
}
