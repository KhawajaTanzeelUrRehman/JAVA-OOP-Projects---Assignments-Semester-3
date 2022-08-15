    // Importing the Scanner class
    import java.util.Scanner;
    
    public class ActivityOne 
   {   
       // main method begins execution of Java application
      public static void main( String args[] ) 
      {
         int total,          // sum of grades input by user
             gradeCounter,   // number of grades entered
             gradeValue,     // grade value
             average;        // average of all grades
         
         // Initialization Phase
         total = 0;          // clear total
         gradeCounter = 1;   // prepare to loop
       Scanner input = new Scanner(System.in);
      
         // Processing Phase
         while ( gradeCounter <= 10 ) // loop 10 times
       {
              // prompt for input and read grade from user
            System.out.print("Enter grade: ");
            gradeValue = input.nextInt(  );
   
            // add gradeValue to total
            total = total + gradeValue;  

 	  // add 1 to gradeCounter
            gradeCounter = gradeCounter + 1;
       }
               average = total/10; // Compute average & display result
      System.out.printf("Total of all 10 grades is %d\n", total);
               System.out.printf("Class average is %d\n", average);
   }
 }
