/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khawa
 */
//Class to test the class.
public class TestProgram2 {
    //Main method for the execution of the program.
    public static void main(String[] args){
        //Creating object of all 5 classes.
        Person person = new Person();
        Employee employee = new Employee();
        Student student = new Student();
        Faculty faculty = new Faculty();
        Staff staff = new Staff();

        //Setting the data for the class Person.
        person.setName("Tanzeel");
        person.setAddress("House#1");
        person.setPhoneNumber("03057225865");
        person.setEmailAddress("tanzeel@gmail.com");

        //Setting the data for the class Employee.
        employee.setName("Awais");
        employee.setAddress("House#2");
        employee.setPhoneNumber("02326144998");
        employee.setEmailAddress("awais@gmail.com");
        employee.setSalary(99000);
        employee.setOffice("Microsoft Corporation");

        //Setting the data for the class Student.
        student.setName("Sharjeel");
        student.setAddress("House#3");
        student.setPhoneNumber("03040585994");
        student.setEmailAddress("Sharjeel@gmail.com");

        //Setting the data for the class Faculty.
        faculty.setName("Anees");
        faculty.setAddress("House#4");
        faculty.setPhoneNumber("03857694003");
        faculty.setEmailAddress("Anees@gmail.com");
        faculty.setOfficeHours("8:00 - 17:00");
        faculty.setOffice("Reader College");
        faculty.setRank("Head of Physics Department");
        faculty.setSalary(80000);

        //Setting the data for the class Staff.
        staff.setName("Adeel");
        staff.setAddress("House#5");
        staff.setPhoneNumber("02850038050");
        staff.setEmailAddress("Adeel@gmail.com");
        staff.setOffice("Punjab College");
        staff.setSalary(45000);
        staff.setTitle("Clerk");

        //Printing the data of all the object using their toString Methods.
        System.out.println("The toString of Person is : \n" + person.toString());
        System.out.println();
        System.out.println("The toString of Employee is : \n" + employee.toString());
        System.out.println();
        System.out.println("The toString of Student is : \n" + student.toString());
        System.out.println();
        System.out.println("The toString of Faculty is : \n" + faculty.toString());
        System.out.println();
        System.out.println("The toString of Staff is : \n" + staff.toString());

    }
}
