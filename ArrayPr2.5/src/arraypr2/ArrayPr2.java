/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraypr2;

import java.util.Scanner;

/**
 *
 * @author YusufOpens
 */
public class ArrayPr2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
        Scanner k =new Scanner(System.in);
        System.out.println("Öğrenci sayısını giriniz");
        int ogrsayi=k.nextInt();
        int Grades[]=new int[ogrsayi];
    int eniyi=0;
    for(int i =0; i <=Grades.length-1;i++){
      Grades[i]=k.nextInt();
      if(Grades[i]>eniyi) eniyi=Grades[i];
    }
    for(int i =0;i<=Grades.length-1;i++){
        if(Grades[i]>=(eniyi-10)) System.out.println("Öğrenci "+(i+1)+" notu "+Grades[i]+" Harf notu A");
        else if(Grades[i]>=(eniyi-20)) System.out.println("Öğrenci "+(i+1)+" notu "+Grades[i]+" Harf notu B");
        else if(Grades[i]>=(eniyi-30)) System.out.println("Öğrenci "+(i+1)+" notu "+Grades[i]+" Harf notu C");
        else if(Grades[i]>=(eniyi-40)) System.out.println("Öğrenci "+(i+1)+" notu "+Grades[i]+" Harf notu D");
        else if (Grades[i]>=(eniyi-50)) System.out.println("Öğrenci "+(i+1)+" notu "+Grades[i]+" Harf notu F");
         }

}
      
      
}   
      
    
    

