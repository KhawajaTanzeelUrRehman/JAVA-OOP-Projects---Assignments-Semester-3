import java.util.Scanner;
//importing the Scanner library for taking input from the user.

public class Task5 
//Defining the main class for the program.        
{
    public static void main(String[] args)
    //Defining the main method of the program.
    {
        Scanner input = new Scanner(System.in);
        //Defining an object for taking input from the user.
        
        System.out.print("Please enter the number of units consumed in this month: ");
        int units = input.nextInt();
        //just printing the statement and taking input from the user.
        
        double electricBill = 0;
        //Variable to store the calculated electric bill.
        
        if (units <=100)
            electricBill = units * 4;
        else if (units > 100 && units <= 300)
            electricBill = units * 4.5;
        else if (units > 300 && units <= 500)
            electricBill = units * 4.75;
        else
            electricBill = units * 5;
        //Using if else if and else conditions to calculate bill according to given instructions.
        
        double withFuelCharges = electricBill * 1.2;
        //Adding 20% fuel charges in the electric bill and storing it in the new variable.
        
        double totalBill = withFuelCharges * 1.1;
        //Adding 10% Govt charges in the bill to get the final bill.
        
        System.out.printf("Your total bill for this month is %.2f Rs.\n", totalBill);
        //Displaying the final bill to the user.
    }
    
}
