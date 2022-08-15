/*This program has multiple errors first it has no main method for the execution of the program. 2nd it creating an object of Circle class which is not defined. 3rd p of public in capital. 4rth it is calling getRadius method but not defined getRadius method.
This program can be correct by using p small in public keyword , defing a main mehtod, creating a class with name Circle and creating a method with name getRadius.*/
public class Test3
{
public static void main()
{
Circle c;
c = new Circle();
System.out.println("Radius is " + c.getRadius()); 
}
}
class Circle
{
    double radius;
    public double getRadius()
    {
        return radius;
    }    
}