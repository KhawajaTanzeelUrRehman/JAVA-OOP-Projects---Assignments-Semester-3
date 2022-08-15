package HotelManagementSystem;
// Import the swing, awt and rxml2 methods
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import net.proteanit.sql.DbUtils;

/**
 * @author Sajeel Hussain
 */
// Creating the class Search Room to create the Search Room frame of the Hostel
// Management Application
public class SearchRoom extends JFrame implements ActionListener {
    // Initializing defualt Jbuttons, Choice and Jtables
    private JButton buttonSearch, buttonExit;
    private JTable table;
    private Choice roomChoice;
    private JCheckBox checkRoom;

    // Create the defualt constructor which throws SQL Exceptions
    SearchRoom() throws SQLException {

        JLabel lblSearchForRoom = new JLabel("Search For Room");// Creating the defualt Label to display Search for Room
        Font font = new Font("Courier", Font.BOLD, 20);// Setting the type of font for the Jlabel
        lblSearchForRoom.setFont(font);
        lblSearchForRoom.setBounds(250, 11, 186, 31);// Setting the x and y coordinates for the JLabel
        add(lblSearchForRoom);// Adding it to the frame

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblRoomAvailable = new JLabel("Room Bed Type:");// Creating the defualt Label to display Room bed type
        lblRoomAvailable.setBounds(50, 73, 96, 14);// Setting the x and y coordinates for the JLabel
        add(lblRoomAvailable);// Adding it to the frame

        buttonSearch = new JButton("Search");// Creating the defualt Button to search the required data base
        buttonSearch.setBounds(200, 500, 120, 30);// Setting the x and y coordinates for the buttons
        buttonSearch.setBackground(Color.BLACK);// Setting the background and fore ground for the buttons
        buttonSearch.setForeground(Color.WHITE);// Setting the fore ground for the button
        add(buttonSearch);// Adding the button to the Frame
        buttonSearch.addActionListener(this);// Attaching the functionality of the button

        buttonExit = new JButton("Exit");// Creating the defualt Exit button to exit the frame
        buttonExit.setBounds(380, 500, 120, 30);// Setting the x and y coordinates and height and width of the button
        buttonExit.setBackground(Color.BLACK);// Setting the background and fore ground for the buttons
        buttonExit.setForeground(Color.WHITE);// Setting the fore ground for the button
        add(buttonExit);// Adding the button to the Frame
        buttonExit.addActionListener(this);// Attaching the functionality of the button

        roomChoice = new Choice();// Creating the choice box for the type of the bed
        roomChoice.add("Single Bed");// Adding the option of the Single Bed
        roomChoice.add("Double Bed");// Adding the option for the double bed
        roomChoice.add("Queen");// Adding the option for the Queen
        roomChoice.add("King");// Adding the option for the King
        roomChoice.add("Suite");// Adding the option for the Suit

        roomChoice.setBounds(153, 70, 120, 20);// Setting the x and y coordinates and height and width of the button
        add(roomChoice);// Adding the button to the Frame

        table = new JTable();// Creating the table for the Jlabel
        table.setBounds(0, 190, 685, 300);// Setting the x and y coordinates and height and width of the button
        add(table);// Adding the button to the Frame

        JLabel lblRoomType = new JLabel("Room Number");// Creating the defualt Label to display Room Number
        lblRoomType.setBounds(23, 162, 96, 14);// Setting the x and y coordinates and height and width for the JLabel
        add(lblRoomType);// Adding it to the frame

        JLabel lblRoomAvailable_1 = new JLabel("Availability");// Creating the defualt Label to display Room Number
        lblRoomAvailable_1.setBounds(175, 162, 120, 14);// Setting the x and y coordinates and width for the JLabel
        add(lblRoomAvailable_1);// Adding it to the frame

        /**
         * Creating different labels to display different messages on the Jframe
         * 
         */
        JLabel lblCleanStatus = new JLabel("Clean Status");
        lblCleanStatus.setBounds(306, 162, 96, 14);
        add(lblCleanStatus);

        JLabel lblPrice_1 = new JLabel("Price");
        lblPrice_1.setBounds(458, 162, 46, 14);
        add(lblPrice_1);

        JLabel l1 = new JLabel("Bed Type");
        l1.setBounds(580, 162, 96, 14);
        add(l1);

        checkRoom = new JCheckBox("Only display Available");// Creating Check Room option to show only display Available
                                                            // check box option
        checkRoom.setBounds(400, 69, 205, 23);
        checkRoom.setBackground(Color.WHITE);
        add(checkRoom);// Adding it tto the frame

        setBounds(650, 150, 700, 600);// Setting the x and y coordinates of the Frame
        setLayout(null);// Setting the defualt layout of the frame to null
        setBackground(Color.BLACK);// Setting the back ground to null
        setVisible(true);// Setting
    }

    // Overriding the action performed method from the interface Aciton listener
    @Override
    public void actionPerformed(ActionEvent e) {
        // if the user selects search button, then following queries of sql will be
        // executed
        if (e.getSource() == buttonSearch) {
            String SQL = "select * from Room where bedtype = '" + roomChoice.getSelectedItem() + "'";
            /**
             * This query will search both available and non available room of both specific
             * type of bed room
             */
            // This query will searh only available room
            String SQL2 = "select * from Room where availability = 'Available' AND bedtype = '"
                    + roomChoice.getSelectedItem() + "'";
            try {
                DatabaseConnection databaseConnection = new DatabaseConnection();// Creating the connection with database
                ResultSet rs;// ResultSet object is a table of data representing a database result
                rs = databaseConnection.statement.executeQuery(SQL);// Shoiwng the data in table form
                table.setModel(DbUtils.resultSetToTableModel(rs));// DBUtils help table to organized precisely
                /**
                 * If available room choice is selected then SQL2 query will be executed
                 */
                if (checkRoom.isSelected()) {
                    rs = databaseConnection.statement.executeQuery(SQL2);
                    table.setModel(DbUtils.resultSetToTableModel(rs));
                }

            } catch (SQLException ss) {
                ss.printStackTrace();
            }

            /**
             * If Exit button is selected then Reception Frame will show up This Jframe will
             * close
             */

        } else if (e.getSource() == buttonExit) {
            new ManagerFrame();
            this.setVisible(false);
        }

    }
}