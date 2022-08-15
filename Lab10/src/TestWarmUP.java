//Class to test the working of the program.
public class TestWarmUP {
    //Mian method for the execution of the program.
    public static void main(String[] args){
        //Creating an object class Son.
        Son son = new Son();
        //Creating an object of class Husband.
        Husband husband = new Husband();
        //Creating an object of class Father.
        Father father = new Father();
        //Calling the calling women method with reference to son and printing.
        System.out.print("Calling women with reference to son: "+son.callingWomen());
        System.out.println();
        //Calling the calling women method with reference to husband and printing.
        System.out.print("Calling women with reference to husband: "+husband.callingWomen());
        System.out.println();
        //Calling the calling women method with reference to father and printing.
        System.out.print("Calling women with reference to father: "+father.callingWomen());
    }

}
//Creating a general class containing calling Women method.
class Human{
    public String callingWomen(){
        return "women";
    }
}
//Creating a Son class that extends Human class.
class Son extends Human{
    @Override
    //Overriding the callingWomen method.
    public String callingWomen(){
        return "MOM";
    }
}
//Creating a Son class that extends Human class.
class Husband extends Human{
    @Override
    //Overriding the callingWomen method.
    public String callingWomen(){
        return "Wife";
    }
}
//Creating a Son class that extends Human class.
class Father extends Human{
    @Override
    //Overriding the callingWomen method.
    public String callingWomen(){
        return "Daughter";
    }
}

