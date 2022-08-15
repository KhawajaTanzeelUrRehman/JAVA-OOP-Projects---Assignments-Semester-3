/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khawa
 */
//Creating an abstract class for lines.
    abstract class AbstractLine {
    //Defining the absract method for calculating the length of the line. 
    public abstract double getLength();
    //Defining the absract method for checking the given lines is greater then other or not.
    public abstract boolean isGreater(Object a,Object b);
    //Defining the absract method for checking the given lines is lesser then other or not.
    public abstract boolean isLess(Object a,Object b);
    //Defining the absract method for checking the given lines isEqual to other or not.
    public abstract boolean isEqual(Object a,Object b);
    
}
