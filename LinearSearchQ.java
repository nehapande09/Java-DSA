
import java.util.Scanner;

public class LinearSearchQ{
    public static void main(String[] args) {
        int arr[]=new int[5];
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Arrays Stored");
        System.out.println("Enter a number you want to search");
        int number=sc.nextInt();
        for(int i=0;i<5;i++)
        {
            if(arr[i]== number)
            {
                System.out.println("Array Of given number is" );
                System.out.println(arr[i]);
            }
        }
        
    }
    
}
