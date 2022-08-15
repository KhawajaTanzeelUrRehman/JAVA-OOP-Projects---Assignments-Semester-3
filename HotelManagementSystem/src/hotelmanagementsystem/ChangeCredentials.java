
package HotelManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChangeCredentials extends JFrame{
    JComboBox choices;
    JLabel headingLabel,selection,newName, newPassword;
    JTextField nameField, passwordField;
    JButton enterButton;
    public ChangeCredentials(){
        headingLabel = new JLabel("CHANGE CREDENTIALS");
        headingLabel.setForeground(Color.BLUE);
        headingLabel.setFont(new Font("SERIF", Font.BOLD,25));
        headingLabel.setBounds(100,20,350,20);
        add(headingLabel);

        //label for selection
        selection = new JLabel("SELECTION:");
        selection.setFont(new Font("SERIF",Font.BOLD,15));
        selection.setBounds(50,70,150,30);
        add(selection);
        choices = new JComboBox();
        choices.setBounds(50,100,150,30);
        choices.setBackground(Color.WHITE);
        add(choices);


        //label for new NAME
        newName = new JLabel("NEW USERNAME:");
        newName.setFont(new Font("SERIF",Font.BOLD,15));
        newName.setBounds(50,140,150,30);
        add(newName);
        nameField = new JTextField();
        nameField.setBounds(50,180,150,30);
        add(nameField);
        
        //label for new PASSWORD
        newPassword = new JLabel("NEW PASSWORD:");
        newPassword.setFont(new Font("SERIF",Font.BOLD,15));
        newPassword.setBounds(50,220,150,30);
        add(newPassword);
        passwordField = new JTextField();
        passwordField.setBounds(50,260,150,30);
        add(passwordField);
        

        //Button for new Enter.
        enterButton = new JButton("Enter");
        enterButton.setForeground(Color.white);
        enterButton.setBackground(Color.black);
        enterButton.setFont(new Font("SERIF",Font.BOLD,15));
        enterButton.setBounds(80,330,90,30);
        add(enterButton);




        //label for Image
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("HotelManagementSystem/Pictures/ChangeCredentials.jpg"));
        JLabel l1 = new JLabel(i1);
        l1.setBounds(230,30,350,350);
        add(l1);
        
        getContentPane().setBackground(Color.WHITE);
        setBounds(480,150,600,450);
        setLayout(null);
        setVisible(true);
    }
        
    public static void main(String [] args){
        new ChangeCredentials().setVisible(true);
    }
}
