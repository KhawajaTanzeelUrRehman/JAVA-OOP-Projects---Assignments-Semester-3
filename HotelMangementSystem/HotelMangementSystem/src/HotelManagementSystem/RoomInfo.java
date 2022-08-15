package HotelManagementSystem;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;

/**
 * @author Sajeel Hussain
 */
// Creating the class Room Information class to Search Room information and to
// create frame of the Hostel Management Application and it implements the
// mehtod of the Action Listener Interface
public class RoomInfo extends JFrame implements ActionListener {
    // Initializing the Jtables, JPanel and JButton out the constructor so that they
    // can accessed every where in the class

    private JButton button1, button2;
    private JTable table;
    private JLabel lblAvailability;
    private JLabel lblCleanStatus;
    private JLabel lblNewLabel;
    private JLabel lblNewLabel_1;
    private JLabel lblId;
    private JPanel contentPane;

    // Creating the defualt constructor for the class
    /**
     * Creating the defualt constructor of the class where all GUI mehtods and
     * JPanels, Jtable and JLabel will be implemented
     *
     */
    RoomInfo() {

        // Creating Jpanel in which an we can attach any other component of the class
        contentPane = new JPanel();//
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));// setting the border empty
        setContentPane(contentPane); // setContentPane() method allows you to replace the content panel of the JFrame
        contentPane.setLayout(null);// Setting the defualt layout of the content pane to null

        setBounds(450, 200, 1100, 600);// Setting the defualt loction and size of the Jframe
        setLayout(null);// Setting the defualt Jframe layout to null
        setResizable(false);// This frame will not be able to resize

        ImageIcon image = new ImageIcon(ClassLoader.getSystemResource("HotelManagementSystem/Pictures/RoomIcon.jpg"));// Setting the Image Icon on the Tab
        setIconImage(image.getImage());
        setTitle("Room Information");// Setting the title of Class
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// The program will terminate by select close button on top right
                                                       // corner
        getContentPane().setBackground(Color.WHITE);// Setting the back ground of content pane to white

        ImageIcon image1 = new ImageIcon(ClassLoader.getSystemResource("HotelManagementSystem/Pictures/Room.jpg"));// Creating Image Icon to get the image from the defualt of
                                                           // the path
        JLabel icon = new JLabel(image1);// Creating the Icon of the image
        icon.setBounds(520, 40, 550, 400);// Setting the location of the icon
        add(icon);// Addint the Icon to the defualt JFrame
        /**
         * Creating Two buttons 1st button to Load Room Information 2nd button to close
         * the Room info frame
         */
        button1 = new JButton("Load Room Information");
        button1.setBounds(50, 460, 200, 30);
        add(button1);
        button1.addActionListener(this);// Adding the funcionality to Load data button

        button2 = new JButton("Return to main menu");
        button2.setBounds(280, 460, 200, 30);
        add(button2);
        button2.addActionListener(this);// Adding the funcionality to Load data button

        table = new JTable();// Creating a table to show the data on the Jframe
        table.setBounds(0, 40, 500, 400);
        add(table);
        setVisible(true); // Setting the visiblity of the button to true

        // Creating the JLabels to show the JLabels
        // Which will display different text messages on the screen

        lblAvailability = new JLabel("Availability");
        lblAvailability.setBounds(119, 15, 69, 14);
        contentPane.add(lblAvailability);

        lblCleanStatus = new JLabel("Clean Status");
        lblCleanStatus.setBounds(216, 15, 76, 14);
        contentPane.add(lblCleanStatus);

        lblNewLabel = new JLabel("Price");
        lblNewLabel.setBounds(330, 15, 46, 14);
        contentPane.add(lblNewLabel);

        lblNewLabel_1 = new JLabel("Bed Type");
        lblNewLabel_1.setBounds(417, 15, 76, 14);
        contentPane.add(lblNewLabel_1);

        lblId = new JLabel("Room Number");
        lblId.setBounds(12, 15, 90, 14);
        contentPane.add(lblId);

    }// Constructor ends here
     // Overriding the actionPerformed method in the ActionListener interface

    @Override
    public void actionPerformed(ActionEvent action) {
        // If the user selects the Load button then following code will execute
        if (action.getSource() == button1) {
            try {
                DatabaseConnection databaseConnection = new DatabaseConnection();// Creating the connection
                String query = "select * from room";// Selecting all the Room available in the database
                ResultSet resultSet = databaseConnection.statement.executeQuery(query);// Executing the query
                table.setModel(DbUtils.resultSetToTableModel(resultSet));// Data will be shown in the table and UButils will
                                                                  // organize the Table

            } catch (Exception e) {
                e.printStackTrace();
            }
            // Else the Jframe will stop and main screen will be set visible
        } else if (action.getSource() == button2) {
             new ManagerFrame();
            this.setVisible(false);

        }
    }
}
