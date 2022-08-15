package HotelManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class AddEmployee extends JFrame implements ActionListener{
    JLabel headingLabel,nameLabel, ageLabel,genderLabel,jobLabel,salaryLabel,phoneLabel,cnicLabel,emailLabel;
    JTextField nameField, ageField, salaryField, phoneField, cnicField, emailField;
    JComboBox gender,jobMenu;
    JButton b1,b2;
    
    public AddEmployee(){
        //label for main heading
        headingLabel = new JLabel("ADD EMPLOYEE DETAILS");
        headingLabel.setForeground(Color.BLUE);
        headingLabel.setFont(new Font("SERIF", Font.BOLD,25));
        headingLabel.setBounds(350,20,350,30);
        add(headingLabel);
        
        //label for NAME
        nameLabel = new JLabel("NAME:");
        nameLabel.setFont(new Font("Tahoma",Font.PLAIN,17));
        nameLabel.setBounds(50,70,120,30);
        add(nameLabel);
        nameField = new JTextField();
        nameField.setBounds(50,100,150,30);
        add(nameField);
        
        //label for AGE
        ageLabel = new JLabel("AGE:");
        ageLabel.setFont(new Font("Tahoma",Font.PLAIN,17));
        ageLabel.setBounds(400,70,120,30);
        add(ageLabel);
        ageField = new JTextField();
        ageField.setBounds(400,100,150,30);
        add(ageField);
        
        //label for GENDER
        genderLabel = new JLabel("GENDER:");
        genderLabel.setFont(new Font("Tahoma",Font.PLAIN,17));
        genderLabel.setBounds(50,180,120,30);
        add(genderLabel);
        String genderStr [] = {"Male","Female","Other"};
        gender = new JComboBox(genderStr);
        gender.setBounds(50,210,70,30);
        gender.setBackground(Color.WHITE);
        add(gender);
        
        
        //label for JOB
        jobLabel = new JLabel("JOB:");
        jobLabel.setFont(new Font("Tahoma",Font.PLAIN,17));
        jobLabel.setBounds(400,180,120,30);
        add(jobLabel);
       
        String str[] = {"Front Desk Clerks","Porters","Housekeeping","Kitchen Staff","Room Service","Waiter/Waitress",
                "Accountant","Chef"};
        jobMenu = new JComboBox(str);
        jobMenu.setBounds(400,210,150,30);
        jobMenu.setBackground(Color.WHITE);        
        add(jobMenu);
        
        //label for SALARY
        salaryLabel = new JLabel("SALARY:");
        salaryLabel.setFont(new Font("Tahoma",Font.PLAIN,17));
        salaryLabel.setBounds(50,290,120,30);
        add(salaryLabel);
        salaryField = new JTextField();
        salaryField.setBounds(50,320,150,30);
        add(salaryField);

        //label for Phone
        phoneLabel = new JLabel("PHONE:");
        phoneLabel.setFont(new Font("Tahoma",Font.PLAIN,17));
        phoneLabel.setBounds(400,290,120,30);
        add(phoneLabel);
        phoneField = new JTextField();
        phoneField.setBounds(400,320,150,30);
        add(phoneField);

        //label for CNIC
        cnicLabel = new JLabel("CNIC:");
        cnicLabel.setFont(new Font("Tahoma",Font.PLAIN,17));
        cnicLabel.setBounds(50,410,120,30);
        add(cnicLabel);
        cnicField = new JTextField();
        cnicField.setBounds(50,440,150,30);
        add(cnicField);
        
        //label for EMAIL
        emailLabel = new JLabel("EMAIL:");
        emailLabel.setFont(new Font("Tahoma",Font.PLAIN,17));
        emailLabel.setBounds(400,410,120,30);
        add(emailLabel);
        emailField = new JTextField();
        emailField.setBounds(400,440,150,30);
        add(emailField);
        
//        //submission button
        b1 = new JButton("ADD");
        b1.setForeground(Color.white);
        b1.setBackground(Color.black);
        b1.setBounds(150,540,120,40);
        b1.addActionListener(this);
        add(b1);

        //button for back
        b2 = new JButton("Back");
        b2.setForeground(Color.white);
        b2.setBackground(Color.black);
        b2.setBounds(350,540,120,40);
        b2.addActionListener(this);
        add(b2);

        
        //label for adding image
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("HotelManagementSystem/Pictures/AddEmployee.png"));
        Image i2 = i1.getImage().getScaledInstance(300,350,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(600,100,450,350);
        add(l1);
        
 
        getContentPane().setBackground(Color.lightGray);
        setBounds(450,100,1080,650);
        setLayout(null);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            String name = nameField.getText();
            String age = ageField.getText();
            String salary = salaryField.getText();
            String phone = phoneField.getText();
            String cnic = cnicField.getText();
            String email = emailField.getText();

            String genderSelected = (String)gender.getSelectedItem();

            String job = (String)jobMenu.getSelectedItem();

            DatabaseConnection databaseConnection = new DatabaseConnection();

            String str = "insert into employee values('"+name+"','"+age+"','"+genderSelected+"','"+job+"','"+salary+"','"+
                    phone+"','"+cnic+"','"+email+"')";
            try{
                databaseConnection.statement.executeUpdate(str);

                JOptionPane.showMessageDialog(null,"New Employee Added.");
                new AdminFrame().setVisible(true);
                this.setVisible(false);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }else if  (ae.getSource()==b2){
            new AdminFrame();
            this.setVisible(false);
        }

    }
    
    public static void main(String [] args){
        new AddEmployee().setVisible(true);
    }
}