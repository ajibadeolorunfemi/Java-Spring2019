package Assignment2;


import java.util.Scanner;

public class Quiz6 {
    public static void main(String[] args) {

        Scanner keys = new Scanner(System.in);
        Boolean abc = true;
        String bucket;
        int numbers = 0;
        while(abc){
            try{
                System.out.println("do you like me?");
                bucket = keys.nextLine(); //user types in some string..*

                if(bucket.equals("yes")){
                    System.out.println("Yay! I love you too! :P");
                }
                else {
                    abc = false;
                }
                System.out.println("How much money do you have on you?");
                numbers = keys.nextInt(); //user types in **ex**. "no"*
                System.out.println(numbers);
            }
            catch(Exception a){
                abc = true;

            }
            finally{
                if(abc == false){

                }
            }
        }
    }
}
