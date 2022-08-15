//Creating a class according to the given instructions

public class BMI {

    //Creatin 4 private instance variables for the class.
    private String name;
    private int age;
    private double weight;
    private double height;
    //Creating a constructor which accept 4 parameter.

    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    //Creating a constructor which takes 3 parameters.
    public BMI(String name, double weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }
    //Creating a copy constructor.
    public BMI(BMI b) {

        this.name = b.name;
        this.age = b.age;
        this.weight = b.weight;
        this.height = b.height;
    }
    //Defining a getBMI method which calculate and return the BMI of the object.
    public double getBMI() {
        return weight * 0.45359237 / (height * 0.0254 * height * 0.0254);
    }
    //Creating a method which returns the status of the person according to the given instructions.
    public String getStatus() {

        if (this.getBMI() < 18.5) {
            return "Underweight\n";
        } else if (this.getBMI() >= 18.5 && this.getBMI() < 24.9) {
            return "Normal\n";
        } else if (this.getBMI() >= 25 && this.getBMI() < 29.9) {
            return "Overweight\n";
        } else {
            return "Obese\n";
        }
    }
    //Getters to get values of instance variables outside the class.
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getweight() {
        return weight;
    }

    public double getheight() {
        return height;
    }
    //Setter to set the values of instance variables from outside this class.
    public void setAge(int age) {

        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setweight(double weight) {
        this.weight = weight;
    }

    public void setheight(double height) {
        this.height = height;
    }
}
