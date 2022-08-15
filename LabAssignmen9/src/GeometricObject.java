/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khawa
 */
//importing Date library for getting the date of creation of the object.
import java.util.Date;
//Creating a parent class with respect to the given UML.
public class GeometricObject {
    //private instances for storing color and filled status.
    private String color = "white";
    private boolean filled = false;
    // instance variable to store the creation time of the object.
    private java.util.Date dateCreated;

    //Creating a constructor with no-args and default values.
    public GeometricObject() {
        color = "white";
        filled = false;
        dateCreated = new java.util.Date();
    }

    //Constructor which accept some parameters and make the object with reference to that parameters.
    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        dateCreated = new java.util.Date();
    }

    //Getter method for color instance.
    public String getColor() {
        return color;
    }

    //Setter method for color instance.
    public void setColor(String color) {
        this.color = color;
    }

    //Getter method for isFilled instance.
    public boolean isFilled() {
        return filled;
    }

    //Setter method for setting the value of instance filled.
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    //Getter to get the creation time of the object.
    public Date getDateCreated() {
        return dateCreated;
    }

    //Method to print the properties of the object.
    public String toString() {
        return "GeometricObject{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", dateCreated=" + dateCreated +
                '}';
    }
}