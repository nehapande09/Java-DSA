public class ReverseString {
    

    public static void main(String[] args) {

      // In this program we are using String Builder class instead of string
      
       StringBuilder sb=new StringBuilder("Neha");

       for (int i=0; i<sb.length()/2 ; i++)
       {
        int front =i ;
        int back = sb.length()-1-i;// 4-1-0

        char frontchar= sb.charAt(front);
        char backchar = sb.charAt(back);

          sb.setCharAt(front, backchar);
          sb.setCharAt(back, frontchar);

       }

       System.out.println(sb);


    }
}
