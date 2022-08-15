package HotelManagementSystem;
/**
 * @author Sajeel Hussain
 */

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdateCheck extends JFrame implements ActionListener {
    // Initializing the Jtables, JPanel and JButton out the constructor so that they
    // can accessed every where in the class
    private JButton btnExit;
    private JButton btnUpdate;
    private JButton btnCheckOut;
    private JTextField txt_ID;
    private Choice choice;
    private JTextField txt_Status;
    private JTextField txt_Date;
    private JTextField txt_Time;
    private JTextField txt_Payment;

    // Creating the defualt constructor for the class
    /**
     * Creating the defualt constructor of the class where all GUI mehtods and
     * JPanels, Jtable and JLabel will be implemented And constructor throw SQL
     * Exception
     */
    UpdateCheck() throws SQLException {

        // Creating the JLabels to show the JLabels
        // Which will display different text messages on the screen

        JLabel lblUpdateCheckStatus = new JLabel("Check Status");
        lblUpdateCheckStatus.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblUpdateCheckStatus.setBounds(124, 11, 400, 25);
        add(lblUpdateCheckStatus);

        JLabel lblCustomerID = new JLabel("Customer ID: ");
        lblCustomerID.setBounds(25, 84, 135, 14);
        add(lblCustomerID);

        // This will fetch all the Customer ID available in the database
        choice = new Choice();
        try {
            DatabaseConnection databaseConnection = new DatabaseConnection();// Creating the connection
            ResultSet rs = databaseConnection.statement.executeQuery("select * from Customerinfo");
            while (rs.next()) {
                choice.add(rs.getString("cnic"));// getting the IDs of the customer
            }
        } catch (Exception e) {
        }

        choice.setBounds(248, 84, 140, 20);// Setting the postion of the choice buttons
        add(choice);
        /**
         * Creating labels to display Room Number text on the Jframe
         */
        JLabel lblNewLabel_1 = new JLabel("Room Number :");
        lblNewLabel_1.setBounds(25, 129, 107, 14);
        add(lblNewLabel_1);
        /**
         * Creating text field to take text data on the Jframe
         */
        txt_ID = new JTextField();
        txt_ID.setBounds(248, 126, 140, 20);
        add(txt_ID);
        /**
         * Creating labels to display Name text on the Jframe
         */
        JLabel lblNewLabel_2 = new JLabel("Name : ");
        lblNewLabel_2.setBounds(25, 174, 97, 14);
        add(lblNewLabel_2);
        /**
         * Creating labels to display Checked in text on the Jframe
         */
        JLabel lblNewLabel_3 = new JLabel("Checked-in-Date :");
        lblNewLabel_3.setBounds(25, 216, 107, 14);
        add(lblNewLabel_3);
        /**
         * Creating labels to display Amount Paid text on the Jframe
         */
        JLabel lblNewLabel_4 = new JLabel("Check-out-Date : ");
        lblNewLabel_4.setBounds(25, 261, 107, 14);
        add(lblNewLabel_4);
        /**
         * Creating labels to display Pending amount text on the Jframe
         */
        JLabel lblNewLabel_5 = new JLabel("Amount Paid (Rs) : ");
        lblNewLabel_5.setBounds(25, 302, 150, 14);
        add(lblNewLabel_5);
        /**
         * Creating text field to take text data on the Jframe
         */
        txt_Status = new JTextField();
        txt_Status.setBounds(248, 171, 140, 20);
        add(txt_Status);
        txt_Status.setColumns(10);
        /**
         * Creating text field to take text data on the Jframe
         */
        txt_Date = new JTextField();
        txt_Date.setBounds(248, 216, 140, 20);
        add(txt_Date);
        txt_Date.setColumns(10);
        /**
         * Creating text field to take text data on the Jframe
         */
        txt_Time = new JTextField();
        txt_Time.setBounds(248, 258, 140, 20);
        add(txt_Time);
        txt_Time.setColumns(10);
        /**
         * Creating text field to take text data on the Jframe
         */
        txt_Payment = new JTextField();
        txt_Payment.setBounds(248, 299, 140, 20);
        add(txt_Payment);
        txt_Payment.setColumns(10);
        /**
         * Creating Three buttons Check out button to Check out Customer ...........
         * Update button to update customer data ...................................
         * Close button to close the current Jframe and open main menu
         */
        btnCheckOut = new JButton("Check Out");
        btnCheckOut.setBounds(50, 385, 100, 25);
        btnCheckOut.setBackground(Color.BLACK);
        btnCheckOut.setForeground(Color.WHITE);
        btnCheckOut.addActionListener(this);
        add(btnCheckOut);

        btnUpdate = new JButton("Update");
        btnUpdate.setBounds(350, 385, 100, 25);
        btnUpdate.setBackground(Color.BLACK);
        btnUpdate.setForeground(Color.WHITE);
        btnUpdate.addActionListener(this);
        add(btnUpdate);

        btnExit = new JButton("Back");
        btnExit.setBounds(200, 385, 100, 25);
        btnExit.setBackground(Color.BLACK);
        btnExit.setForeground(Color.WHITE);
        btnExit.addActionListener(this);
        add(btnExit);
        // Creating Image Icon to display on the Jframe
        ImageIcon checkOutImage = new ImageIcon(ClassLoader.getSystemResource("HotelManagementSystem/Pictures/Check.png"));
        JLabel imageLabel = new JLabel(checkOutImage);
        imageLabel.setBounds(500, 60, 300, 300);
        add(imageLabel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Cross button on the right corner will close the application

        // Setting the Position and size of the Jframe
        setBounds(500, 100, 900, 500);
        setLayout(null);
        setVisible(true);

    }

    public static void main(String args[]) throws SQLException {
        new UpdateCheck();
    }

    // Creating override method to add functionality to the buttons
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCheckOut) {// The check out option will check all the customer information
            try {
                String s1 = choice.getSelectedItem();// It will store the user choice
                DatabaseConnection databaseConnection = new DatabaseConnection();
                ResultSet rs1 = databaseConnection.statement.executeQuery("select * from customerinfo where cnic = " + s1);// This query will
                                                                                                // select the specific
                                                                                                // customer from the
                                                                                                // data base

                while (rs1.next()) {// This will get the whole information of the user from the database
                    txt_ID.setText(rs1.getString("roomnumber"));
                    txt_Status.setText(rs1.getString("name"));
                    txt_Date.setText(rs1.getString("status"));
                    txt_Time.setText(rs1.getString("deposit"));
                }
            } catch (Exception ee) {
            }

            try {
                String total = "";
                DatabaseConnection databaseConnection = new DatabaseConnection();// This will create the connection between the database
                ResultSet rs2 = databaseConnection.statement.executeQuery("select * from room where roomnumber = " + txt_ID.getText());
                while (rs2.next()) {
                    total = rs2.getString("price");

                }
                String paid = txt_Time.getText();
                int pending = Integer.parseInt(total) - Integer.parseInt(paid);// This will provide the remaining amount
                                                                               // to be paid from the customer

                txt_Payment.setText(Integer.toString(pending));

            } catch (Exception ee) {
            }

        } else if (e.getSource() == btnUpdate) {// Update button will update the customer data
            try {
                DatabaseConnection databaseConnection = new DatabaseConnection();
                // Getting the data from the text fields
                String s1 = choice.getSelectedItem();
                String s2 = txt_ID.getText(); // room_number;
                String s3 = txt_Status.getText(); // name
                String s4 = txt_Date.getText(); // status;
                String s5 = txt_Time.getText(); // deposit
                // Updating the database according to given data
                databaseConnection.statement.executeUpdate("update customer set room_number = '" + s2 + "', name = '" + s3 + "', status = '" + s4
                        + "', deposit = '" + s5 + "' where number = '" + s1 + "'");

                JOptionPane.showMessageDialog(null, "Data Updated Successfully");
                // new Reception().setVisible(true);// After that main menu will appear
                setVisible(false);
            } catch (Exception ee) {
                System.out.println(ee);
            }
        } else if (e.getSource() == btnExit) {// Exit button will close the current Jframe
            new ManagerFrame().setVisible(true);
            this.setVisible(false);
        }

    }
}
