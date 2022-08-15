// Importing Scanner library for taking input from the user.
import java.util.Scanner;
//Defining the class for the program.
public class Task2 
{
    //Defining the main method for the program.
    public static void main(String [] atgs)
    {
        //Creating an object for taking input from the user.
        Scanner input = new Scanner (System.in);
        //Just printing the statement and taking length of the array from the user.
        System.out.print("Please enter the length of array: ");
        int lengthArray = input.nextInt();
        //Creating two array one for storing items taken from the user and other is for storing the duplicate items.
        double array[] = new double[lengthArray];
        double duplicateItems[] = new double[lengthArray];
        //Creating a variable for counting the number of duplicates in the array.
        int duplicateCounter = 0;
        System.out.println("Please enter the elements of the array: ");
        //Using for loop taking and storing the elements of the array.
        for (int i = 0 ; i < lengthArray ; i++)
        {
            array[i] = input.nextDouble();
            //Applying for loop to check for the duplicate items.
            for (int j = 0 ; j < i; j++)
            {   
                /*If entered number is already present in the array then 
                storing it in the duplicateItems array and increasing duplicateCounter.*/
                if (array[j] == array [i])
                {
                    duplicateItems[duplicateCounter] = array[i];
                    duplicateCounter++;
                    break;
                }
            }
        }
        //Printing the number of duplicates found in the array.
        System.out.println("You have "+duplicateCounter+ " duplicate items in the array.\n");
        //If duplicates are present then printing them.
        if (duplicateCounter>0)
        {
            System.out.println("Duplicate Items: ");
            //Using for loop to print the duplicate items.
            for (int i = 0 ; i < duplicateCounter; i++ )
                System.out.println(duplicateItems[i]);
        }
        
    }
}
