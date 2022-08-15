/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khawa
 */
public class TestConcreteLine {
    //Main method for the execution of the program.
    public static void main(String[] args){

        //Creating 4 differnt points in the xy Plane using point class.
        System.out.println("Creating Different points and printing them.");
        Point p1 = new Point(20,90);
        Point p2 = new Point(30,50);
        Point p3 = new Point(30,40);
        Point p4 = new Point(50,65);
        //Printing the points on the console.
        System.out.print("Point 1 is: "+p1+"\nPoint 2 is: "+p2+"\nPoint 3 is: "+p3+"\nPoint 4 is: "+p4);
        //Creating four lines to check different methods.
        ConcreteLine cLine1 = new ConcreteLine(p1,p2);
        ConcreteLine cLine2 = new ConcreteLine(p1,p2);
        ConcreteLine cLine3 = new ConcreteLine(p2,p3);
        ConcreteLine cLine4 = new ConcreteLine(p3,p4);
        //Printing the length of all Lines.
        System.out.println("\n\n\nPrinting the length of all lines");
        System.out.print("The length of line 1 is: "+cLine1.getLength()+"\nThe length of line 2 is: " + cLine2.getLength()
        +"\nThe length of line 3 is: "+cLine3.getLength()+"\nThe length of line 4 is: "+cLine4.getLength());
        //Now checking the working of isGreater Method
        System.out.println("\n\n\nNow Checking the working of isGreater Method");
        System.out.println("Applying isGrater Method on line 1 and line 2");
        System.out.println(cLine1.isGreater(cLine1,cLine2));
        System.out.println("Applying isGrater Method on line 3 and line 4");
        System.out.println(cLine3.isGreater(cLine3,cLine4));
        System.out.println("Applying isGrater Method on line 1 and line 3");
        System.out.println(cLine1.isGreater(cLine1,cLine3));
        
        //Now checking the working of isLess Method
        System.out.println("\n\n\nNow Checking the working of isLess Method");
        System.out.println("Applying isLess Method on line 1 and line 2");
        System.out.println(cLine1.isLess(cLine1,cLine2));
        System.out.println("Applying isLess Method on line 3 and line 4");
        System.out.println(cLine3.isLess(cLine3,cLine4));
        System.out.println("Applying isLess Method on line 1 and line 3");
        System.out.println(cLine1.isLess(cLine1,cLine3));

        //Now checking the working of isEqual Method
        System.out.println("\n\n\nNow Checking the working of isEqual Method");
        System.out.println("Applying isEqual Method on line 1 and line 2");
        System.out.println(cLine1.isEqual(cLine1,cLine2));
        System.out.println("Applying isEqual Method on line 3 and line 4");
        System.out.println(cLine3.isEqual(cLine3,cLine4));
        System.out.println("Applying isEqual Method on line 1 and line 3");
        System.out.println(cLine1.isEqual(cLine1,cLine3));

    }
}











