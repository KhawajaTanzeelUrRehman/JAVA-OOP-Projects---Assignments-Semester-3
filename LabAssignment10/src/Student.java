/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khawa
 */
//Creating the student class and extending it from the person class.
public class Student extends Person{
    // Creating new instance variables in the child class. for storing Batch and Registration number of the stucent.
    private String Batch;
    private String RegNumber;
    //Constructor which do nor accept the parameter.
    public Student(){

    }
    //Constructor which accept the parameters and create the new object w.r.t the the given parameters.
    public Student(String Name, String CNIC, String EmailAddress, String ContactNumber,String Batch,String RegNumber){
        //Assigning instance variables of the object data which is given in the parameter of the constructor.
        this.setName(Name);
        this.setCNIC(CNIC);
        this.setEmailAddress(EmailAddress);
        this.setContactNumber(ContactNumber);
        this.Batch = Batch;
        this.RegNumber = RegNumber;
    }

    //Getter to get the batch of the stuedent outside this class.
    public String getBatch() {
        return Batch;
    }

    //Getter for getting the registration number of the student outside this class.
    public String getRegNumber() {
        return RegNumber;
    }

    //Setter for setting the batch of the student.
    public void setBatch(String batch) {
        Batch = batch;
    }

    //Setter for setting the registration number of the student.
    public void setRegNumber(String regNumber) {
        RegNumber = regNumber;
    }

    //Overriding the toString method for printing name, CNIC , Email , contact number, Batch and Registration of the Student.
    @Override
    public String toString() {
        return "Student{" +
                "Name = " + getName() + '\'' +
                "CNIC = " + getCNIC() + '\'' +
                "EmailAddress = " + getEmailAddress() + '\''+
                "ContactNumber = " + getContactNumber() + '\'' +
                "Batch='" + getBatch() + '\'' +
                ", RegNumber='" + getRegNumber() + '\'' +
                "} ";
    }
}
