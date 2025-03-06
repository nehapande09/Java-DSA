import java.util.Scanner;

public class AvgFunc {
    public static float avg (int a, int b,int c)
    {
       float avg =(a+b+c) /3;
       return avg ;


    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();

        float avg= avg(num1,num2,num3);
        System.out.println(avg);
    }
}
