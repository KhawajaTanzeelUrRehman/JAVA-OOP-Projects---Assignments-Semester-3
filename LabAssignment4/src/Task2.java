//importing Scanner library for taking inputs from the user.
import java.util.Scanner;

//Defining the class for the program.
public class Task2 {
    
    //Defining the main method of the program.
    public static void main(String[] args)
    {
        //Creating a scanner object for taking input from the user.
        Scanner input = new Scanner(System.in);
        
        //Creating an array for storing the numbers taken from the user.
        int numberArray[] = new int[10];
        
        //Using for loop for taking input and storing it in the array.
        for (int i = 0 ; i < 10 ; i++)
        {
            //Just printing the statement for demanding input fromt the user.
            System.out.print("Please enter number " + (i+1) +": ");
            
            //Storing the number taken from the user into the array.
            numberArray[i] = input.nextInt();
            
            //Using nested for loop to check for the repeated numbers by 
            //applying for loop till the position of the current index.
            for (int j = 0; j < i; j++)
            {
                //Using if codition to check wheather this number is already present in the array or not.
                if (numberArray[i] == numberArray[j])
                {
                    System.out.println("You have entered a repeated value please enter a new value.");
                    
                    //Decreasing the value of i so that user can add the number again for that index.
                    i--;
                }
            }
            
        }
        //just printing the statement and showing the elements of the array.
        System.out.println("The elements of the array are: ");
        
        //Using for loop to show the elements of the array to the user.
        for (int counter = 0 ; counter < 10; counter++)
        {
            System.out.println(numberArray[counter]);
        }
            
    }
    
}
