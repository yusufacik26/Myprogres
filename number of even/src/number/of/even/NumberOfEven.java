
package number.of.even;


public class NumberOfEven {
public static int even(int [][]a){
 int count =0;
    for(int i = 0 ; i < a.length;i++){
        for (int j = 0; j < a[0].length; j++) {
            if(a[i][j]%2==0) count++;
            
        }
    
    
    }
return count;


}
    
    public static void main(String[] args) {
       int d [][]=new int[5][2];
       
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                d[i][j]=(int)(Math.random()*10)+1;
                
            }
 
        }
        System.out.println(even(d));
    }
    
}
