//Main class containing the main method
public class Test 
{
    //Main method for the execution of the program.
    public static void main(String[] args) 
    {
        //Creating two objects of circle class.
        Circle1 circle1 = new Circle1(1);
        Circle1 circle2 = new Circle1(2);
        //Creating two object of CircleSwap class for swapping the objects of 
        //the circle class by taking Circle class as the instance of CircleSwap class.
        CircleSwap c1 = new CircleSwap(circle1);
        CircleSwap c2 = new CircleSwap(circle2);

        //Calling the swap1 method
        swap1(c1, c2);
        //Updating the value of circle1 and circle2 from the c instance of c1 and c2 respectivily.
        circle1 = c1.c;
        circle2 =c2.c;
        //Just print the value of radius after swap1
        System.out.println("After swap1: circle1 = " +
            c1.c.radius + " circle2 = " + c2.c.radius);

        //Calling swap2 method which swap the instance radius of both circle objects.
        swap2(circle1, circle2);
        //just printing
        System.out.println("After swap2: circle1 = " +
            circle1.radius + " circle2 = " + circle2.radius);
    }
    //Defining the swap1 method in which swaping the instances of CircleSwap objects.
    public static void swap1(CircleSwap x, CircleSwap y) 
    {
        Circle1 temp = x.c;
        x.c = y.c;
        y.c = temp;
    }

    //Swapping the instances of circle objects.
    public static void swap2(Circle1 x, Circle1 y) 
    {
        double temp = x.radius;
        x.radius = y.radius;
        y.radius = temp;
    }
}
//Defining a circle class.
class Circle1 
{
    double radius;

    Circle1(double newRadius) 
    {
        radius = newRadius;
    }
}
//Defining CircleSwap class having the instance of circle class.
class CircleSwap{

    Circle1 c;
    CircleSwap(Circle1 circle){
    
        c = circle;
    }
}