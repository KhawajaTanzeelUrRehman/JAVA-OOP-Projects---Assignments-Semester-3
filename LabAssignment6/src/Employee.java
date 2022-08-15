//Creating a class for Employee
public class Employee {
    //Creating three instance variables.
    String firstName;
    String lastName;
    double monthlySalary;
    //Creating a constructor for initiallizing the object.
    Employee(String firstname, String lastname,double monthlysalary)
    {
     firstName = firstname;
     lastName = lastname;
     //Applying condition so that if user enter a negitive salary then it become zero.
     if (monthlysalary < 0 )
         monthlySalary = 0;
     else
         monthlySalary = monthlysalary;
    }
}
