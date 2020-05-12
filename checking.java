package projectOne;
import java.util.InputMismatchException;
import java.util.Scanner;

public class checking {
    public static void main(String[] args){

        try{

            Scanner intake = new Scanner(System.in);
            Scanner intake2 = new Scanner(System.in);
            //Quizzes
            System.out.print("How many tests or quizzes are there? ");
            int quizNum = intake.nextInt();

            double quizMean = findMean(quizNum,"Quiz or Test");


            //Assignments
            System.out.print("How many assignments are there? ");
            int assignmentNum = intake.nextInt();
            double assignmentMean = findMean(assignmentNum,"Assignment");


            System.out.println("How many projects are there?");
            int projectNum = intake.nextInt();
            double projectMean = findMean(projectNum, "Project");


            //Participation
            System.out.println("What Participation score do you have?(0-10)");
            double parScore = intake.nextDouble();


            //Finally Score Tally up
            double finalScore = (quizMean * .20) + (assignmentMean * .30) + (projectMean * .40) + parScore;
            String letter;
            if (finalScore >= 93)
            {
                letter ="A";
            }
            else if (finalScore >=90)
            {
                letter = "A-";
            }
            else if (finalScore >=87)
            {
                letter = "B+";
            }
            else if (finalScore >=83)
            {
                letter = "B";
            }
            else if (finalScore >=80)
            {
                letter = "B-";
            }
            else if (finalScore >=77)
            {
                letter = "C+";
            }
            else if (finalScore >=73)
            {
                letter = "C";
            }
            else if (finalScore >=70)
            {
                letter = "C-";
            }
            else if (finalScore >=67)
            {
                letter = "D+";
            }
            else if (finalScore >=63)
            {
                letter = "D";
            }
            else if (finalScore >=60)
            {
                letter = "D-";
            }
            else if (finalScore >=0)
            {
                letter = "F";
            }
            else
            {
                letter = "FA";
            }
            System.out.println("You have a Final Score of " +finalScore+" with a grade of "+letter);
        }
        catch(InputMismatchException a)
        {
            System.out.println("Not the right Input");

        }
    }
    private static double findMean(int num, String type) {
        // TODO Auto-generated method stub
        double total = 0.0;
        double mean = 0.0;
        Scanner intake = new Scanner(System.in);
        for(int i = 1; i<=num;i++)
        {
            System.out.print("For " + type + " " + i + ", what score did you get? ");
            try{
                total += intake.nextInt();
            }
            catch (InputMismatchException a)
            {
                System.out.println("Not the right Input");
                break;
            }
        }
        mean = total / num;
        System.out.println("You got " + mean + " for " + type+"s.");
        return mean;
    }
}



