
package asalsayimetod;


public class AsalSayiMetod {
public static boolean asalMi(int n ){
if(n<2){
return false;

}

for(int i =2;i<n;i++){
 if(n%i==0) return false;

}

return true;
}
   
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++){
if (asalMi(i) && asalMi(i + 2))
System.out.println(i +" "+ (i + 2));
}
}
    }
    

