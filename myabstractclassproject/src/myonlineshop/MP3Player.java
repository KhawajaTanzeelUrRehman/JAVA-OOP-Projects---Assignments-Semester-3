package myonlineshop;
//Creating MP3Player class by extending the electronics class.
public class MP3Player extends Electronics {
    //Instance variable to store the color of the MP3Player.
    private String color;
    //Constructor which accept three parameters.
    public MP3Player (double regularPrice, String manufacturer, String color){
        //Calling constructor of the parent class and passing the required parameters.
        super(regularPrice,manufacturer);
        //Assigning variable the value which is received in the parameter.
        this.color = color;
    }

    //Overriding the compute sale method and applying 10% off on all MP3Players.
    @Override
    public double computeSalePrice() {
        //Applying 10 % sale on all MP3Players.
        return this.getRegularPrice()*0.9;
    }

    //Getter method to get the value of color outside this class.
    public String getColor() {
        return color;
    }

    //Setter method to set the color of MP3Player from outside the main class.
    public void setColor(String color) {
        this.color = color;
    }
}
