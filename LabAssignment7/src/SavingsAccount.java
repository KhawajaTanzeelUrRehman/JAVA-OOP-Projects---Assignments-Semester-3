//Creating a class of SavingsAccount 
public class SavingsAccount {
    //Creating a static variable for storing annual interest rate.
    private static double annualInterestRate;
    //Creating a variable for storing the balance of each account.
    private double savingsBalance;
    //Defining a constructor which accept the parameter.
    SavingsAccount(double Balance)
    {
        savingsBalance = Balance;
    }
    //Creating a method for calculating the monthly interest rate and
    //updating thesaver balance.
    public double calculateMonthlyInterest()
    {
        double monthlyInterest = ((savingsBalance*annualInterestRate)/12);
        savingsBalance += monthlyInterest;
        return monthlyInterest;
    }
    //Creating a method to modify the annual interest rate.
    public static void modifyInterestRate (double interestRate){
        
        annualInterestRate = interestRate;
    }
    //Creating a getter method to get the value of saving balance outside this class.
    public double savingsBalanceGet(){
    
        return savingsBalance;
    }
}
