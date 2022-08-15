// Importing Scanner library for taking input from the user.
import java.util.Scanner;
//Defining the class for the program.
public class Task3 
{
    //Defining the main method for the program.
    public static void main(String [] atgs)
    {
        //Creating an object for taking input from the user.
        Scanner input = new Scanner (System.in);
        //Just printing the statement and taking length of the array from the user.
        System.out.print("Please enter the length of array: ");
        int lengthArray = input.nextInt();
        //Creating an array for storing items taken from the user.
        double array[] = new double[lengthArray];
        System.out.println("Please enter the elements of the array: ");
        //Using for loop taking and storing the elements of the array.
        for (int i = 0 ; i < lengthArray ; i++)
        {
            array[i] = input.nextDouble();
        }
        //Defining two variables with temporary value for storing maximum and minimum elements of the array.
        double maximumElement = 0.0;
        double minimumElement = array[0];
        //Using for loop to access the element of the array and then by comparision getting maximum and minimum element of the array.
        for (int i = 0 ; i < lengthArray; i++)
        {
            if (maximumElement<array[i])
                maximumElement = array[i];
            if (minimumElement > array[i])
                minimumElement = array[i];
        }
        //Just printing the maximum and minimum element of the array.
        System.out.println("The Maximum Element of the array is "+ maximumElement);
        System.out.println("The Minimum Element of the array is "+ minimumElement);
    }   
}
