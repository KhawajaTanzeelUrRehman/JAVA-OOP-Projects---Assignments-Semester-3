public class TestCircle {  


    public static void main(String[] args) {

        // Declare an instance of Circle class called c1.
        // Construct the instance c1 by invoking the "default" constructor
        // which sets its radius and color to their default value.
        Circle c1 = new Circle();
        // Invoke public methods on instance c1, via dot operator.        
        System.out.println("The circle has radius of " 
        + c1.getRadius() + " and area of " + c1.getArea());
        System.out.println("This circle has color "+c1.getColor()+"\n\n");

               
        // Declare an instance of class circle called c2.
        // Construct the instance c2 by invoking the second constructor
        // with the given radius and default color.
        Circle c2 = new Circle(2.0);
        // Invoke public methods on instance c2, via dot operator.
        System.out.println("The circle has radius of " 
        + c2.getRadius() + " and area of " + c2.getArea());
        System.out.println("This circle has color "+c2.getColor()+"\n\n");


        // Declare an instance of class circle called c3.
        // Construct the instance c3 by invoking the third constructor
        // with the given radius and given color.
        Circle c3 = new Circle(3.0,"blue");
        // Invoke public methods on instance c3, via dot operator.
        System.out.println("The circle has radius of " 
        + c3.getRadius() + " and area of " + c3.getArea());
        System.out.println("This circle has color "+c3.getColor()+"\n\n");

        
        // Declare an instance of Circle class called c4.
        // Construct the instance c4 by invoking the "default" constructor
        // which sets its radius and color to their default value.
        Circle c4 = new Circle();
        //Setting the Radius of the circle c4 by calling setRadius method.
        c4.setRadius(4);
        //Setting the color of the circle c4 by calling setColor method.
        c4.setColor("Yellow");
        // Invoke public methods on instance c4, via dot operator.
        System.out.println("The circle has radius of " 
        + c4.getRadius() + " and area of " + c4.getArea());
        System.out.println("This circle has color "+c4.getColor()+"\n\n");


        // Declare an instance of Circle class called c5.
        // Construct the instance c5 by invoking the "default" constructor
        // which sets its radius and color to their default value.
        Circle c5 = new Circle();
        //Setting the Radius of the circle c5 by calling setRadius method.
        c5.setRadius(5);
        //Setting the color of the circle c5 by calling setColor method.
        c5.setColor("Green");
        // Invoke public methods on instance c5, via dot operator.
        System.out.println("The circle has radius of " 
        + c5.getRadius() + " and area of " + c5.getArea());
        System.out.println("This circle has color "+c5.getColor()+"\n\n");
        
        
        System.out.println("Total number of objects created are "+ Circle.noOfObjects);        
    }
}
