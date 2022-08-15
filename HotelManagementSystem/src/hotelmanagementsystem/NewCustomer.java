package HotelManagementSystem;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
//Class to add Customer
// Impplements action listener

public class NewCustomer extends JFrame implements ActionListener {
    // Initializing the Jtables, JPanel and JButton out the constructor so that they
    // can accessed every where in the class

    JLabel headingLabel, nameLabel, CNICLabel, addressLabel, cityLabet, stateLabel, contactLabel, phoneLabel,
            emailLabel, bookinginfoLabel, checkindateLabel, AmountPaidLabel, nogustLabel, roomLabel, shuttleLabel;

    JTextField NametextField, CNICtextField, addresstextField, citytextField, statetextField, phonetextField,
            emailtextField, checkintextField, AmountPaidtextField, nogusttextField;

    JComboBox shuttlecomboBox;
    JButton submitButton, BackButton;
    Choice roomChoice;

    // Initializing the defualt constructor
    NewCustomer() {
        // Label to display customer message
        headingLabel = new JLabel("New Customer Information");
        headingLabel.setForeground(Color.BLUE);
        headingLabel.setFont(new Font("SERIF", Font.BOLD, 25));
        headingLabel.setBounds(400, 30, 350, 20);
        add(headingLabel);
        // Label to display Name on panel
        nameLabel = new JLabel("Name:");
        nameLabel.setForeground(Color.black);
        nameLabel.setBackground(Color.white);
        nameLabel.setFont(new Font("SERIF", Font.BOLD, 20));
        nameLabel.setBounds(100, 80, 80, 25);
        add(nameLabel);
        // Text field to take customer name in text box
        NametextField = new JTextField();
        NametextField.setBounds(100, 110, 400, 30);
        NametextField.setBackground(Color.white);
        add(NametextField);
        // Label to display CNIC on panel
        CNICLabel = new JLabel("CNIC:");
        CNICLabel.setForeground(Color.black);
        CNICLabel.setBackground(Color.white);
        CNICLabel.setFont(new Font("SERIF", Font.BOLD, 20));
        CNICLabel.setBounds(550, 80, 80, 25);
        add(CNICLabel);
        // Text field to take customer name in text box
        CNICtextField = new JTextField();
        CNICtextField.setBounds(550, 110, 400, 30);
        CNICtextField.setBackground(Color.white);
        add(CNICtextField);
        // Label to display Address on panel
        addressLabel = new JLabel("Address:");
        addressLabel.setForeground(Color.black);
        addressLabel.setBackground(Color.white);
        addressLabel.setFont(new Font("SERIF", Font.BOLD, 20));
        addressLabel.setBounds(100, 170, 80, 25);
        add(addressLabel);
        // Text field to take Address name in text box
        addresstextField = new JTextField();
        addresstextField.setBounds(100, 200, 850, 30);
        addresstextField.setBackground(Color.white);
        add(addresstextField);
        // Text field to take city name in text box
        citytextField = new JTextField();
        citytextField.setBounds(100, 240, 400, 30);
        citytextField.setBackground(Color.white);
        add(citytextField);
        // Label to display City on panel
        cityLabet = new JLabel("City");
        cityLabet.setBackground(Color.white);
        cityLabet.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cityLabet.setBounds(100, 280, 50, 10);
        add(cityLabet);
        // Text field to take state name in text box
        statetextField = new JTextField();
        statetextField.setBounds(550, 240, 400, 30);
        statetextField.setBackground(Color.white);
        add(statetextField);
        // Label to display State on panel
        stateLabel = new JLabel("State");
        stateLabel.setBackground(Color.white);
        stateLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
        stateLabel.setBounds(550, 280, 50, 10);
        add(stateLabel);
        // Label to display State on panel
        contactLabel = new JLabel("Contact Information:");
        contactLabel.setForeground(Color.black);
        contactLabel.setBackground(Color.white);
        contactLabel.setFont(new Font("SERIF", Font.BOLD, 20));
        contactLabel.setBounds(100, 300, 180, 25);
        add(contactLabel);
        // Text field to take phone number in text box
        phonetextField = new JTextField();
        phonetextField.setBounds(100, 330, 400, 30);
        phonetextField.setBackground(Color.white);
        add(phonetextField);
        // Label to display State on panel
        phoneLabel = new JLabel("Phone");
        phoneLabel.setBackground(Color.white);
        phoneLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
        phoneLabel.setBounds(100, 370, 50, 10);
        add(phoneLabel);
        // Text field to take email in text box
        emailtextField = new JTextField();
        emailtextField.setBounds(550, 330, 400, 30);
        emailtextField.setBackground(Color.white);
        add(emailtextField);
        // Label to display Email on panel
        emailLabel = new JLabel("Email");
        emailLabel.setBackground(Color.white);
        emailLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
        emailLabel.setBounds(550, 370, 50, 10);
        add(emailLabel);
        // Label to display Baooking Information on panel
        bookinginfoLabel = new JLabel("Booking Information:");
        bookinginfoLabel.setForeground(Color.black);
        bookinginfoLabel.setBackground(Color.white);
        bookinginfoLabel.setFont(new Font("SERIF", Font.BOLD, 20));
        bookinginfoLabel.setBounds(100, 400, 200, 25);
        add(bookinginfoLabel);
        // Text field to take email in text box
        checkintextField = new JTextField();
        checkintextField.setBounds(100, 440, 400, 30);
        checkintextField.setBackground(Color.white);
        add(checkintextField);
        // Label to display date on panel
        checkindateLabel = new JLabel("Check-in-Date  (DD-MM-YYYY)");
        checkindateLabel.setBackground(Color.white);
        checkindateLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
        checkindateLabel.setBounds(100, 480, 150, 10);
        add(checkindateLabel);

        // Label to take number of guest on panel
        nogusttextField = new JTextField();
        nogusttextField.setBounds(550, 440, 400, 30);
        nogusttextField.setBackground(Color.white);
        add(nogusttextField);
        // Label to display Number of guest on panel
        nogustLabel = new JLabel("Number of Guests in room.");
        nogustLabel.setBackground(Color.white);
        nogustLabel.setFont(new Font("SERIF", Font.BOLD, 20));
        nogustLabel.setBounds(550, 400, 250, 25);
        add(nogustLabel);

        // Text field to take email in text box
        AmountPaidtextField = new JTextField();
        AmountPaidtextField.setBounds(100, 550, 400, 30);
        AmountPaidtextField.setBackground(Color.white);
        add(AmountPaidtextField);
        // Label to display date on panel
        AmountPaidLabel = new JLabel("Amount Paid");
        AmountPaidLabel.setBackground(Color.white);
        AmountPaidLabel.setFont(new Font("SERIF", Font.BOLD, 20));
        AmountPaidLabel.setBounds(100, 510, 150, 20);
        add(AmountPaidLabel);

        // Label to display Room Number on panel
        roomLabel = new JLabel("Room Number:");
        roomLabel.setForeground(Color.black);
        roomLabel.setBackground(Color.white);
        roomLabel.setFont(new Font("SERIF", Font.BOLD, 20));
        roomLabel.setBounds(100, 590, 180, 25);
        add(roomLabel);

        roomChoice = new Choice();

        DatabaseConnection databaseConnection = new DatabaseConnection();// Oonnecting the database
        try {
            ResultSet resultSet = databaseConnection.statement.executeQuery("Select * from room");// Selecting all the
                                                                                                  // data from the room
            while (resultSet.next()) {
                roomChoice.add(resultSet.getString("roomnumber"));
            }
        } catch (Exception e) {

        }
        roomChoice.setBounds(100, 620, 400, 30);
        roomChoice.setBackground(Color.white);
        add(roomChoice);

        // Adjusting all the neccesary labels
        shuttleLabel = new JLabel("Free Shuttle Service:");
        shuttleLabel.setForeground(Color.black);
        shuttleLabel.setBackground(Color.white);
        shuttleLabel.setFont(new Font("SERIF", Font.BOLD, 20));
        shuttleLabel.setBounds(550, 590, 180, 25);
        add(shuttleLabel);

        shuttlecomboBox = new JComboBox(new String[] { "No", "Yes" });
        shuttlecomboBox.setBounds(550, 620, 400, 30);
        shuttlecomboBox.setBackground(Color.white);
        add(shuttlecomboBox);

        submitButton = new JButton("Submit");
        submitButton.setForeground(Color.white);
        submitButton.setBackground(Color.black);
        submitButton.setFont(new Font("SERIF", Font.PLAIN, 25));
        submitButton.addActionListener(this);
        submitButton.setBounds(300, 680, 200, 35);
        add(submitButton);

        BackButton = new JButton("Back");
        BackButton.setForeground(Color.white);
        BackButton.setBackground(Color.black);
        BackButton.setFont(new Font("SERIF", Font.PLAIN, 25));
        BackButton.addActionListener(this);
        BackButton.setBounds(600, 680, 200, 35);
        add(BackButton);

        getContentPane().setBackground(Color.lightGray);
        setBounds(240, 10, 1080, 800);
        setLayout(null);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        // Adding all the user given data in the database
        if (ae.getSource() == submitButton) {
            String name = NametextField.getText();
            String cnic = CNICtextField.getText();
            String address = addresstextField.getText();
            String city = citytextField.getText();
            String state = statetextField.getText();
            String phone = phonetextField.getText();
            String email = emailtextField.getText();
            String checkindate = checkintextField.getText();
            String checkoutdate = AmountPaidLabel.getText();
            String noguests = nogusttextField.getText();
            String roomnumber = roomChoice.getSelectedItem();
            String shuttle = (String) shuttlecomboBox.getSelectedItem();

            DatabaseConnection databaseConnection = new DatabaseConnection();
            String query = "insert into CustomerInfo values('" + name + "','" + cnic + "','" + address + "','" + city
                    + "','" + state + "','" + phone + "','" + email + "','" + checkindate + "','" + checkoutdate + "','"
                    + noguests + "','" + roomnumber + "','" + shuttle + "')";
            try {
                databaseConnection.statement.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Customer info added.");
                new ManagerFrame();
                setVisible(false);

            } catch (Exception e) {

            }

        } else if (ae.getSource() == BackButton) {
            new ManagerFrame();
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {
        new NewCustomer().setVisible(true);

    }

}
