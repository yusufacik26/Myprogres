/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sunday1;

import java.util.Scanner;

/**
 *
 * @author YusufOpens
 */
public class Sunday1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.println("Bir Stirng girin");
String str=k.nextLine();
int sayac=0;
for(int i =0;i<str.length()-1;){
if(str.charAt(i)=='a'&&str.charAt(i+1)=='a'){ sayac++;
i+=2;
}
else i++;
}
        System.out.println("Bu string içinde "+sayac+" tane aa karakteri var");  
}
}