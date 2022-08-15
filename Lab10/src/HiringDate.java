//Creating class for displaying the hiring date.
public class HiringDate {
    //Defining instance variables for storing day, month and year.
    private String Day = "00";
    private String Month = "00";
    private String Year = "0000";
    //Constructor with no parameters.
    public HiringDate(){
    }
    //Constructor which accept the parameters.
    public HiringDate(String Day, String Month , String Year){
        //Assigning the value to the instance variable w.r.t the given data in the parameters.
        this.Day = Day;
        this.Month = Month;
        this.Year = Year;
    }

    //Setter for setting the day from outside this class.
    public void setDay(String day) {
        Day = day;
    }

    //Setter for setting the month from outside this class.
    public void setMonth(String month) {
        Month = month;
    }

    //Setter for setting the year from outside this class.
    public void setYear(String year) {
        Year = year;
    }

    //Overriding the toString method for printing Date in proper manner.
    @Override
    public String toString() {
        return "HiringDate{"+this.Day + ':'+ this.Month+':'+this.Year+'}';
    }
}
