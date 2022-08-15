/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khawa
 */
//Creating a class which can calculate the length of a line as well as 
//compare length of two lines.  
public class Line {
    //Variables which can store the points of the Line.
    private double x1;
    private double x2;
    private double y1;
    private double y2;
    //Constructor which accepts parameters.
    public Line(double x1,double x2,double y1,double y2){
        //Assigning the values to the poitns which are given in the parameter.
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    //Method which can calculate the length of the  line.
    public double getLength(){
        return Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
    }
    //Method which can check the given line is greater then other or not.
    public boolean isGreater(Line a){
        return this.getLength() > a.getLength();
    }
     //Method which can check the given line is smaller then other or not.
    public boolean isLess(Line a){
        return this.getLength() < a.getLength();
    }
     //Method which can check the given line is equal to other or not.
    public boolean isEqual(Line a){
        return this.getLength() == a.getLength();
    }
    
}
