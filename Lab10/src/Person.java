//Creating a generic class person which will be use as parent class for the Student and Faculty class.
public class Person {
    //Creating four instance variables for storing name, CNIC, EmailAddress and Contanct number of the person.
    private String Name;
    private String CNIC;
    private String EmailAddress;
    private String ContactNumber;

    //Constructor which do no accept the parameters.
    public Person() {

    }

    //Constructor which accept the parameters.
    public Person(String Name, String CNIC, String EmailAddress, String ContactNumber) {
        //Assigning the values to the instance variables of the object w.r.t the given parameters.
        this.Name = Name;
        this.CNIC = CNIC;
        this.EmailAddress = EmailAddress;
        this.ContactNumber = ContactNumber;
    }

    //Getter method for getting the name of the person outside this class.
    public String getName() {
        return Name;
    }

    //Getter method for getting CNIC number of the person outside this class.
    public String getCNIC() {
        return CNIC;
    }

    //Getter for getting the email address of the person outside the class.
    public String getEmailAddress() {
        return EmailAddress;
    }

    //Getter method for getting the contact number of the person outside the class.
    public String getContactNumber() {
        return ContactNumber;
    }

    //Setter to set the name of the person outside the this class.
    public void setName(String name) {
        Name = name;
    }

    //Setter for setting the CNIC number of the person outside the class.
    public void setCNIC(String CNIC) {
        this.CNIC = CNIC;
    }

    //Setter method for setting the email address of the person outside this class.
    public void setEmailAddress(String emailAddress) {
        EmailAddress = emailAddress;
    }

    //Setter method for setting the contact number of the person outside this class.
    public void setContactNumber(String contactNumber) {
        ContactNumber = contactNumber;
    }

    //Overriding the toString method to print name, CNIC, Email address and contact number of the person.
    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", CNIC='" + CNIC + '\'' +
                ", EmailAddress='" + EmailAddress + '\'' +
                ", ContactNumber='" + ContactNumber + '\'' +
                '}';
    }

}
