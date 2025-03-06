
import java.util.Scanner;

public class ArraysName {
    public static void main(String[] args) {
        String [] name=new String[3];
        Scanner sc =new Scanner(System.in);
        for(int i=0;i<name.length;i++)
        {
            name[i]=sc.next();
        }

        for(int i=0;i<name.length;i++)
        {
            System.out.println(name[i]);
        }



    }
    
}
