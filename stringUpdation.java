import java.util.*;
public class stringUpdation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        
        String d = "Devsmshu";
        String s = "" ;
         int n = d.length() ;
         for (int i = 0; i < d.length(); i++) {
            if(i%2 == 0){
                s+= 'e' ;
            }
            else{
                s += d.charAt(i) ;
            }
            
         }
         System.out.println(s);
        
    }
    
}
