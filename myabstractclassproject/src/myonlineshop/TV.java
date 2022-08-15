package myonlineshop;

import myonlineshop.Electronics;
//Creating MP3Player class by extending the electronics class.
public class TV extends Electronics {
    //Instance variable to store the size of the TV.
    private int size;
    //Constructor which accept three parameters.
    public TV(double regularPrice,String manufacturer,int size){
        //Calling constructor of the parent class and passing the required parameters.
        super(regularPrice,manufacturer);
        //Assigning variable the value which is received in the parameter.
        this.size = size;
    }
    //Overriding the compute sale method and applying 20% off on all TVs.
    @Override
    public double computeSalePrice() {
        //Applying 10 % sale on all MP3Players.
        return this.getRegularPrice()*0.8;
    }
}
