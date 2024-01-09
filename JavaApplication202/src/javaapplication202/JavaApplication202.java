package javaapplication202;

import java.util.Random;


public class JavaApplication202 {
   public static void tekd(int d[][],int a,int b ){
       int c =a*b;
       int id=0;
       
       
       int dizi[]= new int[c];
    for(int i =0;i<d.length;i++){
      for(int j =0;j<d[0].length;j++){
        dizi[id]=d[i][j];
        id++;
      
      
      
      }
      
      }
        System.out.println("TEK BOYUTLU DİZİ");

        for(int k =0;k<dizi.length;k++){
            System.out.print(dizi[k]+" ");
        }
 }   
   
   
   
    
    public static void main(String[] args) {
      Random r = new Random();
    int g[] []=new int[5][4];
    
    for(int i =0;i<g.length;i++){
      for(int j =0;j<g[0].length;j++){
    g[i][j]=r.nextInt(10)+1;}
    
    
    
    
    }
    tekd(g,5,4);

    }
}