
import java.util.Scanner;
//importing the library to get input fromt the user.

public class Task2 //Defining the main class for the program.
{

    public static void main(String[] args) //Defining the mian class for the program.
    {
        Scanner input = new Scanner(System.in);
        //Defining the object to take the input from the user.

        System.out.print("Please enter the first number: ");
        int number1 = input.nextInt();
        System.out.print("Please enter the second number: ");
        int number2 = input.nextInt();
        System.out.print("Please enter the third number: ");
        int number3 = input.nextInt();
        System.out.print("Please enter the forth number: ");
        int number4 = input.nextInt();
        //Just printing the statement and taking 4 inputs from the user.

        if (number1 < number2 && number1 < number3 && number1 < number4) {
            System.out.println("Smallest Number is " + number1);
        } else if (number2 < number1 && number2 < number3 && number2 < number4) {
            System.out.println("Smallest Number is " + number2);
        } else if (number3 < number2 && number3 < number1 && number3 < number4) {
            System.out.println("Smallest Number is " + number3);
        } else if (number4 < number2 && number4 < number3 && number4 < number1) {
            System.out.println("Smallest Number is " + number4);
        }
        //Using if else statements to get the smallest number and printing the smallest number.

        if (number1 > number2 && number1 > number3 && number1 > number4) {
            System.out.println("Largest Number is " + number1);
        } else if (number2 > number1 && number2 > number3 && number2 > number4) {
            System.out.println("Largest Number is " + number2);
        } else if (number3 > number2 && number3 > number1 && number3 > number4) {
            System.out.println("Largest Number is " + number3);
        } else if (number4 > number2 && number4 > number3 && number4 > number1) {
            System.out.println("Largest Number is " + number4);
        }
        //Using if else statements to get the Largest number and printing the Largest number.

    }

}
