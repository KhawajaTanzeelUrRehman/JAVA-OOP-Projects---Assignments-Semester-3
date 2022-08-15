public class Time2 {

    private int hour;	// 0 - 23
    private int minute; // 0 - 59
    private int second; // 0 - 59

//	Time2 no-argument constructor:
//	initializes each instance variable to zero 
    public Time2() {
        this(0, 0, 0); // invoke Time2 constructor with three arguments 
    } // end Time2 no-argument constructor

//Time2 constructor: hour supplied, minute and second defaulted to 0 
    public Time2(int h) {

        this(h, 0, 0); // invoke Time2 constructor with three arguments 
    } // end Time2 one-argument constructor

//Time2 constructor: hour and minute supplied, second defaulted to 0 
    public Time2(int h, int m) {
        this(h, m, 0); // invoke Time2 constructor with three arguments
    } // end Time2 two-argument constructor

//Time2 constructor: hour, minute and second supplied 
    public Time2(int h, int m, int s) {
        setTime(h, m, s); // invoke setTime to validate time 
    } // end Time2 three-argument constructor

//Time2 constructor: another Time2 object supplied 
    public Time2(Time2 time) {
// invoke Time2 three-argument constructor
        this(time.getHour(), time.getMinute(), time.getSecond());
    } // end Time2 constructor with a Time2 object argument
//	Set Methods
//	set a new time value using universal time;
//	validate the data

    public void setTime(int h, int m, int s) {
        setHour(h); // set the hour
        setMinute(m); // set the minute
        setSecond(s); // set the second
    } // end method setTime

//validate and set hour
    public void setHour(int h) {
        if (h >= 0 && h < 24) {
            hour = h;
        } else {
            throw new IllegalArgumentException("hour must be 0-23");
        }
    } // end method setHour

//validate and set minute
    public void setMinute(int m) {
        if (m >= 0 && m < 60) {
            minute = m;
        } else {
            throw new IllegalArgumentException("minute must be 0-59");
        }
    } // end method setMinute

//validate and set second 
    public void setSecond(int s) {

        if (s >= 0 && s < 60) {
            second = ((s >= 0 && s < 60) ? s : 0);
        } else {
            throw new IllegalArgumentException("second must be 0-59");
        }
    } // end method setSecond

//	Get Methods
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {

        return second;
    }
//convert to String in universal-time format (HH:MM:SS)

    public String toUniversalString() {

        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

//convert to String in standard-time format (H:MM:SS AM or PM) 
    public String toString() {
        return String.format("%d:%02d:%02d %s",
                ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    } // end method toString
    //tick method to increment the seconds

    public void tick() {
        //Applying this condition so that if the seconds are less then 59 then 
        //incrementing it else assigning second equal to zero and incrementing the minutes. 
        if (this.second < 59) {
            this.second++;
        } else {
            this.second = 0;
            incrementMinute();
        }
    }

    //incrementMinute method to increment the minutes.
    public void incrementMinute() {
        //Applying this condition so that if the minutes are less then 59 then
        //incrementing it else assigning minute equal to zero and incrementing the hours.
        if (this.minute < 59) {
            this.minute++;
        } else {
            this.minute = 0;
            incrementHour();
        }
    }

    //incrementHour method to increment the hours.
    public void incrementHour() {
        //Applying this conditon so that if the hours are less then 23 then
        //incrementing it else assigning hour equal to zero i.e next day.
        if (this.hour < 23) {
            this.hour++;
        } else {
            this.hour = 0;
        }
    }

} // end class Time2
