/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foreacej;

/**
 *
 * @author YusufOpens
 */
public class ForEacej {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dizi[]={1,2,3,4,5};
       for(int i =0;i<dizi.length;i++){
           System.out.println(dizi[i]);
       } 
int sum=0;
       for(int i:dizi){
            sum+=i;
        }
        System.out.println(sum);
        
         String Cars[]={"Mercedes","BMW","Ford"};
        for(String str :Cars){
            System.out.println(str);
            
        
        }
        
        
        //UZUN FOR İÇİNİ BU ŞEKİLDE ÇOK DAHA KOLAY GÖRÜNÜR HALE GETİRMEKTE
        int array[][]={{1,2,3},
                      {4,5,6},
                      {7,8,9}
       
        
        };
        for(int[]row:array){
         for(int col:row){
               System.out.print(col+" ");        
         
         }
            System.out.println();
        
        }
        
    }
    
    
    
    
    
}
