/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khawa
 */
//Creating a class which can store the x and y coordinates of the points.
public class Point {
    //Variavle to store x coordinate of the point.
    private double x;
    //Variable to store y coordinate of the point.
    private double y;
    //Constructor which accept parameters.
    Point(double x, double y){
        //Assigning the values to the instance variables which received from parameter.
        this.x = x;
        this.y = y;
    }
    //Getter method to get x coordinate of the point outside this class.
    public double getx(){
        return this.x;
    }
    //Getter method to get y coordinate of the point outside this class.
    public double gety(){
        return this.y;
    }
    //Setter method to set x coordinate of the point from outside this class.
    public void setx(double x){
       this.x = x;
    }
    //Setter method to set y coordinate of the point from outside this class.
    public void sety(double y){
       this.y = y;
    }
    @Override
    //Overriding toString method to print the point.
    public String toString(){
        return "Point("+this.x+","+this.y+")";
    }
}
