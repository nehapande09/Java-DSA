public class Reversestring2 {
    public static void main(String[] args) {
        // Here we are using string class instead of stringbuilder
        String s ="neha";
        for(int i=s.length()-1;i>=0;i--)
        {
           System.out.print(s.charAt(i));
        }
    }
}
