/*Creating the book class according to the given UML Consisting of Aggregation relationship of class book with the
  Author class.*/
public class Book {
    //private instance for storing name of book.
    private String name;
    //private instance for storing author information in reference variable of class Author.
    private Author author;
    //instance variable to store the price of the book.
    private double price;
    //instance variable for counting the stock of the book.
    private int qtyInStock = 0;

    //Constructor which accept three variables.
    public Book(String name, Author author, double price) {
        //Initializing the instances w.r.t the given parameters.
        this.name = name;
        this.author = author;
        this.price = price;
    }

    //Constructor which accept four variables.
    public Book(String name, Author author, double price, int qtyInStock) {
        //Initializing the instances w.r.t the given parameters.
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    //Getter for the book name.
    public String getName() {
        return name;
    }

    //Getter for author information which return in type Author.
    public Author getAuthor() {
        return author;
    }

    //Getter for the price of the book.
    public double getPrice() {
        return price;
    }

    //Setter to set the price of the books.
    public void setPrice(double price) {
        this.price = price;
    }

    //Getter to get the Quantity of the books in stock.
    public int getQtyInStock() {
        return qtyInStock;
    }

    //Setter for setting the quantity of the books in stock.
    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    @Override
    //Overriding the toString to print the name of book , author information , price and the quantiy of the books.
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", " + author +
                ", price=" + price +
                ", qtyInStock=" + qtyInStock +
                '}';
    }
}