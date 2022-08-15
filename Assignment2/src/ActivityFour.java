class Circle
{
    private double radius;

    public Circle( double radius)
    {
        this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }

    public double getArea()
    {
        return radius * radius * Math.PI;
    }
}

class B extends Circle
{
    private double length;

    B( double radius, double length)
    {
        super( radius);
        this.length = length;
    }

    /** Override getArea() */
    public double getArea()
    {
        return getArea() * length;
    }
}



public class ActivityFour
{
    public static void main( String[] args)
    {
        B b = new B( 5, 10);
        System.out.println( "Area = " + b.getArea());
    }
}
