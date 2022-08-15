package myonlineshop;
//Creating Book class that extending the product class.
public class Book extends Product {
    //Instance variables to store the name of publisher and year of publishing.
    private String publisher;
    private int yearPublished;
    //Constructor which accept three parameter.
    public Book(double regularPrice,String publisher,int yearPublished){
        //Calling the parent class method and passing the required parameter to that constructor.
        super(regularPrice);
        //Assigning the variables the value which is received as the parameter.
        this.publisher = publisher;
        this.yearPublished = yearPublished;
    }

    //Overriding the computeSalePrice method and applying 50 % sale on all books.
    @Override
    public double computeSalePrice() {
        //Applying 50 % off from the regular price of the books.
        return this.getRegularPrice()*0.5;
    }

    //Getter method to get the name of publisher outside this class.
    public String getPublisher() {
        return publisher;
    }

    //Setter method to set the name of publisher from outside this class.
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    //Getter method to get the year of publishing from outside this class.
    public int getYearPublished() {
        return yearPublished;
    }

    //Setter method to set the year of publishing from outside this class.
    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }
}
