package projectOne;

import java.util.Scanner;

public class project1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Declaration
        double QUIZ_WEIGHT = 0.20;
        double ASSIGNMENT_WEIGHT = 0.30;
        double PROJECT_WEIGHT = 0.40;

        //For Quizzes
        System.out.print("How many quizzes would you like to input? ");
        int quiz_Number = in.nextInt();
        double quizMean = find_Mean(quiz_Number, "Quiz");


        //For Assignments
        System.out.print("How many assignments would you like to input? ");
        int assignmentNumber = in.nextInt();
        double assignmentMean = find_Mean(assignmentNumber,"Assignment");

        //For Projects
        System.out.print("How many projects would you like to input? ");
        int project_Number = in.nextInt();
        double projectMean = find_Mean(project_Number, "Project");


        //For Participation
        System.out.print("What Participation score do you have?(0-10) ");
        double participation_Score = in.nextDouble();


        //Calculating the final score and letter grade
        double finalScore = (quizMean * QUIZ_WEIGHT) + (assignmentMean * ASSIGNMENT_WEIGHT) + (projectMean * PROJECT_WEIGHT) + participation_Score;
            System.out.println("You have a Final Score of " +finalScore);
            if (finalScore > 93) {
                System.out.print("Your Final Grade is A" + "\n");

            } else if (finalScore >= 90 && finalScore <= 92.99) {
                System.out.print("Your Final Grade is A-" + "\n");

            } else if (finalScore >= 87 && finalScore <= 89.99) {
                System.out.print("Your Final Grade is B+" + "\n");

            } else if (finalScore >= 83 && finalScore <= 86.99) {
                System.out.print("Your Final Grade is B" + "\n");

            } else if (finalScore >= 80 && finalScore <= 82.99) {
                System.out.print("Your Final Grade is B-" + "\n");

            } else if (finalScore >= 77 && finalScore <= 79.99) {
                System.out.print("Your Final Grade is C+" + "\n");

            } else if (finalScore >= 73 && finalScore <= 76.99) {
                System.out.print("Your Final Grade is C" + "\n");

            } else if (finalScore >= 70 && finalScore <= 72.99) {
                System.out.print("Your Final Grade is C-" + "\n");

            } else if (finalScore >= 67 && finalScore <= 69.99) {
                System.out.print("Your Final Grade is D+" + "\n");

            } else if (finalScore >= 63 && finalScore <= 66.99) {
                System.out.print("Your Final Grade is D" + "\n");

            } else if (finalScore >= 60 && finalScore <= 62.99) {
                System.out.print("Your Final Grade is D-" + "\n");

            } else {
                System.out.print("Your Final Grade is F" + "\n");
                in.close();
            }

    }

    private static double find_Mean(int number, String type) {
        // TODO Auto-generated method stub
        double total = 0.0;
        double mean = 0.0;
        Scanner in = new Scanner(System.in);
        for(int k = 1; k<=number;k++)
        {
            System.out.print("For " + type + " " + k + ", what score did you get? ");
                total += in.nextInt();
            }

        mean = total / number;
        System.out.println("You got " + mean + " for your " + type+"s.");
        return mean;
    }
}














