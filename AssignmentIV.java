package FinalExam;

    import java.util.*;
    public class AssignmentIV {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            int selection=0, listInt=0;
            String loop="y", input;
            List<String> list = new ArrayList<String>();

            while(loop.charAt(0)=='y') {
                System.out.println("Welcome to the List function!");
                while(selection!=-1) {

                    System.out.println("To add to the list, Enter 1");
                    System.out.println("To remove from the list, Enter 2");
                    System.out.println("To print an index of your choosing, Enter 3");
                    System.out.println("To check if the list is empty, Enter 4");
                    System.out.println("To sort the list, Enter 5");
                    System.out.println("To quit Enter -1");

                    selection=scan.nextInt();

                    switch(selection) {
                        case 1:
                        {
                            System.out.println("Please enter the string you would like to place in the list");
                            input=scan.next();
                            list.add(input);
                            System.out.println(input+" added successfully");
                            System.out.println();
                            break;
                        }
                        case 2:
                        {
                            System.out.println("Please enter the index of the item you'd like to remove");
                            listInt=scan.nextInt();
                            if (listInt>list.size()) {
                                System.out.println("Invalid selection");
                            }
                            else {
                                list.remove(listInt);
                                System.out.println("You successfully removed index "+listInt);
                            }
                        }
                        break;
                        case 3:
                        {
                            System.out.println("Please enter the index you'd like to print");
                            listInt=scan.nextInt();
                            if (list.isEmpty()||(list.size()<=listInt)) {
                                System.out.println("Invalid selection. Please try again");
                            }
                            else {
                                System.out.println(list.get(listInt));
                            }
                        }
                        break;
                        case 4:
                        {
                            if(list.isEmpty()) {
                                System.out.println("List is empty");
                            }
                            else
                            {
                                System.out.println("List is not empty");
                            }

                        }
                        break;

                        case 5:
                        {
                            Collections.sort(list);
                            System.out.println("List successfully sorted");
                        }
                        break;


                        case -1:
                        {
                            loop="no";

                        }
                        break;

                        default:
                            System.out.println("Invalid selection");
                    }
                }
            }
        }
    }


