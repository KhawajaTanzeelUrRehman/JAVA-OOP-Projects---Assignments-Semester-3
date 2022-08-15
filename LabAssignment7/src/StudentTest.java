//Defining a class for the students 
class Student {
    //Creating two private fields to store students id and marks of students. 
    private int student_id;
    private int marks;
    //Creaitng a constructor which accept two parameters.
    Student(int s_id,int s_marks){
        student_id = s_id;
        marks = s_marks;
    }
    //Creating a getter method for student id to get id of student outside this class.
    public int student_idGet(){
    
        return student_id;
    }
    //Creating a getter method for student marks to get marks of student outside this class.
    public int marksGet(){
    
        return marks;
    }

}//ending the student class.
//Creating a StudentTest class to test Student class.
public class StudentTest {
    //Creating the main method for the execution of the program.
    public static void main(String[] args)
    {
        //variable to store total marks.
        double totalMarks = 0;
        //Creating an array which can store 7 objects of class Student.
        Student[] StudentArray = new Student[7];
        //Initiallizing 7 objects with random values.
        StudentArray[0] = new Student(345510,89);
        StudentArray[1] = new Student(345511,97);
        StudentArray[2] = new Student(345512,93);
        StudentArray[3] = new Student(345513,74);
        StudentArray[4] = new Student(345514,65);
        StudentArray[5] = new Student(345515,59);
        StudentArray[6] = new Student(345516,39);
        //using for loop to get data of 7 students from the array and calculating total marks.
        for (int i = 0 ;  i <= 6; i++){
            //Calling getter methods with the studentArray reference to get the data of student.
            System.out.println("Stundent with stundent id "+StudentArray[i].student_idGet()
                    +" has marks "+StudentArray[i].marksGet());
            totalMarks += StudentArray[i].marksGet();
        }
        //Just print the averages marks by dividing the total marks with 7.
        System.out.printf("\n\nThe average marks of the students are %.2f\n",(totalMarks/7));
        

    }

    
}
