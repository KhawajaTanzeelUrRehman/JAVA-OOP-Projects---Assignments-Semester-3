import java.util.Scanner;         //importing library for taking input from the user.
public class StudentInformation { // Defining the main class for the program.
    public static void main(String[] args){//Main function of the program.
        Scanner input = new Scanner(System.in);//Defining an object for taking inputs.
        //Just taking input from the user and storing it in the variables.
        System.out.print("Select your year i.e Freshman, Sophomore, Junior,"
                + " or Senior: ");
        String studentsYear = input.nextLine();
        System.out.print("Please enter number of subjects you are taking: ");
        int numberOfSubjects = input.nextInt();
        System.out.print("Please enter your GPA: ");
        float GPA = input.nextFloat();
        //Printing the stored values from the variables.
        System.out.println("Student year: "+studentsYear+"\nNumber of taking"
                + " subjects: "+numberOfSubjects+"\nStudnents GPA: "
                +GPA);
    }

}