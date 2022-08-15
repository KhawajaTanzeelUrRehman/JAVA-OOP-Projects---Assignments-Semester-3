//Creating the class for Date
public class Date {
    //intiallinzing 3 instance variables.
    int month;
    int day;
    int year;
    //Creating a constructor for initiallizing the object wirh the specific value.
    Date(int Month,int Day , int Year){
        month = Month;
        day = Day;
        year = Year;
    }
    
    //Creating a method for displaying date on the consule.
    void displayDate()
    {
        System.out.println(month+"/"+day+"/"+year);
    }
}
