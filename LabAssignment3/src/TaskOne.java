import java.util.Scanner;// importing Scanner for taking input from the user.
public class TaskOne {// Making the class for the program.
    public static void main(String[] args){// Making the main method of the program.
        double weight;// Defining variable for taking weight from the user.
        double height;// Defining variable for taking height from the user.
        double BMI;// Defining variable for calculating BMI of the user.
        weight = 0.0;
        height = 0.0;
        BMI = 0.0;
        Scanner input = new Scanner(System.in);// Creating an object for taking input from the user.
        while ( weight != -1 && height != -1 )// Applying condition to take input from the user till he enters -1 to exit the loop.
        {//Just printing and taking input from the user.
                System.out.println("Enter -1 to quit the program");
                System.out.print("Please Enter your Weight in Kilograms: ");
            weight = input.nextDouble();
            // Applying condition to exit the program if the user enter -1.
            if ( weight == -1 )
                break;
            System.out.print("Please Enter your height in meters: ");
            height = input.nextDouble();
            if ( height == -1 )
                break;
            BMI = (weight)/(height * height);//Calculating BMI for the user by the given formula.
            System.out.printf("Your BMI is : %f\n",BMI);
            // Just printing the result according to the given conditions for BMI.
            if (BMI <18.5)
                System.out.println("\nYou are Underweight");
            else if (BMI >= 18.5 && BMI <= 24.9)
                System.out.println("\nYou are Normal");
            else if (BMI > 24.9 && BMI < 29.9)
                System.out.println("\nYou are Overweight");
            else
                System.out.println("\nYou have Obesety");
            System.out.println("..................................................");
            
                
        }
        
    }
    
}
