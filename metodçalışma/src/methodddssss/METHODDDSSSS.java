/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodddssss;

import java.util.Scanner;

/**
 *
 * @author YusufOpens
 */
public class METHODDDSSSS {
    public static void biggestnumber(int numA,int numB){
    if(numA>numB){System.out.println("Number"+numA+"bigger the"+numB);}
    else if(numB>numA){System.out.println("Number "+numB+" bigger the number "+numA);}
    else System.out.println("The numbers equal!!");
    
    
    }

    public static void average(int num1,int num2){
   int equal=num1+num2;
    double average1=equal/2;
        System.out.println(average1);
    
    
    
    }
    public static void main(String[] args) {
      Scanner k=new Scanner(System.in);
        System.out.println("Please enter a number :");
        int num1=k.nextInt();
        System.out.println("Please enter a number again");
        int num2 =k.nextInt();
        average(num1,num2);
      
        
         System.out.println("Please enter a number :");
        int numA=k.nextInt();
        System.out.println("Please enter a number again");
        int numB =k.nextInt();
        biggestnumber(numA,numB);
      
        
        
        
        
        
        
        
    }
    
}
