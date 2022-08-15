import java.util.Scanner;
public class Task4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the initial position of the body: ");
        double initialPosition = input.nextDouble();
        System.out.print("Please enter the initial velocity of the body: ");
        double initialVelocity = input.nextDouble();
        System.out.print("Please enter the time interval: ");
        double time = input.nextDouble();
        System.out.print("Please enter the acceleration of the body: ");
        double acceleration = input.nextDouble();
        double currentPosition = initialPosition + (initialVelocity* time)
                + (acceleration*0.5*(Math.pow(time, 2)));
        System.out.println("The current position i.e S = "+ currentPosition);
    }
    
}