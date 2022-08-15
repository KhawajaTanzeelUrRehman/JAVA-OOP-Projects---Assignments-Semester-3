//Importing Scanner library for taking input from the user.
import java.util.Scanner;
//Creating Class for the program.
public class Task3 {

    //Main method of the program.
    public static void main(String[] args) {
        
        //Creating object for taking input from the user.
        Scanner input = new Scanner(System.in);
        //Defining variables for while loop and menu.
        String user = "";
        //Creating array of user names with empty spaces.
        String userName[] = {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "};
        //Creating array for storing passwords.
        String passwords[] = new String[10];
        //Creating array for storing number of studenets added by administrator.
        //reason for using array is that because we have to pass it in the administrator method.
        int admittedStudent[] = {0};
        
        //loop for main menu.
        while (!(user.equals("-1"))) {
            System.out.println("MAIN MENU\n");
            System.out.print("Enter 1 to login as administrator.\nEnter 2 to login as an end user."
                    + "\nEnter -1 to exit the program.\n");
            user = input.nextLine();
            //Using switch statements to call the method according to the choice of the user.
            switch (user) {
                //Condition to exit the program.
                case "-1":
                    System.out.println("You have entered -1 to exit the program.");
                    break;
                //Condition to check the password of administrator and call the administrator method.
                case "1":
                    //counter to check number of attempts for the password.
                    int counter = 3;
                    //Variable for storing password.
                    String password;
                    OUTER:
                    //While loop to match the password and give three chances to the user.
                    while (counter > 0) {
                        System.out.print("Please enter your password: ");
                        password = input.nextLine();
                        switch (password) {
                            //If password match to the administrator password than calling adminitrator method for administrator portal.
                            case "Tanzeel":
                                administrator(userName, passwords, admittedStudent);
                                break OUTER;
                            //If the user enter -1 then it will return to the main menu.
                            case "-1":
                                break OUTER;
                            //If the password does not match.
                            default:
                                counter--;
                                System.out.println("You have entered a wrong password, Enter -1 to go to the main menu.");
                                System.out.println("you have " + counter + " remaining attempts.\n");
                                break;
                        }
                    }
                    //break statement to directly reach to the main method after log out from the administrator.
                    break;
                //Condition for calling the end user portal.
                case "2":
                    //Taking name from the user.
                    System.out.print("Please enter your name: ");
                    String name = input.nextLine();
                    //Using for string to match the given name from the present name in the array.
                    for (int count = 0; count < 10; count++) {
                        //if the name of the user match with the record then taking password and matching it with the data.
                        if (userName[count].equals(name)) {
                            //Counter for giving 3 chances to the end user for entering the password.
                            counter = 3;
                            //using while loop to give three chances to the user.
                            while (counter > 0) {
                                System.out.print("Please enter your password: ");
                                password = input.nextLine();
                                //If the password match with the record then calling the student portal method.
                                if (password.equals(passwords[count])) {
                                    studentPortal(userName, passwords, count);
                                    break;
                                    //If the user enters -1 then it will return to the main menu.
                                } else if (password.equals("-1")) {
                                    break;
                                } else {
                                    counter--;
                                    System.out.println("You have entered a wrong password, Enter -1 to go to the main menu.");
                                    System.out.println("you have " + counter + " remaining attempts.\n");
                                }
                            }
                            break;
                        }
                    }
                    // if the name not matches with the names stored in the array.
                    System.out.println("Sorry we can't find your profile.");
                    break;
                default:
                    //If the user enters something else then the given options.
                    System.out.println("Invalid entry, Please select from the given options\n");
                    break;
            }

        }
    }
    //Creating a method for administrator log in from where he can add students.
    public static void administrator(String name[], String password[], int admittedStudent[]) {
        //Defining an object for taking input from the user.
        Scanner input = new Scanner(System.in);
        String option = "";
        OUTER:
        //While loop to show option menu to the user.
        while (!(option.equals("-1"))) {
            System.out.println("ADMINISTRATOR PORTAL\n");
            System.out.println("Enter 1 to add a student\nEnter -1 to go to the main menu.");
            option = input.nextLine();
            //Using switch statements to perform the tasks according to the commands of the user.
            switch (option) {
                //If the user enters -1 then it will return to the main method.
                case "-1":
                    break OUTER;
                //Option from where the user can add new student.
                case "1":
                    if (admittedStudent[0] < 10) {
                        //Taking name and password of the end user from the administrator and storing it in the array.
                        System.out.print("Please enter the name of student " + (admittedStudent[0] + 1) + " : ");
                        name[admittedStudent[0]] = input.nextLine();
                        System.out.print("Please enter the password for student " + (admittedStudent[0] + 1) + " : ");
                        password[admittedStudent[0]] = input.nextLine();
                        admittedStudent[0]++;
                    } else {
                        //Condition so that user cannot add more than 10 students.
                        System.out.println("You have already registered 10 students you cannot add more student.");
                    }
                    break;
                default:
                    //If the user do not select from the given options.
                    System.out.println("Invalid entry, Please select from the given options\n");
                    break;
            }
        }
    }
    //Creating a method for end user portal
    public static void studentPortal(String name[], String password[], int count) {
        //Object for taking input from the user.
        Scanner input = new Scanner(System.in);
        String option = "";
        //Just showing the welcome message and an option to go back to the main menu.
        while (!(option.equals("-1"))) {
            System.out.println("STUDENT PORTAL\n");
            System.out.println("Welcome " + name[count] + "!");
            System.out.print("Enter -1 to go to the main menu:");
            option = input.nextLine();
        }

    }

}
