
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khawa
 */
//Creating the Staff class the subclass of the Employee class.
public class Staff extends Employee{
    //Defining instance variable for storing the title of the staff.
    private String title;
    //Constructor with no args.
    public Staff(){

    }
    //Getter for the Title.
    public String getTitle() {
        return title;
    }

    //Setter for the Title.
    public void setTitle(String title) {
        this.title = title;
    }

    //Method which will give the toString of the Staff class.
    @Override
    public String toString() {
        return ("Class Name = Staff\nPerson Name = "+this.getName() );
    }}
