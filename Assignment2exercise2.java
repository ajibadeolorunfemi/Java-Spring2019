package Assignment2;

import java.util.Scanner;
import java.lang.String;

public class Assignment2exercise2 {
        private String studentName;
        private String studentExam;
        private double studentScore;
        private String studentGrade;

        private Assignment2exercise2(String studentName, String studentExam, double studentScore, String studentGrade) {
            this.studentName = studentName;
            this.studentExam = studentExam;
            this.studentScore = studentScore;
            this. studentGrade = studentGrade;
        }

        public void setName(String studentName){

            this.studentName = studentName;
        }

        public String getName(){
            return studentName;
        }

        public void setExam(String studentExam){
        this.studentExam = studentExam;
    }

        public String getExam(){
        return studentExam;
    }

        public void setScore(double studentScore){
            this.studentScore = studentScore;
        }

        public double getScore(){
            return studentScore;
        }

        public void setGrade(String studentGrade){
            this.studentGrade = studentGrade;
        }

        public String getGrade(){
            return studentGrade;
        }

        public static void main(String[] args){
            Scanner in = new Scanner(System.in);

            System.out.print("What is your full name? ");
            String studentName = in.nextLine();

            System.out.print("What is the name of your Exam? ");
            String studentExam = in.nextLine();


           // System.out.print("What is your grade on the Exam: ");
            //String studentGrade = in.nextLine();

            System.out.print("What score do you have on your Exam? ");
            double studentScore = in.nextDouble();
            if (studentScore >= 90){
                System.out.print("Your Exam grade is A");
            }
            else if (studentScore >= 80 && studentScore <= 89){
                System.out.print("Your Exam grade is B");
            }
            else if (studentScore >= 70 && studentScore <= 79){
                System.out.print("Your Exam grade is C");
            }
            else if (studentScore >= 60 && studentScore <= 69){
                System.out.print("Your Exam grade is D");
            }
            else{
                System.out.print("You Failed the class");
            }

            System.out.println(" ");
            System.out.println("Your name is " + studentName);
            System.out.println("The exam you took is " + studentExam);
            System.out.println("Your exam score is " + studentScore);



            //System.out.println("Your exam grade is " + studentGrade);


        }


    }

