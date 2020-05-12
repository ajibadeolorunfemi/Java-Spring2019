package Assignment3;

import java.util.Scanner;

public class Assignment3exercise1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double number1;
        double number2;

        System.out.print("Please enter a number: ");
        number1 = in.nextDouble();

        if (number1 > 0 ) {
            System.out.println("The number is positive");
            System.out.println("The number is not negative");
            System.out.println("The number is not zero");

        } else if (number1 < 0 ) {
            System.out.println("The number is  negative");
            System.out.println("The number is not positive");
            System.out.println("The number is not zero");
        } else {
            System.out.println("The number is zero");
            System.out.println("The number is not negative");
            System.out.println("The number is not positive");
        }


        if (number1 % 2 == 0) {
            System.out.println(number1 + " The number is even");
            System.out.println(number1 + " The number is not odd");
        }

        else {
            System.out.println("The numbers are odd");
            System.out.println("The numbers are not even");
        }

        System.out.print("Please enter a number: ");
        number2 = in.nextDouble();
        if (number2 > 0 ) {
            System.out.println("The number is positive");
            System.out.println("The number is not negative");
            System.out.println("The number is not zero");

        } else if (number2 < 0 ) {
            System.out.println("The number is  negative");
            System.out.println("The number is not positive");
            System.out.println("The number is not zero");
        } else {
            System.out.println("The number is zero");
            System.out.println("The number is not negative");
            System.out.println("The number is not positive");
        }

        if (number2 % 2 == 0) {
            System.out.println("The number is even");
            System.out.println("The number is not odd");
        }

        else {
                System.out.println("The number is odd");
                System.out.println("The number is not even");
            }


    }
}
