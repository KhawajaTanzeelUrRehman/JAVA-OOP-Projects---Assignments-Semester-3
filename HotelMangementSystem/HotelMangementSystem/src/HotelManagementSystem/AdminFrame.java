package HotelManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

// Created a class Admin Frame
class AdminFrame extends JFrame implements ActionListener {
    JLabel l1;
    JButton b1, b2, b3, b4, b5, b6, b7, b8;

    // Created a constructor of this class
    AdminFrame() {
        setBounds(0, 0, 1920, 1080);

        // Imported the picture for the frame
        ImageIcon ic = new ImageIcon(ClassLoader.getSystemResource("HotelManagementSystem/Pictures/Admin.jpg"));
        JLabel label1 = new JLabel(ic);
        label1.setBounds(0, 0, 1920, 1080);
        add(label1);

        // Created the Add Employee Button
        b1 = new JButton("Add Employee");
        b1.setBounds(140, 430, 230, 35);
        b1.setFont(new Font("serif", Font.BOLD, 30));
        b1.setForeground(Color.BLACK);
        b1.setBackground(Color.WHITE);
        label1.add(b1);
        b1.addActionListener(this);
        // Created the Employee Info Button
        b2 = new JButton("Employee Info");
        b2.setBounds(570, 430, 220, 35);
        b2.setFont(new Font("serif", Font.BOLD, 30));
        b2.setForeground(Color.BLACK);
        b2.setBackground(Color.WHITE);
        label1.add(b2);
        b2.addActionListener(this);
        // Created the Remove Employee Button
        b3 = new JButton("Remove Employee");
        b3.setBounds(1090, 430, 270, 40);
        b3.setFont(new Font("serif", Font.BOLD, 30));
        b3.setForeground(Color.BLACK);
        b3.setBackground(Color.WHITE);
        label1.add(b3);
        b3.addActionListener(this);

        // Created the Check credentials Button
        b4 = new JButton("Change Credentials");
        b4.setBounds(1560, 430, 300, 35);
        b4.setFont(new Font("serif", Font.BOLD, 30));
        b4.setForeground(Color.BLACK);
        b4.setBackground(Color.WHITE);
        label1.add(b4);
        b4.addActionListener(this);

        // Created the Add Manager Button
        b5 = new JButton("Add Manager");
        b5.setBounds(345, 840, 235, 35);
        b5.setFont(new Font("serif", Font.BOLD, 30));
        b5.setForeground(Color.BLACK);
        b5.setBackground(Color.WHITE);
        label1.add(b5);
        b5.addActionListener(this);

        // Created the Manager Info Button
        b6 = new JButton("Manager Info");
        b6.setBounds(850, 840, 240, 35);
        b6.setFont(new Font("serif", Font.BOLD, 30));
        b6.setForeground(Color.BLACK);
        b6.setBackground(Color.WHITE);
        label1.add(b6);
        b6.addActionListener(this);

        // Created the Remove Manager Button
        b7 = new JButton("Remove Manager");
        b7.setBounds(1350, 840, 260, 35);
        b7.setFont(new Font("serif", Font.BOLD, 30));
        b7.setForeground(Color.BLACK);
        b7.setBackground(Color.WHITE);
        label1.add(b7);
        b7.addActionListener(this);

        // Created the Log Out Button
        b8 = new JButton("Log Out");
        b8.setBounds(1730, 20, 155, 30);
        b8.setFont(new Font("serif", Font.BOLD, 30));
        b8.setForeground(Color.BLACK);
        b8.setBackground(Color.WHITE);
        label1.add(b8);
        b8.addActionListener(this);

        setLayout(null);
        setVisible(true);
    }




    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1){
            new AddEmployee();
            this.setVisible(false);

        } else if (e.getSource() == b2) {
            new EmployeeInfo();
            this.setVisible(false);

        } else if (e.getSource() == b3) {
            new RemoveEmployee();
            this.setVisible(false);

        } else if (e.getSource() == b4) {
            new ChangeCredentials();
            this.setVisible(false);

        }else if (e.getSource() == b5) {
        new NewManager();
        this.setVisible(false);

        } else if (e.getSource() == b6) {
            new ManagerInfo();
            this.setVisible(false);

        } else if (e.getSource() == b7) {
            new RemoveManager();
            this.setVisible(false);


        } else if (e.getSource() == b8) {
            new LogIN();
            this.setVisible(false);

        }

    }
}

