import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 =sc.nextInt();
        int num2 =sc.nextInt();

        int button =sc.nextInt();

        switch (button) {
            case 1: System.out.println(num1+num2);
                break;
            case 2:System.out.println(num1-num2);
                break;
            case 3:System.out.println(num1 * num2);
                 break;
            case 4: System.out.println(num1 / num2);
                  break;
            case 5: System.out.println(num1 % num2);
                  break;
               

            default:
                System.out.println("Use Correct operation");
        }
    }
    
}
