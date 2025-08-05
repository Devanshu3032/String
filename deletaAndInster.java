public class deletaAndInster {
    public static void main(String[] args) {
        StringBuilder df = new StringBuilder("abcdf");
        System.out.println(df);
        df.deleteCharAt(3);
        System.out.println(df);
        System.out.println(df.charAt(3));
        df.delete(2, 5);
        System.out.println(df);
        df.indexOf("g", 2);

    }
    
}
