//importing Date library for getting the date of the creation of the object.
import java.util.Date;
//Creating Employee class the subclass of the Person class.
public class Employee extends Person{
    //Private instances of the Employee class to store salary, office and Date.
    private String office;
    private double salary;
    private java.util.Date dateHired = new Date();
    //Constructor with no args.
    public Employee(){

    }

    //Getter for the Office.
    public String getOffice() {
        return office;
    }

    //Setter for the office.
    public void setOffice(String office) {
        this.office = office;
    }

    //Getter for the salary.
    public double getSalary() {
        return salary;
    }

    //Setter for the salary.
    public void setSalary(double salary) {
        this.salary = salary;
    }

    //Getter for the Date.
    public Date getDateHired() {
        return dateHired;
    }

    // Method to get the toString of the Employee class.
    public String toString() {
        return ("Name : "+ this.getName() + "\nAddress : " + this.getAddress()
                + "\nPhone Number : " + this.getPhoneNumber() + "\nEmail Address : " + this.getEmailAddress()
        + "\nOffice : " +this.getOffice() + "\nSalary : " + this.getSalary());
    }
}
