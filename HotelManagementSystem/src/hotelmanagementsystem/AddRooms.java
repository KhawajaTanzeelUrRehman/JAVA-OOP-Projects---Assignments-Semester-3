package HotelManagementSystem;

import java.awt.Color;//importing Color class from awt package.
import javax.swing.*; //importing swing package which contain class JFrame.
import java.awt.Font;//importing class Font from awt package. 
import java.awt.event.*; //importing all the classes of package event.

//creating subclass AddRoom which inherit class JFrame and implements interface ActionListener.
public class AddRooms extends JFrame implements ActionListener {

    //declaring two instance variable of type JTextField.
    JTextField text_1, text_2;

    //declaring three instance variable of type JComb0Box.
    JComboBox cb_1, cb_2, cb_3;

    //declaring five instance variable of type JLabel.
    JLabel jl_1, jl_2, jl_3, jl_4, jl_5;

    //declaring five instance variables of type ImageIcon.
    ImageIcon icon_1, icon_2, icon_3, icon_4, icon_5;

    //declaring two instance variable of type JButton.
    JButton bt_1, bt_2;

    //creating a no-args consstructor.
    //all methods will be called in this constructor.
    AddRooms() {
        //creating a label with name Add Room.
        JLabel l_1 = new JLabel("ADD ROOMS");
        //setting up new font style and font size and making Font Bold.
        l_1.setFont(new Font("serif", Font.BOLD, 40));
        //setting the location and size of the label l1.
        l_1.setBounds(400, 40, 250, 30);
        //displaying the label on the main frame.
        add(l_1);

        //creating a label with name Room Number.
        JLabel room = new JLabel("Room Number");
        //setting up new font style and font size and making Font plain.
        room.setFont(new Font("serif", Font.BOLD, 25));
        //setting the location and size of the label room.
        room.setBounds(60, 110, 200, 25);
        //displaying the label on the main frame.
        add(room);

        //Creating an object of ImageIcon class to store the image file.
        //passing a static method of class ClassLoader to load image into the reference variable icon_1.
        icon_1 = new ImageIcon(ClassLoader.getSystemResource("HotelManagementSystem/Pictures/roomNumber.png"));
        jl_1 = new JLabel(icon_1);
        //setting the location and size of the label jl_1.
        jl_1.setBounds(70, 160, 128, 128);
        //displaying the label on the main frame.
        add(jl_1);

        //initialing the reference variable text_1 of type JTextField.
        text_1 = new JTextField();
        //setting the background of combobox to White.
        text_1.setBackground(Color.LIGHT_GRAY);
        //setting the location and size of the textfield text_1.
        text_1.setBounds(70, 318, 128, 30);
        //displaying the textfield on the main frame.
        add(text_1);

        //creating a label with name Cleaning Status.
        JLabel status = new JLabel("Cleaning Status");
        //setting up new font style and font size and making Font plain.
        status.setFont(new Font("serif", Font.BOLD, 25));
        //setting the location and size of the label status.
        status.setBounds(250, 110, 200, 30);
        //displaying the label on the main frame.
        add(status);

        //Creating an object of ImageIcon class to store the image file.
        //passing a static method of class ClassLoader to load image into the reference variable icon_2.
        icon_2 = new ImageIcon(ClassLoader.getSystemResource("HotelManagementSystem/Pictures/cleaningStatus.png"));

        jl_2 = new JLabel(icon_2);
        //setting the location and size of the label jl_2.
        jl_2.setBounds(270, 160, 128, 128);
        //displaying the label on the main frame.
        add(jl_2);

        //initializing the reference variable of type JComboBox.
        //passing Array of type String as an argument.
        cb_2 = new JComboBox(new String[]{"Clean", "Dirty"});
        //setting the location and size of the combobox cb_2.
        cb_2.setBounds(270, 318, 128, 30);
        //displaying the label on the main frame.
        add(cb_2);

        //setting the background of combobox to White.
        cb_2.setBackground(Color.LIGHT_GRAY);

        //creating a label with name Available.
        JLabel available = new JLabel("Available");
        //setting up new font style and font size and making Font plain.
        available.setFont(new Font("serif", Font.BOLD, 25));
        //setting the location and size of the label available.
        available.setBounds(480, 110, 200, 25);
        //displaying the label on the main frame.
        add(available);

        //Creating an object of ImageIcon class to store the image file.
        //passing a static method of class ClassLoader to load image into the reference variable icon_3.
        icon_3 = new ImageIcon(ClassLoader.getSystemResource("HotelManagementSystem/Pictures/availability.png"));

        jl_3 = new JLabel(icon_3);
        //setting the location and size of the label jl_3.
        jl_3.setBounds(470, 160, 128, 128);
        //displaying the label on the main frame.
        add(jl_3);

        //initializing the reference variable of type JComboBox.
        //passing Array of type String as an argument.
        cb_1 = new JComboBox(new String[]{"Available", "Ocuppied"});
        //setting the location and size of the combobox cb_1.
        cb_1.setBounds(470, 318, 128, 30);
        //displaying the label on the main frame.
        add(cb_1);
        //setting the background of combobox to White.
        cb_1.setBackground(Color.LIGHT_GRAY);

        //creating a label with name Price.
        JLabel price = new JLabel("Price");
        //setting up new font style and font size and making Font plain.
        price.setFont(new Font("serif", Font.BOLD, 25));
        //setting the location and size of the label available.
        price.setBounds(700, 110, 200, 25);
        //displaying the label on the main frame.
        add(price);

        //Creating an object of ImageIcon class to store the image file.
        //passing a static method of class ClassLoader to load image into the reference variable icon_4.
        icon_4 = new ImageIcon(ClassLoader.getSystemResource("HotelManagementSystem/Pictures/price.png"));

        jl_4 = new JLabel(icon_4);
        //setting the location and size of the label jl_4.
        jl_4.setBounds(670, 160, 128, 128);
        //displaying the label on the main frame.
        add(jl_4);

        //initialing the reference variable text2 of type JTextField.
        text_2 = new JTextField();
        //setting the location and size of the textfield text_2.
        text_2.setBounds(670, 318, 128, 30);
        //setting the background of combobox to White.
        text_2.setBackground(Color.LIGHT_GRAY);

        //displaying the textfield on the main frame.
        add(text_2);

        //creating a label with name Bed Type.
        JLabel bedType = new JLabel("Bed Type");
        //setting up new font style and font size and making Font plain.
        bedType.setFont(new Font("serif", Font.BOLD, 25));
        //setting the location and size of the label bedType.
        bedType.setBounds(880, 110, 200, 30);
        //displaying the label on the main frame.
        add(bedType);

        //Creating an object of ImageIcon class to store the image file.
        //passing a static method of class ClassLoader to load image into the reference variable icon_5.
        icon_5 = new ImageIcon(ClassLoader.getSystemResource("HotelManagementSystem/Pictures/bed.png"));

        jl_5 = new JLabel(icon_5);
        //setting the location and size of the label jl_5.
        jl_5.setBounds(870, 160, 128, 128);
        //displaying the label on the main frame.
        add(jl_5);

        //initializing the reference variable of type JComboBox.
        //passing Array of type String as an argument.
        cb_3 = new JComboBox(new String[]{"Single Bed","Double Bed","Queen","King","Suite"});
        //setting the location and size of the combobox cb_3.
        cb_3.setBounds(870, 318, 128, 30);
        //displaying the label on the main frame.
        add(cb_3);
        //setting the background of combobox to White.
        cb_3.setBackground(Color.LIGHT_GRAY);

        //initializing the reference variable of type JButton.
        bt_1 = new JButton("Add Room");
        //setting the location and size of the button bt_1.
        bt_1.setBounds(390, 400, 130, 40);

        //setting the background of button to Black.
        bt_1.setBackground(Color.BLACK);
        //setting the text color to White.
        bt_1.setForeground(Color.WHITE);
        //adding action to the button.
        bt_1.addActionListener(this);
        //displaying the label on the main frame.
        add(bt_1);

        //initializing the reference variable of type JButton.
        bt_2 = new JButton("Cancel");
        //setting the location and size of the button bt_2.
        bt_2.setBounds(550, 400, 130, 40);

        //setting the background of button to Black.
        bt_2.setBackground(Color.BLACK);
        //setting the text color to White.
        bt_2.setForeground(Color.WHITE);
        //adding action to the button.
        bt_2.addActionListener(this);
        //displaying the label on the main frame.
        add(bt_2);

        //setting the main Frame color to Gray.
        getContentPane().setBackground(Color.GRAY);

        //creating a frame using setBounds which accepts four arguments.
        //first two arguments specify the location of frame and the second two arguments specify the size of frame.
        setBounds(500, 200, 1080, 520);

        //setting up the Title of main frame.
        setTitle("ADD ROOMS");

        //to place the frame manually onto the screen.
        setLayout(null);

        //displaying the frame onto the screen.
        setVisible(true);

    }//end no args constructor.

