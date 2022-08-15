
package HotelManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.*;

public class ManagerInfo extends JFrame implements ActionListener{
    //declaring instance variables
    JTable table;
    JButton backButton;
    JLabel headingLabel,name,age,gender,department,salary,phone,cnic,email;

    ManagerInfo(){

        //label for main heading
        headingLabel = new JLabel("ALL Manager DETAILS");
        headingLabel.setForeground(Color.BLUE);
        headingLabel.setFont(new Font("Serif",Font.PLAIN,30));
        headingLabel.setBounds(310,10,400,40);
        add(headingLabel);

        //label for name
        name = new JLabel("Name");
        name.setBounds(40,80,70,20);
        add(name);

        //label for age
        age = new JLabel("Age");
        age.setBounds(170,80,70,20);
        add(age);

        //label for gender
        gender = new JLabel("Gender");
        gender.setBounds(290,80,70,20);
        add(gender);

        //label for department
        department = new JLabel("Qualification");
        department.setBounds(400,80,100,20);
        add(department);

        //label for salary
        salary = new JLabel("Salary");
        salary.setBounds(540,80,70,20);
        add(salary);

        //label for phone
        phone = new JLabel("Phone");
        phone.setBounds(670,80,70,20);
        add(phone);

        //label for cnic
        cnic = new JLabel("CNIC");
        cnic.setBounds(790,80,70,20);
        add(cnic);

        //label for email
        email = new JLabel("Email");
        email.setBounds(910,80,70,20);
        add(email);

        //drawing table to show the details of all employees
        table = new JTable();
        table.setBounds(0,110,1000,400);
        add(table);

        DatabaseConnection databaseConnection = new DatabaseConnection();

        try {
            ResultSet resultSet = databaseConnection.statement.executeQuery("select * from manager");
            table.setModel(DbUtils.resultSetToTableModel(resultSet));

        }catch (Exception e){
            e.printStackTrace();

        }



        //back button to exit the EmployeeInfo frame
        backButton = new JButton("Back");
        backButton.setBounds(450,530,120,30);
        backButton.setForeground(Color.WHITE);
        backButton.setBackground(Color.BLACK);
        backButton.addActionListener(this);
        add(backButton);

        getContentPane().setBackground(Color.WHITE);

        setBounds(500,100,1020,600);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        new AdminFrame();
        this.setVisible(false);
    }



}
