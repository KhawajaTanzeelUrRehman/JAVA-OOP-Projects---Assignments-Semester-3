package HotelManagementSystem;

import java.awt.*;//importing awt package.
import javax.swing.*; //importing swing package which contain class JFrame.
import java.sql.ResultSet;//importing ResultSet class from sql package.
import java.awt.event.*; //importing all the classes of package event.

//inheriting JFrame class from swing package and implementing Interface ActionListener.
public class UpdateRoomStatus extends JFrame implements ActionListener {

    //declaring three instance variable of type JTextField.
    JTextField text_1, text_2, text_3;
    
    //declaring five instance variable of type JLabel.
    JLabel jl_1, jl_2, jl_3, jl_4;
    
    //declaring five instance variables of type ImageIcon.
    ImageIcon icon_1, icon_2, icon_3, icon_4;


    //declaring three instance variable of type JButton.
    JButton bt_1, bt_2, bt_3;

    //creating an instance variable of type Choice.
    Choice choice;

    //creating a no args constructor.
    UpdateRoomStatus() {

        //creating a label with name Update Room Status.
        JLabel updateRoom = new JLabel("UPDATE ROOM STATUS");
        //setting up new font style and font size and making Font Bold.
        updateRoom.setFont(new Font("serif", Font.BOLD, 40));
        //setting the location and size of the label updateRoom.
        updateRoom.setBounds(236, 20, 500, 30);
        //displaying the label on the main frame.
        add(updateRoom);

        //creating a label with name Guest ID.
        JLabel guest = new JLabel("Guest ID");
        //setting up new font style and font size and making Font plain.
        guest.setFont(new Font("serif", Font.BOLD, 25));
        //setting the location and size of the label guest.
        guest.setBounds(99, 110, 110, 25);
        //displaying the label on the main frame.
        add(guest);
        
        //Creating an object of ImageIcon class to store the image file.
        //passing a static method of class ClassLoader to load image into the reference variable icon_1.
        icon_1 = new ImageIcon(ClassLoader.getSystemResource("HotelManagementSystem/Pictures/guestID.png"));
        jl_1 = new JLabel(icon_1);
        //setting the location and size of the label jl_1.
        jl_1.setBounds(90, 160, 128, 128);
        //displaying the label on the main frame.
        add(jl_1);

        //initializing the instance variable choice.
        choice = new Choice();
        try {
            //setting up connection with the database by declaring and initializing an object of conn class.
            DatabaseConnection databaseConnection = new DatabaseConnection();
            //creating and initializing a local variable of class ResultSet.
            ResultSet result = databaseConnection.statement.executeQuery("Select * from customerinfo");
            //using a while loop to jump from column to column and using next() to jump from row to row.
            while (result.next()) {
                choice.add(result.getString("cnic"));

            }//end try block.
        } catch (Exception e) {
            System.out.println(e);
        }//end catch block.
        //setting the location and size of the Choice choice.
        //setting the background of combobox to White.
        choice.setBackground(Color.LIGHT_GRAY);
        choice.setBounds(90, 318, 128, 30);
        //displaying the Choice on the main frame.
        add(choice);

        //creating a label with name Room Number.
        JLabel room = new JLabel("Room Number");
        //setting up new font style and font size and making Font plain.
        room.setFont(new Font("serif", Font.BOLD, 25));
        //setting the location and size of the label jl_1.
        room.setBounds(294, 110, 170, 25);
        //displaying the label on the main frame.
        add(room);
        
        //Creating an object of ImageIcon class to store the image file.
        //passing a static method of class ClassLoader to load image into the reference variable icon_2.
        icon_2 = new ImageIcon(ClassLoader.getSystemResource("HotelManagementSystem/Pictures/roomNumber.png"));

        jl_2 = new JLabel(icon_2);
        //setting the location and size of the label jl_2.
        jl_2.setBounds(308, 160, 128, 128);
        //displaying the label on the main frame.
        add(jl_2);

        //initialing the reference variable text_1 of type JTextField.
        text_1 = new JTextField();
        //setting the background of combobox to White.
        text_1.setBackground(Color.LIGHT_GRAY);
        //setting the location and size of the textfield text_1.
        text_1.setBounds(308, 318, 128, 30);
        //displaying the textfield on the main frame.
        add(text_1);

        //creating a label with name Availability.
        JLabel availibility = new JLabel("Availibility");
        //setting up new font style and font size and making Font plain.
        availibility.setFont(new Font("serif", Font.BOLD, 25));
        //setting the location and size of the label availibility.
        availibility.setBounds(530, 110, 200, 30);
        //displaying the label on the main frame.
        add(availibility);
        //Creating an object of ImageIcon class to store the image file.
        //passing a static method of class ClassLoader to load image into the reference variable icon_3.
        icon_3 = new ImageIcon(ClassLoader.getSystemResource("HotelManagementSystem/Pictures/availability.png"));

        jl_3 = new JLabel(icon_3);
        //setting the location and size of the label jl_3.
        jl_3.setBounds(526, 160, 128, 128);
        //displaying the label on the main frame.
        add(jl_3);

        //initialing the reference variable text_2 of type JTextField.
        text_2 = new JTextField();
        //setting the background of combobox to White.
        text_2.setBackground(Color.LIGHT_GRAY);
        //setting the location and size of the textfield text_2.
        text_2.setBounds(526, 318, 128, 30);
        //displaying the textfield on the main frame.
        add(text_2);

        //creating a label with name Cleaning Status.
        JLabel cleaning = new JLabel("Cleaning Status");
        //setting up new font style and font size and making Font plain.
        cleaning.setFont(new Font("serif", Font.BOLD, 25));
        //setting the location and size of the label cleaning.
        cleaning.setBounds(720, 110, 200, 30);
        //displaying the label on the main frame.
        add(cleaning);
        //Creating an object of ImageIcon class to store the image file.
        //passing a static method of class ClassLoader to load image into the reference variable icon_4.
        icon_4 = new ImageIcon(ClassLoader.getSystemResource("HotelManagementSystem/Pictures/cleaningStatus.png"));

        jl_4 = new JLabel(icon_4);
        //setting the location and size of the label jl_4.
        jl_4.setBounds(744, 170, 128, 128);
        //displaying the label on the main frame.
        add(jl_4);

        //initialing the reference variable text_3 of type JTextField.
        text_3 = new JTextField();
        //setting the background of combobox to White.
        text_3.setBackground(Color.LIGHT_GRAY);
        //setting the location and size of the textfield text_3.
        text_3.setBounds(744, 318, 128, 30);

        //displaying the textfield on the main frame.
        add(text_3);

        //initializing the reference variable of type JButton.
        bt_1 = new JButton("Check");
        //setting the location and size of the button bt_1.
        bt_1.setBounds(220,400, 130, 40);
        //setting the background of button to Black.
        bt_1.setBackground(Color.BLACK);
        //setting the text color to White.
        bt_1.setForeground(Color.WHITE);
        //adding action to the button.
        bt_1.addActionListener(this);
        //displaying the label on the main frame.
        add(bt_1);

        //initializing the reference variable of type JButton.
        bt_2 = new JButton("Update");
        //setting the location and size of the button bt_1.
        bt_2.setBounds(411, 400, 130, 40);
        //setting the background of button to Black.
        bt_2.setBackground(Color.BLACK);
        //setting the text color to White.
        bt_2.setForeground(Color.WHITE);
        //adding action to the button.
        bt_2.addActionListener(this);
        //displaying the label on the main frame.
        add(bt_2);

        //initializing the reference variable of type JButton.
        bt_3 = new JButton("Back");
        //setting the location and size of the button bt_1.
        bt_3.setBounds(602, 400, 130, 40);
        //setting the background of button to Black.
        bt_3.setBackground(Color.BLACK);
        //setting the text color to White.
        bt_3.setForeground(Color.WHITE);
        //adding action to the button.
        bt_3.addActionListener(this);
        //displaying the label on the main frame.
        add(bt_3);

        //setting the main Frame color to Gray.
        getContentPane().setBackground(Color.GRAY);

        //creating a frame using setBounds which accepts four arguments.
        //first two arguments specify the location of frame and the second two arguments specify the size of frame.
        setBounds(500, 200, 972, 520);
        //setting up the Title of main frame.
        setTitle("UPDATE ROOM STATUS");


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
            //setting up connection with the database by declaring and initializing an object of conn class.
            DatabaseConnection databaseConnection = new DatabaseConnection();
            //declaring and initializing a local varaible of type string to get text from choice.
            String str_1 = choice.getSelectedItem();
            //declaring and initializing a local varaible of type string to null.
            String room = null;

            try {

                //creating and initializing a local variable of class ResultSet.
                ResultSet result_1 = databaseConnection.statement.executeQuery("Select * from customerinfo where cnic='" + str_1 + "'");
                //using a while loop to jump from column to column and using next() to jump from row to row.
                while (result_1.next()) {
                    text_1.setText(result_1.getString("roomnumber"));
                    room = result_1.getString("roomnumber");
                }//end while loop.
                //creating and initializing a local variable of class ResultSet.
                ResultSet result_2 = databaseConnection.statement.executeQuery("Select * from room where roomnumber='" + room + "'");
                while (result_2.next()) {
                    text_2.setText(result_2.getString("Availability"));
                    text_3.setText(result_2.getString("cleanstatus"));
                }
            }//end try block.
            catch (Exception e) {
                System.out.println(e);
            }//end catch block.

        } else if (action.getSource() == bt_2) {
            try {
                //setting up connection with the database by declaring and initializing an object of conn class.
                DatabaseConnection con = new DatabaseConnection();
                //declaring and initializing variables of Type string to get text from the textfields.
                String room = text_1.getText();
                String available = text_2.getText();
                String status = text_3.getText();
                //declaring and initializing variables of Type string to store mysql command.
                String str = "update room set Availability = '" + available + "' , cleanstatus = '" + status + "' where roomnumber = '"+room+"'";
                con.statement.executeUpdate(str);
                //displaying a dialog box.
                JOptionPane.showMessageDialog(null, "Room Updated Successfully");
                //displaying the frame of Reception class.
                new ManagerFrame();
                //closing the frame when cancel button is being pressed.
                this.setVisible(false);

            }//end try block.
            catch (Exception e) {
                System.out.println(e);

            }//end catch block.

        }//end else if block.
        else if (action.getSource() == bt_3) {
            //displaying the frame of Reception class.
            new ManagerFrame();
            //closing the frame when cancel button is being pressed.
            this.setVisible(false);

        }//end else if block.
    }//end method actionPerformed.

    //creating a main method for the execution of the class.
    public static void main(String[] args) {
        new UpdateRoomStatus().setVisible(true);
    }//end method main.

}//end class UpdateRoomStatus.
