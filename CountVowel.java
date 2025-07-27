import java.util.*;
public class CountVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the word :");
        String s = sc.nextLine() ;
        String c = "AEIOUaeiou" ;
        int count = 0 ;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < c.length(); j++) {
                
                if(s.charAt(i) == c.charAt(j) ){
                    count++ ;
                }
            }
            
        }
        System.out.print(count);
    }
    
}
