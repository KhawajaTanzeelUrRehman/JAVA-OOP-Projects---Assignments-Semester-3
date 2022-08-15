//Creating a class to test the SavingAccount Class.
public class TestSavingsAccount {
    //Creating the main method for the execution of the program.
    public static void main(String[] args){
    
        //initiallinzing the objects by giving some values.
        SavingsAccount saver1 = new SavingsAccount(3200.00);
        SavingsAccount saver2 = new SavingsAccount(4500.00);
        //Setting the annual interest rate to 5%.
        SavingsAccount.modifyInterestRate(0.05);
        //Applying for loop to calculate and print the monthly interest and new balance
        //for both the savers to the console.
        for (int i = 1; i <= 12;i++){
        
            System.out.printf("The monthly interest of saver 1 for month %d is %.2f\n"
                    ,i,saver1.calculateMonthlyInterest());
            System.out.printf("The new Balance of saver 1 after month %d is %.2f\n", i,saver1.savingsBalanceGet());
            System.out.printf("The monthly interest of saver 2 for month %d is %.2f\n"
                    ,i,saver2.calculateMonthlyInterest());
            System.out.printf("The new Balance of saver 2 after month %d is %.2f\n\n", i,saver2.savingsBalanceGet());            
        }
        //Just printing a heading to show the change in the annual interest rate.
        System.out.println("\nAnnual Interest Updated to 7%\n");
        //Updating the annual interest rate to 7%.
        SavingsAccount.modifyInterestRate(0.07);  
            //just printint the monthly interest and the new balance for both the savers.
            System.out.printf("The monthly interest of saver 1 for month %d is %.2f\n"
                    ,13,saver1.calculateMonthlyInterest());
            System.out.printf("The new Balance of saver 1 is %.2f\n", saver1.savingsBalanceGet());
            System.out.printf("The monthly interest of saver 2 for month %d is %.2f\n"
                    ,13,saver2.calculateMonthlyInterest());
            System.out.printf("The new Balance of saver 2 is %.2f\n", saver2.savingsBalanceGet());            

    }
    
}
