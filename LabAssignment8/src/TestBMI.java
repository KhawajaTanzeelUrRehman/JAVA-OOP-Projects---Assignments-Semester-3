//Importing scanner library for taking inputs from the user.

import java.util.Scanner;
//Creating a class to test the BMI.java class.

public class TestBMI {

    //Creating the main method for the execution of the program.
    public static void main(String[] agrs) {
        //Creating Scanner object for taking input from the user.
        Scanner input = new Scanner(System.in);
        //Creating variables for storing the inputs taken from the user.
        String name;
        int age;
        double weight;
        double height;
        //Just printing taking and storing input using scanner library.
        System.out.print("Please enter the name of the person: ");
        name = input.nextLine();
        System.out.print("Please enter the age of the person: ");
        age = input.nextInt();
        System.out.print("Please enter the weight of the person in pounds: ");
        weight = input.nextDouble();
        System.out.print("Please enter the height of the person inches : ");
        height = input.nextDouble();
        System.out.println();
        //Creating first object by calling the costructor of 4 parameters and passing the values taken from the user.
        BMI object1 = new BMI(name, age, weight, height);
        //Just calling the getBMI method to calculate and print the BMI of the object1.
        System.out.println("The BMI of the " + object1.getName() + " is : " + object1.getBMI());
        //Just Calling the getStatus method to get the status of the object and printing it.
        System.out.println(object1.getName() + " is " + object1.getStatus());
        //Creating an object2 by using copy constructor.
        BMI object2 = new BMI(object1);
        //Just printing its values.
        System.out.println("Using Copy construtor");
        System.out.println("The BMI of the " + object2.getName() + " is : " + object2.getBMI());
        System.out.println(object2.getName() + " is " + object2.getStatus());
        System.out.println("Changing data using set methods");
        //Using setter to set the values of object2
        object2.setName("Tanzeel Ur Rehman");
        object2.setAge(21);
        object2.setheight(72);
        object2.setweight(168.9);
        //printing the updated values of object2.
        System.out.println("The BMI of the " + object2.getName() + " is : " + object2.getBMI());
        System.out.println(object2.getName() + " is " + object2.getStatus());

    }
}
