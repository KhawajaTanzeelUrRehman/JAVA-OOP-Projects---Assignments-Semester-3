//Importing Scanner library for taking input from the user.
import java.util.Scanner;

//Defining the Class for the program.
public class Task1 {
    
    //Defining the main method for the program.
    public static void main (String[] args)
    {
        //Creating an object for taking input from the user.
        Scanner input = new Scanner(System.in);
        
        //Creating 3 array for storing 3 matrics.
        double matric1[][] = new double[3][3];
        double matric2[][] = new double[3][3];
        //Matric for storing answer.
        double matricProduct [][] = new double[3][3];
        //Using for loop to take input from the user. This loop is for matric number.
        for (int matric = 1; matric <=2; matric++)
        {   System.out.println("Please enter the elements of matric "+matric);
            
            //Using nested loop for taking inputs from the user and storing it in the 2D array.
            for (int i = 0 ; i < 3 ; i++)
            {
                for (int j = 0 ; j < 3 ; j++)
                {
                    System.out.print("Enter value of X"+i+j+": ");
                    
                    /*Applying condition to store elements in first main
                    loop in matric 1 and on 2nd loop on matric 2.*/
                    if ( matric == 1)
                        matric1[i][j] = input.nextDouble();
                    else
                        matric2[i][j] = input.nextDouble();
                }
            }
        }
        //Using nested for loop to get the product of two matrics and storing the result in the matricProduct array.
        //This loop is for rows of matricProduct array.
        for (int i = 0 ; i < 3; i++)
        {
            //This loop is for colums of matricProduct array.
            for (int j = 0 ; j < 3 ;j++)
            {
                //This loop is for summation of the result of three products.
                for (int k = 0 ; k < 3 ; k++)
                {
                    matricProduct[i][j] += matric1[i][k]*matric2[k][j];
                }
            }
        }
        //Just printing the heading.
        System.out.print("\nThe product Matric:\n");
        //Matric for displaying the result of the product on the screen.
        for (int i = 0 ; i <3 ; i++)
        {
            for (int j = 0 ; j < 3 ; j++)
            {
                System.out.print((matricProduct[i][j]));
                System.out.print("    ");
            }
            System.out.println();
        }
    }
    
}
