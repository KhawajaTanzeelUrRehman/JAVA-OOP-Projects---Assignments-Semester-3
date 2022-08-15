/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khawa
 */

class Circle 
{
    private double radius;
    //Contructor which accept parameter.
    public Circle( double radius) 
    {
        //Using this keyword to use instance variable.
        this.radius = radius;
    }

    //Getter to get radius outside this class.
    public double getRadius() 
    {
        return radius;
    }
    //Creating method to calculate the area of  circle.
    public double getArea() 
    {
        return radius * radius * Math.PI;
    }
}
//Creating subclass B of parent class A.
class B extends Circle 
{
    private double length;
    //Constructor which accept two parameters.
    B( double radius, double length) 
    {
        //Calling parent class constructor with using super keyword.
        super( radius);
        //Using this keyword to get the instance variable length.
        this.length = length;
    }

    /** Override getArea() */
    public double getArea() 
    {
        //Using super keyword to call the method of parent class.
        return (super.getArea() * length);
    }
}


//Public class containg main method.
public class ActivityFour
{
    //Mian method for the execution of the code.
    public static void main( String[] args){
        //Creating the object of class B.
        B b = new B( 5, 10);		
        System.out.println( "Area = " + b.getArea());		  
        }
}
