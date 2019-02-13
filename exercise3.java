package assignment1exercise3;
import java.util.Scanner;

public class exercise3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        System.out.print("Please enter your first number: ");
        num1 = in.nextInt();
        System.out.print("Please enter your second number: ");
        num2 = in.nextInt();

        System.out.println("The Sum of your numbers are:");
        System.out.println(num1 + num2);

        System.out.println("The product of your numbers are:");
        System.out.println(num1 * num2);

        System.out.println("The difference of your numbers are:");
        System.out.println(num1 - num2);

        System.out.println("The quotient of your numbers are:");
        System.out.println(num1 / num2);

    }
}