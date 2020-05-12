package midterm;
import java.util.Scanner;

public class midtermQuestion23 {
    private String name;
    private int age;
    private double salary;

    private midtermQuestion23(String name, int age, double salary) {
       this.name = name;
       this.age = age;
       this. salary = salary;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("What is your name: ");
        String name = in.nextLine();
        System.out.print("What is your age: ");
        int age = in.nextInt();
        System.out.print("What is your salary: ");
        double salary = in.nextDouble();

        System.out.println("Your name is " + name);
        System.out.println("Your age is " + age);
        System.out.println("Your salary is " + salary);


    }


}
