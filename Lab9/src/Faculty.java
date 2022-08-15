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
        return ("Name : "+ this.getName() + "\nAddress : " + this.getAddress()
                + "\nPhone Number : " + this.getPhoneNumber() + "\nEmail Address : " + this.getEmailAddress()
                + "\nOffice : " +this.getOffice() + "\nSalary : " + this.getSalary()
                + "\nOffice Hours : " + this.getOfficeHours() + "\nRank : " + this.getRank());
    }
}
