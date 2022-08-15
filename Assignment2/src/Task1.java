import java.util.Scanner;
// impoting library for taking input from the user.

public class Task1 {
//Defining the main class of the program.
    
    public static void main(String[] args)
    //Defining the main method of the program.
            
    {
        Scanner input = new Scanner(System.in);
        //Defining an object for taking input from the user.
        
        System.out.print("Enter a three-digit number: ");
        //Just printing the statement.
        
        int number = input.nextInt();
        //Taking input from the user.
        
        if(number>=100 && number <= 999)
        // Applying if condition to check whether the input is 3 digit or not.
         
        {int digit3 = number % 10;
        //Getting the 3rd digit by using remainder.
        
        number = Math.floorDiv(number, 10);
        //Doing floor division to remove the last digit from the number.
        
        int digit2 = number % 10;
        //Getting the 2nd digit by using remainder.
        
        number = Math.floorDiv(number, 10);
        //Doing floor division to remove the 2nd last digit from the number.
        
        int digit1 = number;
        // After removing last two digits from a 3 digit number we have 1st digit in number.
        
        int product = digit1 * digit2 * digit3;
        // Taking product of three digits.
        
        System.out.printf("The product is: %d\n",product);
        //Printing the product.        
        }
        else
            System.out.println("You do not have entered a three digit number.");
            //If entered number is not a 3 digit number the printing this statement only.       
    }    
}
