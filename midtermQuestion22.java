package midterm;

import java.util.Scanner;

public class midtermQuestion22 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            String name;
            int age = 0;
            double salary = 0.00;

            System.out.print("What is your name: ");
            name = in.nextLine();
            System.out.print("What is your age: ");
            age = in.nextInt();
            System.out.print("What is your salary: ");
            salary = in.nextDouble();

            System.out.println(name);
            System.out.println(age);
            System.out.println(salary);
        }

    }



