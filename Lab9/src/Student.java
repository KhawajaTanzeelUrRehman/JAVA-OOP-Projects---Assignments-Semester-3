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
        return ("Name : "+ this.getName() + "\nAddress : " + this.getAddress()
                + "\nPhone Number : " + this.getPhoneNumber() + "\nEmail Address : " + this.getEmailAddress()
                +"\nClass Status : " + this.getClassStatus());
    }}
