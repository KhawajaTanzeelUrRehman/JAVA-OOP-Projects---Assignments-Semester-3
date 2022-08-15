//Creating Test class for testing the program.
public class TestTask2 {
    //Main method for the execution of the program.
    public static void main(String[] args){
        //Creating the object of the Person class and printing its data to the console using the toString method.
        System.out.println("CREATING AND PRINTING AN OBJECT OF CLASS Person:");
        Person person1 = new Person("Tanzeel Ur Rehman","38579-4048303-8","khawajatn1@gmail.com","0305-4859444");
        System.out.println(person1);

        //Creating two objects of the Student class and printing Their data to the console using the toString method.
        System.out.println("\n\nCREATING TWO OBJECTS OF CLASS Student AND PRINTING THEIR INITIAL DATA:");
        Student student1 = new Student("Obaid Ur Rehman ","37594-847959-8","Obaid@gmail.com","0305-75884786","Fall-2020","379857");
        Student student2 = new Student();
        System.out.println(student1);
        System.out.println(student2);

        //Updating the data of student2 by using the setter mehtod for checking the functionality and printing the new date to the console
        //by using toString method.
        System.out.println("\n\nUPDATING THE DATA OF STUDENT2 BY USING SETTER AND PRINTING THE NEW VALUE OF STUDENT2:");
        student2.setName("Awais Ur Rehman");
        student2.setCNIC("37585-0976789-8");
        student2.setEmailAddress("Awais@gmail.com");
        student2.setContactNumber("0309-9876579");
        student2.setBatch("Spring-2018");
        student2.setRegNumber("285749");
        System.out.println(student2);
        //Creating the object of the jobDescription class and printing its data to the console by using the toString method.
        System.out.println("\n\nCREATING THE OBJECT OF CLASS JobDescription AND PRINTING ITS DATA:");
        JobDescription jobDescription1 = new JobDescription("HOD Physics Department","99,000","Software Engineering Department and Electrical Engineering Department");
        System.out.println(jobDescription1);
        //Creating the object of the HiringDate class and printing its data to the console by using the toString method.
        System.out.println("\n\nCREATING THE OBJECT OF CLASS HiringDate AND PRINTING ITS DATA:");
        HiringDate hiringDate1 = new HiringDate("23","11","2018");
        System.out.println(hiringDate1);
        //Now Creating the two object of the faculty class and printing their values to the console by using toString method.
        System.out.println("\n\nCREATING Two OBJECT OF CLASS FACULTY AND PRINTING THEIR DATA");
        Faculty faculty1 = new Faculty("Amir Malik","39850-5749857-8","Amir@gmail.com","0307-8759987","0483-487957",jobDescription1,hiringDate1);
        Faculty faculty2 = new Faculty();
        System.out.println(faculty1);
        System.out.println(faculty2);

        System.out.println("\n\nUPDATING THE DATA OF faculty2 BY USING SETTER AND PRINTING ITS NEW DATA:");
        //updating the data of faculty object and printing the updated data on the console.
        faculty2.setName("Ahmad Haneef");
        faculty2.setCNIC("38977-4678765-0");
        faculty2.setEmailAddress("Ahmad@gmail.com");
        faculty2.setContactNumber("0309-9873465");
        faculty2.setHiringDate(new HiringDate("13","02","2016"));
        faculty2.setJobDescription(new JobDescription("Deen of Physics Department","149,000","Electrical Engineering Department"));
        faculty2.setOfficeNumber("0487-987456");
        System.out.println(faculty2);
    }
}
