class Time
{
    private int hour; // 0 - 23
    private int minute; // 0 - 59
    private int second; // 0 - 59

    // TODO: Add constructors definitions here
    //Using constructor Chaning concept
    Time(){
        this(00);
    }

    Time(int hour){
        this(hour,00);
    }
    Time(int hour,int minute){
        this(hour,minute,00);
    }
    //Calling setTime method to check for the valid input.
    Time(int hour,int minute,int second){
        this.setTime(hour, minute, second);
    }
    // set a new time value using universal time; throw an
// exception if the hour, minute or second is invalid 
    public void setTime( int h, int m, int s )
    {
// validate hour, minute and second
        if ( ( h >= 0 && h < 24 ) && ( m >= 0 && m < 60 ) && ( s >= 0 && s < 60 ) )
        {
            hour = h; minute = m; second = s;
        } // end if
         else
            throw new IllegalArgumentException("hour, minute and/or second was out of range" );
    } // end method setTime

    // convert to String in universal-time format (HH:MM:SS)
    public String toUniversalString()
    {
        return String.format( "%02d:%02d:%02d", hour, minute, second );
    } // end method toUniversalString
    public String toString()
    {
        return String.format( "%d:%02d:%02d %s",
                ( ( hour == 0 || hour == 12 ) ? 12 : hour % 12 ), minute, second, ( hour < 12 ? "AM" : "PM" ) );
    } // end method toString
} // end class Time

// This class tests the Time Class by creating different objects. 
public class TimeTest{
    public static void main(String [] args){
        Time t0 = new Time();	// Set Time to 00:00:00
        Time t1 = new Time(11);	// Set Time to 11:00:00
        Time t2 = new Time(12, 40);// Set Time to 12:40:00
        Time t3 = new Time(23, 40, 55); // Set Time to 23:40:55
        Time t4 = new Time(23, 40, 65); // Set Time to 23:40:65

// Print All Times in Universal Format 
        System.out.println(t0.toUniversalString());
        System.out.println(t1.toUniversalString());
        System.out.println(t2.toUniversalString());
        System.out.println(t3.toUniversalString());

// Print All Times in Standard Format
        System.out.println(t0);// toString method invoked on objects implicitly
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }
}

