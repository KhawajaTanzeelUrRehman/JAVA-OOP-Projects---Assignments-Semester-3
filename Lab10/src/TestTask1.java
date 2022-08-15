//Creating a TestClass for checking the functionality of the Book class.
public class TestTask1 {
    //Main method for the execution of the program.
    public static void main(String[] args) {
        //Creating an author by passing values as the parameter.
        Author author1 = new Author("Iqbal", "iqbal@gmail.com", 'M');
        //Creating an author by using the constructor which accept the parameters.
        Author author2 = new Author("Malala Yousafzai", "malala@gmail.com", 'F');
        //Creating an author by using the non-parameterized constructor.
        Author author3 = new Author();
        //Just printing the heading to the console.
        System.out.println("Initial DATA OF AUTHORS\n");
        //Printing the information of the author on the console.
        System.out.println(author1);
        System.out.println(author2);
        System.out.println(author3);

        //Setting the name of the author3.
        author3.setName("Fatima Bhutto");
        //Setting the email address of the author3.
        author3.setEmail("Fatima@gmail.com");
        //Setting the gender of the author3.
        author3.setGender('F');
        //Just printing the heading on the console.
        System.out.println("\n\nUPDATED DATA OF AUTHORS");
        //Again printing the updated data of the authors to the console.
        System.out.println(author1);
        System.out.println(author2);
        System.out.println(author3);

        //Creating a book object by using the constructor which accept 3 parameters.
        Book book1 = new Book("The Secrets of the self", author1, 499.49);
        //Creating a book object by using the constructor which accept 4 parameters.
        Book book2 = new Book("We are Displaced", author2, 1299.49, 10);
        //Creating a book object by using the constructor which accept 4 parameters.
        Book book3 = new Book("New Kings of the World", author3, 1499, 30);
        //Just printing heading on the console.
        System.out.println("\n\nINITIAL DATA OF BOOKS");
        //Printing the values of book using the overridden toString method.
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        //Setting the quantity of book 1 in stock.
        book1.setQtyInStock(40);
        //Setting the price of the book1.
        book1.setPrice(300);
        book2.setQtyInStock(15);
        //Setting the price of book2.
        book2.setPrice(1199.99);
        //Setting the quantity of book3.
        book3.setQtyInStock(25);
        //Just printing the heading on the console.
        System.out.println("\n\nUPDATED DATA OF BOOKS");
        //printing the updated values of the books.
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    }

}
