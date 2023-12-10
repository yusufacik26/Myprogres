/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package çok.boyutlu.diziler;

/**
 *
 * @author YusufOpens
 */
public class ÇokBoyutluDiziler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int dizi[][]=new int[3][3]; //SIRASIYLA SATIR VE SÜTUN
      
      
      int list[][]={ {0, 453, 939, 243, 783, 891},
                {453, 0, 490, 384, 620, 439},
                {939, 490, 0, 839, 863, 423},
                {243, 384, 839, 0, 544, 823},
                {783, 620, 863, 544, 0, 1045},
                {891, 439, 423, 823, 1045, 0}
      
      
      };
        //System.out.println(list.length);//Satır sayısını veriri
      //  System.out.println(list[0].length);//SÜTUN SAYISINI VERİR!!!
        
        
    
            int num=1;
    int matris[][]=new int[3][4];
    for(int i =0;i<=matris.length-1;i++){
     
        for(int k=0;k<=matris.length-1;k++){
             matris[i][k]=num++;
       }

    }
    
    
        for(int i =0;i<=matris.length-1;i++){
            System.out.println();
            for (int k=0;k<=matris.length-1;k++){
                System.out.print(matris[i][k]+" ");
            
            
            }
        
        
        }
    
    
    
    
    
    
    
    
    
    }
    
}
