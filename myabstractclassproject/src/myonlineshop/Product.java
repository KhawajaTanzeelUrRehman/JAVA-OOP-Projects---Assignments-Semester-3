package myonlineshop;
//Creating an abstract method according to the given uml.
public abstract class Product {
    //Instance variable to store the regular price of all products.
    private double regularPrice;
    //Constructor which accept one parameter.
    public Product(double regularPrice){
        //Assigning regularPrice as given in the parameter.
        this.regularPrice = regularPrice;
    }
    //Defining an abstract method which will compute sale Price differently for each product.
    public abstract double computeSalePrice();

    //Getter method to get regular price of the product outside this class.
    public double getRegularPrice() {
        return regularPrice;
    }

    //Setter method to set the value of regular price from outside this class.
    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }
}
