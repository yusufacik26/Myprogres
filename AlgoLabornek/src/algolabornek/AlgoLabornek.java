/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algolabornek;

/**
 *
 * @author YusufOpens
 */
public class AlgoLabornek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  char c[][]={{'A','C','D','E'},{'D','C','A','B'},{'B','A','A','E'},{'A','B','B','A'}};
  char[]anahtar={'A','B','B','C'};
  int dogrusay=0;
  for(int i = 0;i<c.length;i++){
     for(int j = 0;j<c[0].length;j++){
     if(c[i][j]==anahtar[j])dogrusay++;
     
     
     }
      System.out.println((i+1)+" öğrencinin doğru sayısı "+dogrusay);
      dogrusay=0;
  }
    
    
    }
}
