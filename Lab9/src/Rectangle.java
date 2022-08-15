//Creating a sub class of the GeometricObject
public class Rectangle extends GeometricObject {
    //Istance variables width and height with the default values.
    private double width = 1.0;
    private double height = 1.0;
    //Constructor with no args
    public Rectangle(){
    }
    //Constructor which accept 2 args
    public Rectangle(double width, double height){
        this.height = height;
        this.width = width;

    }
    //Constructor which accept 4 args.
    public Rectangle(double width, double height, String color, boolean filled){
        this.height = height;
        this.width = width;
        this.setColor(color);
        this.setFilled(filled);
    }

    //Getter method for instance width.
    public double getWidth() {
        return width;
    }

    //Setter method for instance width.
    public void setWidth(double width) {
        this.width = width;
    }

    //Getter method for instance height.
    public double getHeight() {
        return height;
    }

    //Setter method for instance height.
    public void setHeight(double height) {
        this.height = height;
    }
    //Method which calculate and return the area of rectangle.
    public double getArea(){
        return (height * width);
    }
    //Method which calculate and return parimeter of the rectangle.
    public double getPerimeter(){
        return (2*(height + width));
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
