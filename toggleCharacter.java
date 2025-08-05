public class toggleCharacter {
    public static void main(String[] args) {
        String s  = "DevsnshU" ;
        StringBuilder sd  = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            char ch = sd.charAt(i) ;
            int ascii = (int)ch ;
            if(ascii >= 65 && ascii <= 90){
                ascii +=32 ;
                ch = (char)ascii ;
                sd.setCharAt(i,ch);
                
            }
            else if(ascii >= 97 && ascii<=122){
                ascii -= 32 ;
                ch = (char)ascii;
                sd.setCharAt(i, ch);
                
            }
        }
        System.out.println(sd);
    }
    
}
