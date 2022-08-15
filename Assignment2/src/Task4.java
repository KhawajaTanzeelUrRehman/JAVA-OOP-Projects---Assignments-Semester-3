
import java.util.Scanner;
// impoting Scanner library for taking input from the user.

public class Task4 {
//Defining main class for the program.

    public static void main(String[] args) {
    //Defining main method of the program.
    
        Scanner input = new Scanner(System.in);
        //Defining Scanner object for taking input from the user.
        
        System.out.print("Please enter the operator: ");
        String operator = input.next();
        System.out.print("Please enter the first number: ");
        double number1 = input.nextDouble();
        System.out.print("Please enter the second number: ");
        double number2 = input.nextDouble();
        //Just printing the statement and taking input from the user for operator and two numbers.
        
        double answer = 0;
        //Definig a variable for storing answer.
        
        switch (operator) {
            case "+":
                answer = number1 + number2;
                break;
            case "-":
                answer = number1 - number2;
                break;
            case "/":
                answer = number1 / number2;
                break;
            case "*":
                answer = number1 * number2;
                break;
            default:
                System.out.println("You have done some mistake in calculation");
        }
        //Using switch statements for doing operation on the numbers according to the given operator by the user.
        
        System.out.println("Your answer is " + answer);
        //just printing the answer for the user on the screen.

    }

}
