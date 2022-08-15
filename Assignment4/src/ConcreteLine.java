/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khawa
 */
//Creating ConcreteLine class by extending the AbstractLine class.
public class ConcreteLine extends AbstractLine {
    //Variables to store the points of the lines
    private Point p1;
    private Point p2;
    //Constructor which accept the parameter.
    public ConcreteLine(Point p1, Point p2){
        //Assignnig the values to the variables which are received in the parameter.
        this.p1 = p1;
        this.p2 = p2;
    }

     //Overriding the method for calculating the length of the line. 
    @Override
    public double getLength(){
        return Math.sqrt((p2.getx()-p1.getx())*(p2.getx()-p1.getx())+(p2.gety()-p1.gety())*(p2.gety()-p1.gety()));
    }
    //Overriding the method for checking the given lines is greater then other or not.
    @Override
    public boolean isGreater(Object x,Object y){
        //Downcasting the Object class object to the object of ConcreteLine class.
        ConcreteLine a = (ConcreteLine)x;
        ConcreteLine b = (ConcreteLine)y;
        return a.getLength() > b.getLength();
    }
    
    //Defining method for checking the given lines is lesser then other or not.
    @Override
    public boolean isLess(Object x,Object y){
        //Downcasting the Object class object to the object of ConcreteLine class.
        ConcreteLine a = (ConcreteLine)x;
        ConcreteLine b = (ConcreteLine)y;
        return a.getLength() < b.getLength();
    }
    //Defining method for checking the given lines isEqual to other or not.
    @Override
    public boolean isEqual(Object x,Object y){
        //Downcasting the Object class object to the object of ConcreteLine class.
        ConcreteLine a = (ConcreteLine)x;
        ConcreteLine b = (ConcreteLine)y;
        return a.getLength() == b.getLength();
    }
    
}
