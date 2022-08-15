//creating a class to test the rectangle class.
public class TestRectangle {
    //Creating the main method for execution of the program.
    public static void main(String[] args)
    {
        //Creating two rectangle objects with specified values
        Rectangle rect1 = new Rectangle(4,40);
        Rectangle rect2 = new Rectangle(3.5,35.9);
        //Getting the values by using object instances and printing the values. 
        System.out.println("The width of the rectagle 1 is "+rect1.width);
        System.out.println("The height of the rectagle 1 is "+rect1.height);
        //Calling the method with the objects to get values and printing them.
        System.out.printf("The Area of the rectagle 1 is %.2f\n",rect1.getArea());
        System.out.printf("The perimeter of the rectagle 1 is %.2f\n\n",rect1.getPerimeter());
        System.out.println("The width of the rectagle 2 is "+rect2.width);
        System.out.println("The height of the rectagle 2 is "+rect2.height);
        System.out.printf("The Area of the rectagle 2 is %.2f\n",rect2.getArea());
        System.out.printf("The perimeter of the rectagle 2 is %.2f\n\n",rect2.getPerimeter());
        
    }
    
}