    //defining the method body of abstract method actionPerformed defined in ActionListener interface.
    public void actionPerformed(ActionEvent action) {
        //using if statement to check which button is being pressed.
        //if add room button is being pressed then storing the data of the room in database.
        if (action.getSource() == bt_1) {
            //creating local variable of type String to store values entered in text fields and combo box.
            //String variables will be used to store values in DataBase.
            String room = text_1.getText();
            String available = (String) cb_1.getSelectedItem();//downcasting the value retrieved Object to type String.
            String status = (String) cb_2.getSelectedItem();//downcasting the value retrieved Object to type String.
            String price = text_2.getText();
            String type = (String) cb_3.getSelectedItem();//downcasting the value retrieved Object to type String.        

            //creating an object of class conn to setup connection with the database.
            DatabaseConnection databaseConnection = new DatabaseConnection();
            //using error handling.
            try {
                //storing query of SQL in variable of type String.
                String query = "insert into room values('" + room + "','" + available + "','" + status + "','" + price + "','" + type + "')";
                databaseConnection.statement.executeUpdate(query);

                JOptionPane.showMessageDialog(null, "New Room Added");
                //to close the main frame.
                new ManagerFrame();
                this.setVisible(false);

            }//end try block.
            catch (Exception e) {
                System.out.println(e);
            }//end catch block.
        }//end if block.
        else if (action.getSource() == bt_2) {
            //closing the frame when cancel button is being pressed
            new ManagerFrame();
            this.setVisible(false);
        }//end else if block.

    }//end method actionPerformed.

    //creating a main method for the execution of the class.
    public static void main(String[] args) {
        new AddRooms();
    }//end method main
}//end class AddRooms.
