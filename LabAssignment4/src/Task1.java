//importing Scanner library for taking input from the user.
import java.util.Scanner;

//Defining the main class for the program.
public class Task1 
{
    //Defining main program for the program.
    public static void main(String[] args)
    {
        //Defining an object for taking input from the user.
        Scanner input = new Scanner(System.in);
        
        //Defining an array for storing items from taken from the user.
        int array[] = new int[10];
        
        //Just printing the statement.
        System.out.println("Please enter the elements of the array");
        
        //Using for loop to store items in the array taken from the user.
        for (int i = 0 ; i < 10; i++)
        {
            array[i] = input.nextInt();
        }
        System.out.println("The odd items of array in reverse order are :\n");
        
        //Using for loop in reverse order to print item in reverse order.
        for (int j = 9 ; j>=0; j--)
        {
            //Using the if condition to check the odd items.
            if ( array[j] % 2 != 0 )
                System.out.println(array[j]);
                
        }
    }
    
}
