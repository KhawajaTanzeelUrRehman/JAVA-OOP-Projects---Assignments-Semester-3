//Creating the Author class according to the given UML.
public class Author {
    //Instance variable for storing the name of the author.
    private String name;
    //Instance variable for storing the email of the author.
    private String email;
    //Instance variable for storing the gender of the author.
    private char gender;

    //Constructor which do not accept the parameters.
    Author() {

    }

    //Constructor which accept three parameters.
    Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    //Getter for getting the name of the authors.
    public String getName() {
        return name;
    }

    //Getting to get the email address of the authors.
    public String getEmail() {
        return email;
    }

    //Getter to get gender of the authors.
    public char getGender() {
        return gender;
    }


    //Setter to set the name of the author.
    public void setName(String name) {
        this.name = name;
    }

    //Setter to set the email of the author.
    public void setEmail(String email) {
        this.email = email;
    }

    //Setter to set the gender of the author.
    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    //Overriding the toString method to show the name , email and gender of the author.
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}
