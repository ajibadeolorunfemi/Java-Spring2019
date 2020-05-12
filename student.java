package projectOne;
//import java.util.Scanner;


public class student {



    private String name;
    private double grade;
    private String subjectName;

        public student() {
            name = "Tom";
            grade = 97.8;
            subjectName = "Intro to Java";
        }

        public void setName(String name){
           this.name = name;
        }

        public String getName(){
            return name;
        }

        public void setGrade(double grade){
            this.grade = grade;
        }

        public double getGrade(){
            return grade;
        }

        public void setSubjectName(String subjectName){
            this.subjectName = subjectName;
        }

        public String getSubjectName(){
            return subjectName;
        }

        public static void main(String[] args){
            student myStudent = new student();

            System.out.print("The student's name is: " + myStudent.name  + "\n");
            System.out.print("Their grade is: " + myStudent.grade + '\n');
            System.out.print("In the class of: " + myStudent.subjectName + '\n');
        }
}
