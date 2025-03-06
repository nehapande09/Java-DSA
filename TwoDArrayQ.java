import java.util.*;
public class TwoDArrayQ {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter rows number");
        int rows=sc.nextInt();
        System.out.println("Eneter a cols number");
        int cols =sc.nextInt();
        int arr[][]=new int[rows][cols];
        System.out.println("Enter numbers of array");
        for(int i=0;i<rows;i++ )
        {
            for (int j=0;j<cols;j++)
            {
                arr[i][j]=sc.nextInt();

            }
        }
        System.out.println("Enter a number to find");
        int x=sc.nextInt();
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(x==arr[i][j])
                {
                    System.out.println("The index of the given number is "+ i + " "+j);
                }
            }
        }


    }
    
}
