//Creating a class of job description for storing the data about the job,
public class JobDescription {
    //Defining instance variable which stores job Designation, Salary and the Teaching load.
    private String Designation;
    private String Salary;
    private String TeachingLoad;
    //Constructor which do not accept the parameter.
    public JobDescription(){

    }
    //Constructor which accept the parameters and create the object w.r.t the given data in parameters.
    public JobDescription(String Designation, String Salary, String TeachingLoad){
        this.Designation = Designation;
        this.Salary = Salary;
        this.TeachingLoad = TeachingLoad;
    }

    //Getter method for getting the job designation outside this class.
    public String getDesignation() {
        return Designation;
    }

    //Getter method for getting the salary outside this main class.
    public String getSalary() {
        return Salary;
    }

    //Getter for getting the teaching load outside this main class.
    public String getTeachingLoad() {
        return TeachingLoad;
    }

    //Setter for setting the job Designation from outside the class.
    public void setDesignation(String designation) {
        Designation = designation;
    }

    //Setter for setting the salary from outside the class.
    public void setSalary(String salary) {
        Salary = salary;
    }

    //Setter for setting the teaching load from outside the class.
    public void setTeachingLoad(String teachingLoad) {
        TeachingLoad = teachingLoad;
    }

    //Overriding the toString method to print job description, Salary and the teaching load,
    @Override
    public String toString() {
        return "JobDescription{" +
                "Designation='" + Designation + '\'' +
                ", Salary='" + Salary + '\'' +
                ", TeachingLoad='" + TeachingLoad + '\'' +
                '}';
    }
}
