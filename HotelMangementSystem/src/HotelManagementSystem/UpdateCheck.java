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
    private JTextField txtroomNumber;
    private Choice choice;
    private JTextField txtName;
    private JTextField txtCheckedInDate;
    private JTextField txtcheckOutDate;
    private JTextField txtAmount;

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
                choice.add(rs.getString("cnic"));// getting the IDs of the customerinfo
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
        txtroomNumber = new JTextField();
        txtroomNumber.setBounds(248, 126, 140, 20);
        add(txtroomNumber);
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
        txtName = new JTextField();
        txtName.setBounds(248, 171, 140, 20);
        add(txtName);
        txtName.setColumns(10);
        /**
         * Creating text field to take text data on the Jframe
         */
        txtCheckedInDate = new JTextField();
        txtCheckedInDate.setBounds(248, 216, 140, 20);
        add(txtCheckedInDate);
        txtCheckedInDate.setColumns(10);
        /**
         * Creating text field to take text data on the Jframe
         */
        txtcheckOutDate = new JTextField();
        txtcheckOutDate.setBounds(248, 258, 140, 20);
        add(txtcheckOutDate);
        txtcheckOutDate.setColumns(10);
        /**
         * Creating text field to take text data on the Jframe
         */
        txtAmount = new JTextField();
        txtAmount.setBounds(248, 299, 140, 20);
        add(txtAmount);
        txtAmount.setColumns(10);
        /**
         * Creating Three buttons Check out button to Check out Customer ...........
         * Update button to update customer data ...................................
         * Close button to close the current Jframe and open main menu
         */
        btnCheckOut = new JButton("Refresh");
        btnCheckOut.setBounds(50, 385, 100, 25);
        btnCheckOut.setBackground(Color.BLACK);
        btnCheckOut.setForeground(Color.WHITE);
        btnCheckOut.addActionListener(this);
        add(btnCheckOut);

        btnUpdate = new JButton("Check Out");
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
        setBounds(500, 200, 900, 500);
        setLayout(null);
        setVisible(true);

    }


    // Creating override method to add functionality to the buttons
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCheckOut) {// The check out option will check all the customer information

            try {
                DatabaseConnection databaseConnection = new DatabaseConnection();
                String s1 = choice.getSelectedItem();

                //creating and initializing a local variable of class ResultSet.
                ResultSet result_1 = databaseConnection.statement.executeQuery("Select * from customerinfo where cnic='" + s1 + "'");
                //using a while loop to jump from column to column and using next() to jump from row to row.
                while (result_1.next()) {
                    txtroomNumber.setText(result_1.getString("roomnumber"));
                    txtAmount.setText(result_1.getString("amountpaid"));
                    txtCheckedInDate.setText(result_1.getString("checkindate"));
                    txtName.setText(result_1.getString("name"));

                }

                }//end try block.
            catch (Exception ae) {
                System.out.println(ae);
            }//end catch block.


        } else if (e.getSource() == btnUpdate) {// Update button will update the customer data
            try {
                DatabaseConnection databaseConnection = new DatabaseConnection();
                // Getting the data from the text fields
                String s1 = choice.getSelectedItem();
                String s5 = txtcheckOutDate.getText(); // checkoutdate
                String s6 = txtAmount.getText(); //deposit
                // Updating the database according to given data
                databaseConnection.statement.executeUpdate("update customerinfo set checkoutdate = '" + s5 + "', amountpaid = '" + s6 + "' where cnic = '" + s1 + "'");

                JOptionPane.showMessageDialog(null, "Data Updated Successfully");
                // new Reception().setVisible(true);// After that main menu will appear
                setVisible(false);
                new ManagerFrame().setVisible(true);
            } catch (Exception ee) {
                System.out.println(ee);
            }
        } else if (e.getSource() == btnExit) {// Exit button will close the current Jframe
            new ManagerFrame().setVisible(true);
            this.setVisible(false);
        }

    }
}
