
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        
        // //nt[] marks= new  int[10];
        // // marks[0]=12;
        // // marks[1]=65;  
        // // // System.out.println(marks); --> Print garbage value
        // // System.out.println(marks[1]);

        // // int[] data= {1,4,5,6,8,8,9,23,11};
        // // for(int i=0;i<=5;i++)
        // {
        //     System.out.println(data[i]);
        // }


        Scanner sc =new Scanner(System.in);
        int size=sc.nextInt();
        int numbers[]= new int[size];
        
        for(int i=0;i<size;i++)
        {
            numbers[i]=sc.nextInt();
        }

        for(int i=0;i<size;i++)
        {
            System.out.println(numbers[i]);
        }

    }
}
