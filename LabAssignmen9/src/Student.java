
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khawa
 */
//Creating Student class the sub class of Person class.
public class Student extends Person{
    //Private constant for storing the classStatus of the Student.
    private final String classStatus = "junior";
    //Constructor with no args.
    public Student(){

    }

    //Getter for the class Status.
    public String getClassStatus() {
        return classStatus;
    }

    //Method to get the toString of the class Student.
    @Override
    public String toString() {
        return ("Class Name = Student\nPerson Name = "+this.getName() );
    }}
