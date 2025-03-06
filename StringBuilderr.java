public class StringBuilderr {
    public static void main(String[] args) {
        
        StringBuilder sb= new StringBuilder("Neha");
        //System.out.println(sb);

        //Character At
       // System.out.println(sb.charAt(0));

        //set character at index
        sb.setCharAt(1, 'P');
        System.out.println(sb);

        //insert at index

        sb.insert(0, "y");
        System.out.println(sb);

        // delete 
        sb.deleteCharAt(0);
        System.out.println(sb);

        sb.delete(0, 2);
        System.out.println(sb);

        // append
        sb.append("ha");
        System.out.println(sb);
          

        //length
        System.out.println(sb.length());

        

    }
    
}
