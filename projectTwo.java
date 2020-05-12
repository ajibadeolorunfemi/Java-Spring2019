package projectOne;

import java.util.Scanner;

public class projectTwo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Declaration
        double QUIZ_WEIGHT = 0.20;
        double ASSIGNMENT_WEIGHT = 0.30;
        double PROJECT_WEIGHT = 0.40;

        //For Quizzes

        System.out.print("How many quizzes would you like to input? ");
        int quiz_Number = in.nextInt();
        double[] quiz = new double[quiz_Number];
        double quizMean = find_Mean(quiz_Number, "Quiz");


        //For Assignments
        System.out.print("How many assignments would you like to input? ");
        int assignmentNumber = in.nextInt();
        double[] assignment = new double[assignmentNumber];
        double assignmentMean = find_Mean(assignmentNumber, "Assignment");

        //For Projects
        System.out.print("How many projects would you like to input? ");
        int project_Number = in.nextInt();
        double[] project = new double[project_Number];
        double projectMean = find_Mean(project_Number, "Project");


        //For Participation
        System.out.print("What Participation score do you have?(0-10) ");
        double participation_Score = in.nextDouble();


        //Calculating the final score and letter grade
        double finalScore = (quizMean * QUIZ_WEIGHT) + (assignmentMean * ASSIGNMENT_WEIGHT) + (projectMean * PROJECT_WEIGHT) + (participation_Score);
        System.out.println("You have a Final Score of " + finalScore);

        char letter = 'B';

        switch (letter) {
            case 'A':

                System.out.println("You have a perfect score. Keep up the excellent work!");
                break;
            case 'B':

                System.out.println("You have an A. Great Job!");
                break;
            case 'C':

                System.out.println("You have a B. Keep studying hard!");
                break;
            case 'D':

                System.out.println("You have a C. Commit a little more of your time.");
                break;
            case 'E':
                //finalScore = 60;
                System.out.println("You have a D. You might want to study.");
                break;
            case 'F':

                System.out.println("You have an F. Better luck next semester.");
                break;
            case 'G':

                System.out.println("It's time to change majors.");
                break;
        }



    }

    private static double find_Mean(int number, String type) {
        // TODO Auto-generated method stub
        double total = 0.0;
        double mean = 0.0;
        Scanner in = new Scanner(System.in);
        for (int k = 1; k <= number; k++) {
            System.out.print("For " + type + " " + k + ", what score did you get? ");
            total += in.nextInt();
                while (total > 100 || total < 0) {
                    System.out.println("Error grade cannot be over 100 or below 0");
                    System.out.print("For " + type + " " + k + ", what score did you get? ");
                    total += in.nextInt();
                }
            }

            mean = total / number;
            System.out.println("You got " + mean + " for your " + type + "s.");
            return mean;
        }

    }















