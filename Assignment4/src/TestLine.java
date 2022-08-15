/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khawa
 */
//Class to test the Line class.
public class TestLine {
    //Main method for the execution of the program.
    public static void main (String [] args){
        //Creating 2 objects of the class line.
        Line line1 = new Line(20,30,90,50);
        Line line2 =  new Line(20,30,90,50);
        //Calculating the length of the line using the getLength method and printing the result.
        double l = line1.getLength();
        System.out.println(l);
        //Using isGreater method to compare the line and printing the result. 
        boolean bb = line1.isGreater(line2);
        System.out.println(bb);
        //Using isEqual method to check the lines are equal or not.
        boolean bb1 = line2.isEqual(line2);
        System.out.println(bb1);
    }
    
}
