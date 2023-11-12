/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods2.pkg0;

/**
 *
 * @author YusufOpens
 */
public class Methods20 {

    public static boolean primenum(int a ){
    boolean result=true;
        for(int i =2;i<a;i++){
    if(a%i==0) {result =false; break;       }
    
    
    
    }
    return result;
    
    
    
    
    
    }
    
    
    
    
    public static double average(int a,int b ){
     int equal=a+b;
     double average1=equal/2;
    return average1;
    }
    
    
    public static void main(String[] args) {
        System.out.println(average(20,12));
        
        boolean result=primenum(3);
        System.out.println(result);
        
        
        
    }
    
}
