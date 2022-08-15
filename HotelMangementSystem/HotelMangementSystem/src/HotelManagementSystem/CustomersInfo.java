package HotelManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import net.proteanit.sql.*;

//Class to display Customer Information
// Impplements action listener
public class CustomersInfo extends JFrame implements ActionListener {
    // Initializing the Jtables, JPanel and JButton out the constructor so that they
    // can accessed every where in the class

    JTable table1;
    JButton button1;
    JLabel headingLabel, fnameLabel, lnameLabel, addressLabel, cityLabel, stateLabel, phoneLabel, emailLabel,
            checkinLabel, amountpaidLabel, noguestsLabel, roomnumberLabel, shuttleLabel;

    // Create the defualt constructor
    CustomersInfo() {
        // Adding all the table
        table1 = new JTable();
        table1.setBackground(Color.lightGray);
        table1.setBounds(0, 120, 1370, 550);
        add(table1);
        // Label to display customer information message
        headingLabel = new JLabel("Customers Information");
        headingLabel.setForeground(Color.BLUE);
        headingLabel.setFont(new Font("SERIF", Font.BOLD, 25));
        headingLabel.setBounds(570, 30, 290, 20);
        add(headingLabel);
        // Label to display Name message
        fnameLabel = new JLabel("Name");
        fnameLabel.setForeground(Color.black);
        fnameLabel.setBackground(Color.white);
        fnameLabel.setFont(new Font("SERIF", Font.BOLD, 15));
        fnameLabel.setBounds(0, 70, 80, 25);
        add(fnameLabel);
        // Label to display CNIC message
        lnameLabel = new JLabel("CNIC");
        lnameLabel.setForeground(Color.black);
        lnameLabel.setBackground(Color.white);
        lnameLabel.setFont(new Font("SERIF", Font.BOLD, 15));
        lnameLabel.setBounds(102, 70, 80, 25);
        add(lnameLabel);
        // Label to display Address message
        addressLabel = new JLabel("Address");
        addressLabel.setForeground(Color.black);
        addressLabel.setBackground(Color.white);
        addressLabel.setFont(new Font("SERIF", Font.BOLD, 15));
        addressLabel.setBounds(208, 70, 80, 25);
        add(addressLabel);
        // Label to display last name
        cityLabel = new JLabel("Last Name");
        cityLabel.setForeground(Color.black);
        cityLabel.setBackground(Color.white);
        cityLabel.setFont(new Font("SERIF", Font.BOLD, 15));
        cityLabel.setBounds(313, 70, 80, 25);
        add(cityLabel);
        // Label to display state
        stateLabel = new JLabel("State");
        stateLabel.setForeground(Color.black);
        stateLabel.setBackground(Color.white);
        stateLabel.setFont(new Font("SERIF", Font.BOLD, 15));
        stateLabel.setBounds(418, 70, 80, 25);
        add(stateLabel);
        // Label to display phone
        phoneLabel = new JLabel("Phone");
        phoneLabel.setForeground(Color.black);
        phoneLabel.setBackground(Color.white);
        phoneLabel.setFont(new Font("SERIF", Font.BOLD, 15));
        phoneLabel.setBounds(522, 70, 80, 25);
        add(phoneLabel);
        // Label to display Email
        emailLabel = new JLabel("Email");
        emailLabel.setForeground(Color.black);
        emailLabel.setBackground(Color.white);
        emailLabel.setFont(new Font("SERIF", Font.BOLD, 15));
        emailLabel.setBounds(627, 70, 80, 25);
        add(emailLabel);
        // Label to display Check in date
        checkinLabel = new JLabel("Check-in-Date");
        checkinLabel.setForeground(Color.black);
        checkinLabel.setBackground(Color.white);
        checkinLabel.setFont(new Font("SERIF", Font.BOLD, 15));
        checkinLabel.setBounds(730, 70, 120, 25);
        add(checkinLabel);
        // Label to display for Amount Paid
        amountpaidLabel = new JLabel("Check out date");
        amountpaidLabel.setForeground(Color.black);
        amountpaidLabel.setBackground(Color.white);
        amountpaidLabel.setFont(new Font("SERIF", Font.BOLD, 15));
        amountpaidLabel.setBounds(840, 70, 120, 25);
        add(amountpaidLabel);
        // Label to display check out date
        amountpaidLabel = new JLabel("Amount Paid");
        amountpaidLabel.setForeground(Color.black);
        amountpaidLabel.setBackground(Color.white);
        amountpaidLabel.setFont(new Font("SERIF", Font.BOLD, 15));
        amountpaidLabel.setBounds(950, 70, 120, 25);
        add(amountpaidLabel);
        // Label to display no of guest
        noguestsLabel = new JLabel("No of Guests");
        noguestsLabel.setForeground(Color.black);
        noguestsLabel.setBackground(Color.white);
        noguestsLabel.setFont(new Font("SERIF", Font.BOLD, 15));
        noguestsLabel.setBounds(1055, 70, 120, 25);
        add(noguestsLabel);
        // Label to display Room type
        roomnumberLabel = new JLabel("Room Type");
        roomnumberLabel.setForeground(Color.black);
        roomnumberLabel.setBackground(Color.white);
        roomnumberLabel.setFont(new Font("SERIF", Font.BOLD, 15));
        roomnumberLabel.setBounds(1160, 70, 120, 25);
        add(roomnumberLabel);
        // Label to display Shuttle Service
        shuttleLabel = new JLabel("Shuttle Service");
        shuttleLabel.setForeground(Color.black);
        shuttleLabel.setBackground(Color.white);
        shuttleLabel.setFont(new Font("SERIF", Font.BOLD, 15));
        shuttleLabel.setBounds(1260, 70, 120, 25);
        add(shuttleLabel);
        // Label to display close
        button1 = new JButton("Close");
        button1.setForeground(Color.white);
        button1.setBackground(Color.black);
        button1.setBounds(600, 700, 120, 25);
        button1.addActionListener(this);
        add(button1);

        DatabaseConnection databaseConnection = new DatabaseConnection();// TO connect the database s

        try {
            ResultSet resultSet = databaseConnection.statement.executeQuery("select * from CustomerInfo");
            table1.setModel(DbUtils.resultSetToTableModel(resultSet));

        } catch (Exception e) {
            e.printStackTrace();

        }

        getContentPane().setBackground(Color.lightGray);
        setBounds(300, 150, 1380, 800);
        setLayout(null);
        setVisible(true);

    }



    @Override
    public void actionPerformed(ActionEvent e) {
        new ManagerFrame();
        this.setVisible(false);
    }
}
