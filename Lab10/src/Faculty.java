//Creating faculty class and extending it from person class.
public class Faculty extends Person{
    //Creating three new instance variables in this child. One for storing office data 2nd for
    // storing job description and 3rd is for storing hiring date of the faculty.
    private String OfficeNumber;
    public JobDescription jobDescription;
    public HiringDate hiringDate;
    //Constructor which do not accept the parameter.
    public  Faculty(){

    }
    //Constructor which accept the parameters and create object w.r.t the parameters.
    public Faculty(String Name, String CNIC, String EmailAddress,String ContactNumber,
                   String OfficeNumber,JobDescription jobDescription, HiringDate hiringDate ){
        //Assigning the instance variables the data given in the parameter.
        this.setName(Name);
        this.setCNIC(CNIC);
        this.setEmailAddress(EmailAddress);
        this.setContactNumber(ContactNumber);
        this.OfficeNumber = OfficeNumber;
        this.jobDescription = jobDescription;
        this.hiringDate = hiringDate;

    }

    //Getter for getting the office number outside this class.
    public String getOfficeNumber() {
        return OfficeNumber;
    }

    //Getter for getting the job description outside this class.
    public JobDescription getJobDescription() {
        return jobDescription;
    }

    //Getter for getting the hiring date of the faculty outside this class.
    public HiringDate getHiringDate() {
        return hiringDate;
    }

    //Setter for setting the office number outside this class.
    public void setOfficeNumber(String officeNumber) {
        OfficeNumber = officeNumber;
    }

    //Setter for setting job description outside this class.
    public void setJobDescription(JobDescription jobDescription) {
        this.jobDescription = jobDescription;
    }

    //Setter for setting the hiring date of the professor outside this class.
    public void setHiringDate(HiringDate hiringDate) {
        this.hiringDate = hiringDate;
    }

    //Overriding the toString method for printing name, CNIC, Email, contact number, office number , job description
    //and hiring date of the faculty member.
    @Override
    public String toString() {
        return "Faculty{" +
                "Name = " + getName() + '\'' +
                "CNIC = " + getCNIC() + '\'' +
                "EmailAddress = " + getEmailAddress() + '\''+
                "ContactNumber = " + getContactNumber() + '\'' +
                "OfficeNumber='" + getOfficeNumber() + '\'' +
                "\n"+getJobDescription() +
                ",\n hiringDate=" + getHiringDate() +
                "} ";
    }
}
