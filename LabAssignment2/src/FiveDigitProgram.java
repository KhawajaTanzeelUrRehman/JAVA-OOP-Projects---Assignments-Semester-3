
import java.util.Scanner;// importing library for taking input form the user. 

public class FiveDigitProgram {//Defining main class of the program.

    public static void main(String[] args) {//Defining the main function of the program.
        Scanner input = new Scanner(System.in);//Defining an object for taking input.
        System.out.print("Please enter a five digit number: ");//Taking input form the user.
        int enteredNumber = input.nextInt();
        while (enteredNumber > 99999 || enteredNumber <= 9999) {//Applying a condition to get only five digit number.
            System.out.print("Enter number is not a five digit number please "
                    + "enter a new number: ");
            enteredNumber = input.nextInt();
         /*Taking the entered number and getting the last digit by  applying 
            %10 and the deleting the last digit from the orignal number. */
        }
        int fifthDigit = enteredNumber % 10;
        enteredNumber = Math.floorDiv(enteredNumber, 10);
        int forthDigit = enteredNumber % 10;
        enteredNumber = Math.floorDiv(enteredNumber, 10);
        int thirdDigit = enteredNumber % 10;
        enteredNumber = Math.floorDiv(enteredNumber, 10);
        int secondDigit = enteredNumber % 10;
        enteredNumber = Math.floorDiv(enteredNumber, 10);
        int firstDigit = enteredNumber;
        //printing the digits and seperating them with three spaces.
        System.out.println(firstDigit + "   " + secondDigit + "  " + thirdDigit + "   "
                + forthDigit + "   " + fifthDigit);
    } 

}
