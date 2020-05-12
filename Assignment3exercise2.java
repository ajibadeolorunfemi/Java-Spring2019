package Assignment3;
import java.util.Scanner;
public class Assignment3exercise2 {
    public static void main(String[] args){
        double TAX_RATE1 = 0.00;
        double TAX_RATE2 = 0.10;
        double TAX_RATE3 = 0.20;
        double TAX_RATE4 = 0.30;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an income: ");
        double income = input.nextDouble();
        double tax;

        if(income < 20000){
            tax = income * TAX_RATE1;
        }
        else if(income < 40000){
            tax = ((income -(20000))) * TAX_RATE2;
        }
        else if(income < 60000){
            tax = ((income - (40000)) * TAX_RATE3) + 2000;
        }
        else{
            tax = ((income - (60000)) * TAX_RATE4) + 6000;
        }
        System.out.print("The tax is " + tax);
        }
}
