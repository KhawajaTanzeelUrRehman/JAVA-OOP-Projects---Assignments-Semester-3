import java.util.Scanner;
//importing Scanner library for taking input from the user.
public class Task3
//Defining the main class for the program.
{
    public static void main(String[] args)
    //Defining the main method of the program.
    {
        Scanner input = new Scanner(System.in);
        //Defining the object for taking input from the user.
        
        System.out.print("Please Enter Your Name: ");
        String name = input.nextLine();
        //just printing the statement and taking input from the user.
        
        System.out.print("Hi," + name + "! How old are you? " );
        int age = input.nextInt();
        //just printing the statement and taking input from the user.

        System.out.printf("\n%s, in five years you will be %d years old.\n",name, age += 5 );
        //just printing using f string and using compund assignment to increase age by 5.
        
        System.out.printf("And five years ago you were %d!\n", age -= 10 );
        //Now the age is 5 greater than the orignal so reducing it by 10 to ger 5 less than age.

    }
    
}
