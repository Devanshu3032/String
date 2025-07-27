public class CountVowel {
    public static void main(String[] args) {
        String s = "Devanshu" ;
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
