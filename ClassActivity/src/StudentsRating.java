import java.util.Random;     
//importing random library for taking random rating of the students.

public class StudentsRating 
//Defining main class for the program.
       
{
    public static void main(String[] arg)
    //Making main method for the program.
    {
        int totalRating = 0;
        //Defining a variable for storing the total rating of the students.
        
        int[] ratingArray = new int[40];
        //Defining an Array for storing the rating of the 40 students.
        
        Random randomRating = new Random();
        //Defining an object to take random inputs.
        
        for (int counter = 0 ; counter < 40; counter++ )
           ratingArray[counter] = 1 + randomRating.nextInt(10);
        //Applying for loop to get and store random ratings at 40 different index points.
        
        System.out.println("STUDENTS RATING FOR FOOD\n\n");
        //printing heading.
        
        for (int counter = 1 ; counter <= 40; counter++ )
        {System.out.printf("The rating of Student %d: %d\n",counter,ratingArray[counter-1]);
        totalRating += ratingArray[counter-1];
        }
        //Using for loop to print rating of 40 students and calculating the total rating.
        
        System.out.printf("\n\nThe Rating for the food by 40 student is %d\n",totalRating/40);
        //just printing the final rating of 40 students.
    }
    
}
