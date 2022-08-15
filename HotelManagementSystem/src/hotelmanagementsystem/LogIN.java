package HotelManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

// Created a LogIn class to have the login Frame
public class LogIN extends JFrame implements ActionListener {
    JComboBox<String> c1;
    JPasswordField j1;
    JButton b1, b2;
    JTextField t1;


    LogIN() {
        setBounds(630, 200, 700, 600);

        // Adding Image
        ImageIcon image1 = new ImageIcon(ClassLoader.getSystemResource("HotelManagementSystem/Pictures/Login.jpg"));
        JLabel label1 = new JLabel(image1);
        label1.setBounds(0, 0, 700, 550);
        add(label1);

        // Adding ComboBox
        String str[] = {"Login as Admin", "Login as Manager"};
        c1 = new JComboBox<>(str);
        c1.setBounds(200, 225, 300, 35);
        c1.setFont(new Font("serif", Font.BOLD, 20));
        c1.setBackground(Color.white);
        c1.setForeground(Color.black);
        label1.add(c1);

        // Adding a label
        JLabel label2 = new JLabel("Enter Username");
        label2.setBounds(200, 270, 300, 40);
        label2.setFont(new Font("serif", Font.BOLD, 20));
        label1.add(label2);

        // Adding a TextField
        t1 = new JTextField();
        t1.setBounds(200, 305, 300, 35);
        t1.setFont(new Font("serif", Font.PLAIN, 20));
        t1.setBackground(Color.white);
        t1.setForeground(Color.black);
        label1.add(t1);

        // Adding another label
        JLabel label3 = new JLabel("Enter Password");
        label3.setBounds(200, 340, 300, 40);
        label3.setFont(new Font("serif", Font.BOLD, 20));
        label1.add(label3);

        // Adding a password field
        j1 = new JPasswordField();
        j1.setBounds(200, 375, 300, 35);
        j1.setFont(new Font("serif", Font.PLAIN, 20));
        j1.setBackground(Color.white);
        j1.setForeground(Color.black);
        label1.add(j1);

        // Adding the login Button
        b1 = new JButton("Log In");
        b1.setBounds(200, 435, 100, 25);
        b1.setFont(new Font("serif", Font.PLAIN, 15));
        b1.addActionListener(this);
        label1.add(b1);

        //Adding The cancel button
        b2 = new JButton("Cancel");
        b2.setBounds(350, 435, 100, 25);
        b2.setFont(new Font("serif", Font.PLAIN, 15));
        b2.addActionListener(this);
        label1.add(b2);

        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new LogIN(); // Creating the object of LogIn class
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        DatabaseConnection databaseConnection = new DatabaseConnection();
        String query = "select * from adminlogin where userid = '"+t1.getText()+"' and password = '"+j1.getText()+"'";

        String query2 = "select * from login where userid = '"+t1.getText()+"' and password = '"+j1.getText()+"'";
        if(e.getSource()== b1){
            if (c1.getSelectedItem()=="Login as Admin"){


                try{
                    ResultSet resultSet = databaseConnection.statement.executeQuery(query);
                    if (resultSet.next()){
                        new AdminFrame();
                        this.setVisible(false);
                    }else{
                        JOptionPane.showMessageDialog(null,"Invalid username or Password");
                    }


                }catch (Exception e1){

                }
            } else if (c1.getSelectedItem() =="Login as Manager") {
                try {
                    ResultSet resultSet = databaseConnection.statement.executeQuery(query2);
                    if (resultSet.next()){
                        new ManagerFrame();
                        this.setVisible(false);
                    }else {
                        JOptionPane.showMessageDialog(null,"Invalid username or Password");
                    }
                }catch (Exception e1){

                }
            }
        }else if (e.getSource()==b2){
            this.setVisible(false);
        }

    }
}
