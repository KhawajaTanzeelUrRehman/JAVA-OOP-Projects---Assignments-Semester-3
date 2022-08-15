//Importing java Scanner library for taking input from the user.
import java.util.Scanner;
//Class for testing the classes.
public class TestProgram1 {
    //Main method for the execution of the program.
    public static void main(String[] args){
        //Creating new object of Rectangle class.
        Rectangle rect1 = new Rectangle();
        //Creating an object of scanner class for taking input from the user.
        Scanner input = new Scanner(System.in);

        //printing statements on the console , taking inputs from the user
        // and then storing then making change in the rectangle object.
        System.out.print("Please enter the width of the rectangle: ");
        rect1.setWidth(input.nextDouble());
        System.out.print("Please enter the height of the rectangle: ");
        rect1.setHeight(input.nextDouble());
        System.out.print("Please enter the color of the rectangle: ");
        rect1.setColor(input.next());
        System.out.print("Please enter the boolean value of filled status: ");
        rect1.setFilled(input.nextBoolean());

        //Using toString and getter to print the properties of the rectangle object.
        System.out.println("The " + rect1.toString() +" has the following properties: ");
        System.out.println("The rectangle is created at " + rect1.getDateCreated());
        System.out.println("The area of rectangle is "+rect1.getArea());
        System.out.println("The perimeter of rectangle is "+rect1.getPerimeter());
        System.out.println("The color of rectangle is "+rect1.getColor());
        System.out.println("The filled status of rectangle is "+rect1.isFilled());

    }
}
