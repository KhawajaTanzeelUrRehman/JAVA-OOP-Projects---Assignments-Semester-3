//Creating the Test class for checking the Date class
public class DateTest {
    //Creating main method for the execution of the program.
    public static void main(String [] args){
        
        //Creating two Date objects.
        Date date1 = new Date(12,04,2021);
        Date date2 = new Date(4,22,2021);
        
        //Just printing the heading.
        System.out.println("Displaying Dates");
        //Calling the displayDate method for displaying date on the consule.
        date1.displayDate();
        date2.displayDate();
    }
    
}
