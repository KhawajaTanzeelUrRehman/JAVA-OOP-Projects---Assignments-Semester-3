
import java.util.Scanner;

public class ClassAssignment2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter numerical value: ");
        int number = input.nextInt();
        System.out.println("Number 1 is " + number);

        System.out.print("Enter Ist string: ");
        String string12 = input.nextLine();

        System.out.println("String is " + string12);

        System.out.print("Enter 2nd string: ");
        String string2 = input.nextLine();
        System.out.println("String is " + string2);
    }

}
