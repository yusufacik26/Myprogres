/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author YusufOpens
 */
public class Soru {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner k  = new Scanner(System.in);
        Random r =new Random();
        int d[][] = new int[3][3];
        int top=0;
        for(int i = 0 ; i<d.length;i++){
          for(int j = 0 ;j<d[0].length;j++ ){
           d[i][j]=r.nextInt(10)+1;
          }
        }
         
        for(int i = 0 ; i<d.length;i++){
          for(int j = 0 ;j<d[0].length;j++ ){
              System.out.print(d[i][j]+" ");
          }
              System.out.println("");
          }
        for(int i = 0 ; i < d[0].length ; i++){
            top=0;
          for(int j = 0 ;j<d.length;j++){
         top+= d[j][i];
          
          }
            System.out.print(top+" ");
        
        }
       
          
          }
    
        
    }
    

  

