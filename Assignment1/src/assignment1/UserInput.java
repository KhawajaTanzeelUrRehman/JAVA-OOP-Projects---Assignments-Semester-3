package assignment1;//package of the program

import java.util.Scanner;//Importing the java.util.Scanner for taking input from the user.

public class UserInput {// Mian class of the program

    public static void main(String[] args) {//Main method of the class
        Scanner input = new Scanner(System.in);//Defining an object for taking the inputs from the user.
        //Just Taking inputs from the user and displaying it to the main console.

        System.out.print("Please Enter Your Name: ");
        String name = input.nextLine();
        System.out.print("Please Enter Gender, \"F\" for Female and \"M\" for Male: ");
        char gender = input.next().charAt(0);
        System.out.print("Please Enter Your Age: ");
        int age = input.nextInt();
        System.out.print("Please Enter Your Mobile Number: ");
        long mobileNumber = input.nextLong();
        System.out.print("Please Enter Your CGPA: ");
        double CGPA = input.nextDouble();
        System.out.printf("Name: %s\nGender: %c\nAge: %d\nMobile Number: %d\nCGPA: %.2f\n", name, gender, age, mobileNumber, CGPA);
    }
}
