
package HotelManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class ChangeCredentials extends JFrame implements ActionListener{
    JLabel headingLabel;
    JButton Back,admin, Manager;
    public ChangeCredentials(){
        headingLabel = new JLabel("CHANGE CREDENTIALS");
        headingLabel.setForeground(Color.BLUE);
        headingLabel.setFont(new Font("SERIF", Font.BOLD,25));
        headingLabel.setBounds(100,20,350,20);
        add(headingLabel);

        //Button for change credentials of Admin
        admin = new JButton("Change Credentials for Admin");
        admin.setFont(new Font("SERIF",Font.BOLD,15));
        admin.setBackground(Color.BLACK);
        admin.setForeground(Color.WHITE);
        admin.setBounds(30,150,250,30);
        admin.addActionListener(this);
        add(admin);


        //Button for change credentials of Manager
        Manager = new JButton("Change Credentials for Manager");
        Manager.setFont(new Font("SERIF",Font.BOLD,15));
        Manager.setBackground(Color.BLACK);
        Manager.setForeground(Color.WHITE);
        Manager.setBounds(30,220,250,30);
        Manager.addActionListener(this);
        add(Manager);




        //Button for new Back
        Back = new JButton("Back");
        Back.setFont(new Font("SERIF",Font.BOLD,17));
        Back.setBackground(Color.BLACK);
        Back.setForeground(Color.WHITE);
        Back.setBounds(90,350,100,30);
        Back.addActionListener(this);
        add(Back);


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
        if (ae.getSource() ==admin){
            new CredentialsforAdmin().setVisible(true);
            setVisible(false);
        }else if (ae.getSource() == Manager){
            new CredentialsforManager().setVisible(true);
            setVisible(false);
        }else if (ae.getSource() == Back){
            new AdminFrame().setVisible(true);
            setVisible(false);
        }

    }

}
