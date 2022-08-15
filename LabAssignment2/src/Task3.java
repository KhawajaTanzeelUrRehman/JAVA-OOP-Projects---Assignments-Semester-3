import java.util.Scanner;//importing library for taking input from the user.
public class Task3 {//Defining the main class for the program.
    public static void main(String[] args){//Defining the main class for the program.
        Scanner input = new Scanner(System.in);//Defining an object for taking input from the user.
        System.out.print("Please entered the value of x: ");//printing line for taking input from the user.
        double variable = input.nextDouble();// Getting the value of variable from the user.
        double Answer = (12.3*(Math.pow(variable, 4))-9.1*
                (Math.pow(variable, 3))+ 19.3*(Math.pow(variable, 2))-
                4.6*(variable)+34.2);// Calculating the value of the equation by using * only four times.
        System.out.println("y = "+Answer);//Printing the required result.
    }
    
}