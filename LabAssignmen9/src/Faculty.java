/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khawa
     */
//Creating the Faculty class the sub class of the Employee class.
public class Faculty extends Employee{
    //Defining two instandes for storing office Hours and Rank of Faculty.
    private String officeHours;
    private String rank;
    //Constructor with no args.
    public Faculty(){

    }

    //Getter for office Hours.
    public String getOfficeHours() {
        return officeHours;
    }

    //Setter for office Hours.
    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    //Getter for Rank of Faculty.
    public String getRank() {
        return rank;
    }

    //Setter for the Rank.
    public void setRank(String rank) {
        this.rank = rank;
    }

    //Method which give the toString of the Faculty class.
    @Override
    public String toString() {
        return ("Class Name = Faculty\nPerson Name = "+this.getName() );
    }
}
