import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        boolean result = (num3 == (num1 + num2));

        if (result) {
            System.out.println("True: The third number is the sum of the first two numbers.");
        } else {
            System.out.println("False: The third number is not the sum of the first two numbers.");
        }

        sc.close();
    }
}