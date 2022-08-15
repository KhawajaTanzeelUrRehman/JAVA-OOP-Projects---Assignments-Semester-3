//Creating the class to test the Time2 class. 

public class Testtime2 {

    //Main method for the execution of the program.
    public static void main(String[] args) {
        //Creating 4 object by using constuctors.
        Time2 object1 = new Time2(0, 0, 59);
        Time2 object2 = new Time2(0, 59, 59);
        Time2 object3 = new Time2(23, 59, 59);
        Time2 object4 = new Time2();
        //printing the time before incrementing their values
        System.out.println("Value of Time for 3 objects before increment\n");
        System.out.println("object1   :    " + object1.toUniversalString() + "    which is        " + object1.toString());
        System.out.println("object2   :    " + object2.toUniversalString() + "    which is        " + object2.toString());
        System.out.println("object3   :    " + object3.toUniversalString() + "    which is        " + object3.toString());
        //invoking the tick method to increment seconds.
        object1.tick();
        object2.tick();
        object3.tick();
        //printing the new value of time.
        System.out.println("\nTime after calling tick method for object1, object2 and object3\n");
        System.out.println("object1   :    " + object1.toUniversalString() + "    which is        " + object1.toString());
        System.out.println("object2   :    " + object2.toUniversalString() + "    which is        " + object2.toString());
        System.out.println("object3   :    " + object3.toUniversalString() + "    which is        " + object3.toString());
        //printing the value of object 4 before incrementing.
        System.out.println("\nObject4 before increment");
        System.out.println("object4   :    " + object4.toUniversalString() + "    which is        " + object4.toString());
        //Invoking incrementMinute to increment the minute
        object4.incrementMinute();
        System.out.println("\nobject4 after calling incrementMinute method");
        //printing the new value of object4.
        System.out.println("object4   :    " + object4.toUniversalString() + "    which is        " + object4.toString());
        //Invoking the incrementHour method for incrementing hours.
        object4.incrementHour();
        System.out.println("\nobject4 after calling incrementhour method");
        //printing the updated value of object4.
        System.out.println("object4   :    " + object4.toUniversalString() + "    which is        " + object4.toString());

    }
}
