public class append {
    public static void main(String[] args) {
        StringBuilder sd = new StringBuilder("fues");
        System.out.println(sd);
        sd.append(123);
        System.out.println(sd);
        char[] arr = {'e','r','t'};
        sd.append(arr);
        System.out.println(sd);
        StringBuilder df = new StringBuilder("Defva");
        df.append("dsd");
        df.append(arr) ;
        System.out.println(df);
    }
}
