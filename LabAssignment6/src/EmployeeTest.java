//Creating a class to test the Employee class
public class EmployeeTest {
 
    //Creating a main method to execute the program.
    public static void main(String[] main){
        //Creating two objects of class Employee with specific values.
        Employee employee1 = new Employee("Rana","Qasim",30000);
        Employee employee2 = new Employee("Shiekh","Chilli",15000);
        
        //Just calling the objects instances and print the value of yearly salary by multiplaying the monthly salary by 12.
        System.out.printf("The yearly salary of %s %s is %.2f\n",employee1.firstName,employee1.lastName,employee1.monthlySalary * 12);
        System.out.printf("The yearly salary of %s %s is %.2f\n\n",employee2.firstName,employee2.lastName,employee2.monthlySalary * 12);
        
        //Increasing the salary of both Employees by 10%
        employee1.monthlySalary = employee1.monthlySalary * 1.1;
        employee2.monthlySalary = employee2.monthlySalary * 1.1;
        
        //Printing the new salary of both Employees
        System.out.println("UPGRADED SALARY");
        System.out.printf("The yearly salary of %s %s is %.2f\n",employee1.firstName,employee1.lastName,employee1.monthlySalary * 12);
        System.out.printf("The yearly salary of %s %s is %.2f\n",employee2.firstName,employee2.lastName,employee2.monthlySalary * 12);
    }    
}
