
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khawa
 */
//Creating the General or parent class.
public class Person {
    //Defining the private instance variable for storing name, address, phone number and email address.
    private String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;
    //Constructor with no args
    public Person(){
    }

    //Getter method for name
    public String getName() {
        return name;
    }

    //Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    //Getter method for address
    public String getAddress() {
        return address;
    }

    //Setter method for address
    public void setAddress(String address) {
        this.address = address;
    }

    //Getter method for PhoneNumber
    public String getPhoneNumber() {
        return phoneNumber;
    }

    //Setter method for PhoneNumber
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //Getter method for EmailAddress
    public String getEmailAddress() {
        return emailAddress;
    }

    //Setter method for EmailAddress
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    //Method for getting the toString of Person class.
    public String toString() {
        return ("Class Name = Person\nPerson Name = "+this.getName() );
    }
}