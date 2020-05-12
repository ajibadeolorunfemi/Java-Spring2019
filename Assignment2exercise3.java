package Assignment2;

import java.util.Scanner;
import java.lang.String;

public class Assignment2exercise3 {
    private String name;
    private int id;
    private String title;
    private double salary;

    private Assignment2exercise3(String name, String title, int id, double salary) {
        this.name = name;
        this.id = id;
        this.title = title;
        this. salary = salary;
    }

    public void setName(String name){

        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setId(int id){
        this.id = id;
    }


    public int getId(){
        return id;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("What is the Employee's Name? ");
        String name = in.nextLine();

        System.out.println("What is your Employee ID? ");
        int id = in.nextInt();

        System.out.println("What is your salary: ");
        double salary = in.nextDouble();

        System.out.println("What is your Job Title? ");
        String title;
                title = in.next();



        System.out.println(" ");
        System.out.println("Employee's name is " + name);
        System.out.println("Your employee ID is " + id);
        System.out.println("Your Job Title is " + title);
        System.out.println("Your salary is " + salary);


    }


}
