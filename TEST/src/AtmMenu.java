import java.util.Scanner;
public class AtmMenu {
    public static void main(String[] args){
        System.out.println("Options:\na) Deposit Money)\nb) WithDraw Money"
                + "\nc) Check Balance\nd) Exit");
        Scanner input = new Scanner(System.in);
        String userInput;
        userInput = input.nextLine();
        switch(userInput)
        {
            case "Deposit Money":
                System.out.println("Deposit Money..................");
                break;
            case "WithDraw Money":
                System.out.println("Withdraw Money..................");
                break;
            case "Check Balance":
                System.out.println("Check Balance....................");
                break;
            case "Exit":
                System.out.println("Exit.............................");
                break;
            default:
                System.out.println("Please Select from the given option");
                break;
                
        }
        
        
    }
    

    
}
