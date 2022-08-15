
package HotelManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class CredentialsforManager extends JFrame implements ActionListener{
    JLabel headingLabel,usernameLabel,password;
    JButton Back,check, update;
    Choice choice;
    JTextField PasswordtextField;
    public CredentialsforManager(){
        headingLabel = new JLabel("Credentials For Manager");
        headingLabel.setForeground(Color.BLUE);
        headingLabel.setFont(new Font("SERIF", Font.BOLD,25));
        headingLabel.setBounds(100,20,350,20);
        add(headingLabel);


        usernameLabel = new JLabel("User Name");
        usernameLabel.setForeground(Color.BLACK);
        usernameLabel.setFont(new Font("SERIF", Font.BOLD,20));
        usernameLabel.setBounds(30,140,200,20);
        add(usernameLabel);

        //initializing the instance variable choice.
        choice = new Choice();
        try {
            //setting up connection with the database by declaring and initializing an object of conn class.
            DatabaseConnection databaseConnection = new DatabaseConnection();
            //creating and initializing a local variable of class ResultSet.
            ResultSet result = databaseConnection.statement.executeQuery("Select * from login");
            //using a while loop to jump from column to column and using next() to jump from row to row.
            while (result.next()) {
                choice.add(result.getString("userid"));

            }//end try block.
        } catch (Exception e) {
            System.out.println(e);
        }//end catch block.
        //setting the location and size of the Choice choice.
        //setting the background of combobox to White.
        choice.setBackground(Color.LIGHT_GRAY);
        choice.setBounds(30, 170, 200, 20);
        //displaying the Choice on the main frame.
        add(choice);

        password = new JLabel("Password");
        password.setForeground(Color.BLACK);
        password.setFont(new Font("SERIF", Font.BOLD,20));
        password.setBounds(30,220,200,20);
        add(password);

        PasswordtextField = new JTextField();
        PasswordtextField.setFont(new Font("SERIF", Font.PLAIN,15));
        PasswordtextField.setBounds(30,250,200,20);
        add(PasswordtextField);


        //Button for new Back
        Back = new JButton("Back");
        Back.setFont(new Font("SERIF",Font.BOLD,17));
        Back.setBackground(Color.BLACK);
        Back.setForeground(Color.WHITE);
        Back.setBounds(50,350,100,30);
        Back.addActionListener(this);
        add(Back);

        //Button for new Back
        check = new JButton("Check");
        check.setFont(new Font("SERIF",Font.BOLD,17));
        check.setBackground(Color.BLACK);
        check.setForeground(Color.WHITE);
        check.setBounds(200,350,100,30);
        check.addActionListener(this);
        add(check);

        //Button for new Back
        update = new JButton("Update");
        update.setFont(new Font("SERIF",Font.BOLD,17));
        update.setBackground(Color.BLACK);
        update.setForeground(Color.WHITE);
        update.setBounds(350,350,100,30);
        update.addActionListener(this);
        add(update);


        //label for Image
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("HotelManagementSystem/Pictures/ChangeCredentials.jpg"));
        JLabel l1 = new JLabel(i1);
        l1.setBounds(230,30,350,350);
        add(l1);

        getContentPane().setBackground(Color.WHITE);
        setBounds(670,200,600,450);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == check) {// The check option will check all the customer information

            try {
                DatabaseConnection databaseConnection = new DatabaseConnection();
                String s1 = choice.getSelectedItem();

                //creating and initializing a local variable of class ResultSet.
                ResultSet result_1 = databaseConnection.statement.executeQuery("Select * from login where userid='" + s1 + "'");
                //using a while loop to jump from column to column and using next() to jump from row to row.
                while (result_1.next()) {
                    PasswordtextField.setText(result_1.getString("password"));

                }

            }//end try block.
            catch (Exception e) {
                System.out.println(ae);
            }//end catch block.


        } else if (ae.getSource() == update) {// Update button will update the customer data
            try {
                DatabaseConnection databaseConnection = new DatabaseConnection();
                // Getting the data from the text fields
                String s1 = choice.getSelectedItem();
                String s2 = PasswordtextField.getText(); // checkoutdate
                // Updating the database according to given data
                databaseConnection.statement.executeUpdate("update login set password = '" + s2 + "'where userid = '" + s1 + "'");

                JOptionPane.showMessageDialog(null, "Data Updated Successfully");
                // new Reception().setVisible(true);// After that main menu will appear
                setVisible(false);
                new AdminFrame().setVisible(true);
            } catch (Exception ee) {
                System.out.println(ee);
            }
        } else if (ae.getSource() == Back) {// Exit button will close the current Jframe
            new ChangeCredentials().setVisible(true);
            this.setVisible(false);
        }

    }
}
