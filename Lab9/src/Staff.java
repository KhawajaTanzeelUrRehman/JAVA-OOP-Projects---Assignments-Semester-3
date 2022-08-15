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
        return ("Name : "+ this.getName() + "\nAddress : " + this.getAddress()
                + "\nPhone Number : " + this.getPhoneNumber() + "\nEmail Address : " + this.getEmailAddress()
                + "\nOffice : " +this.getOffice() + "\nSalary : " + this.getSalary()
                + "\nTitle : " + this.getTitle());
    }}
