//Creating the class of rectangles.
public class Rectangle {
    //Creating two instances for the rectangle object.
    double width;
    double height;
    //Creating a constructor with the default value of width and height.
    Rectangle()
    {
        width = 1;
        height = 1;
    }
    //Creating a constructor in which parameter can be pass to specify the 
    //vlaue of width and height of the rectangles.
    Rectangle(double w,double h)
    {
        width = w;
        height = h;
    }
    //Creating a method for getting the area of the rectangles.
    double getArea()
    {
        double area = width * height;
        return area;
    }
    //Creating a method for getting the perimeters of the rectangles
    double getPerimeter()
    {
        double perimeter = 2*(width + height);
        return perimeter;
    }
}
