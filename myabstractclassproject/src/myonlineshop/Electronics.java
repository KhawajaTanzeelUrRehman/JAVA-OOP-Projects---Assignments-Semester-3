package myonlineshop;
//Creating an abstract class for Electronics product by extending the product class.
public abstract class Electronics extends Product {
    //Instance variable to store name of the manufacturer.
    private String manufacturer;
    //Constructor which accept three parameters.
    public Electronics(double regularPrice,String manufacturer){
        //Calling super class constructor and passing the parameters.
        super(regularPrice);
        //Assigning the value received in the paramater.
        this.manufacturer = manufacturer;
    }

    //Getter method to get the name of the manufacturer outside this class.
    public String getManufacturer() {
        return manufacturer;
    }

    //Setter method to set the name of the manufacturer from outside this class.
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
