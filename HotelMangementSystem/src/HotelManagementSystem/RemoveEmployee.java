package HotelManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

/**
 * @author Sajeel Hussain
 */
public class RemoveEmployee extends JFrame implements ActionListener {
    private Choice choice;
    private JButton btnExit;
    private JButton btnRemove;
    private JButton btnRefresh;
    private JTextField departmentText;
    private JTextField nameText;

    RemoveEmployee() {

        choice = new Choice();
        try {
            DatabaseConnection databaseConnection = new DatabaseConnection();// Creating the connection
            ResultSet rs = databaseConnection.statement.executeQuery("select * from employee");
            while (rs.next()) {
                choice.add(rs.getString("cnic"));// getting the IDs of the customer
            }
        } catch (Exception e) {
        }

        choice.setBounds(248, 150, 140, 20);// Setting the postion of the choice buttons
        add(choice);

        JLabel removeEmployee = new JLabel("Remove Employees");
        removeEmployee.setFont(new Font("Tahoma", Font.PLAIN, 20));
        removeEmployee.setBounds(350, 15, 400, 50);
        add(removeEmployee);



        JLabel lblEmployeesID = new JLabel("Employees ID: ");
        lblEmployeesID.setBounds(25, 150, 135, 14);
        add(lblEmployeesID);

        JLabel lblDepartment = new JLabel("Department :");
        lblDepartment.setBounds(25, 227, 107, 14);
        add(lblDepartment);

        departmentText = new JTextField();
        departmentText.setBounds(248, 220, 140, 20);
        add(departmentText);

        JLabel lblName = new JLabel("Name : ");
        lblName.setBounds(25, 310, 97, 14);
        add(lblName);

        nameText = new JTextField();
        nameText.setBounds(248, 305, 140, 20);
        add(nameText);
        nameText.setColumns(10);

        btnRefresh = new JButton("Refresh");
        btnRefresh.setBounds(50, 385, 100, 25);
        btnRefresh.setBackground(Color.BLACK);
        btnRefresh.setForeground(Color.WHITE);
        btnRefresh.addActionListener(this);
        add(btnRefresh);

        btnRemove = new JButton("Remove");
        btnRemove.setBounds(350, 385, 100, 25);
        btnRemove.setBackground(Color.BLACK);
        btnRemove.setForeground(Color.WHITE);
        btnRemove.addActionListener(this);
        add(btnRemove);

        btnExit = new JButton("Back");
        btnExit.setBounds(200, 385, 100, 25);
        btnExit.setBackground(Color.BLACK);
        btnExit.setForeground(Color.WHITE);
        btnExit.addActionListener(this);
        add(btnExit);

        ImageIcon checkOutImage = new ImageIcon(ClassLoader.getSystemResource("HotelManagementSystem/Pictures/RemoveEmployees.png"));
        JLabel imageLabel = new JLabel(checkOutImage);
        imageLabel.setBounds(500, 50, 350, 350);
        add(imageLabel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500, 100, 900, 500);
        setLayout(null);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnRefresh) {// The check out option will check all the customer information

            try {
                DatabaseConnection databaseConnection = new DatabaseConnection();
                String s1 = choice.getSelectedItem();
                //creating and initializing a local variable of class ResultSet.
                ResultSet result_1 = databaseConnection.statement.executeQuery("Select * from employee where cnic='" + s1 + "'");
                //using a while loop to jump from column to column and using next() to jump from row to row.
                while (result_1.next()) {
                    nameText.setText(result_1.getString("name"));
                    departmentText.setText(result_1.getString("job"));
                }//end while loop.
                //creating and initializing a local variable of class ResultSet.
            }//end try block.
            catch (Exception ae) {
                System.err.println(ae);
            }//end catch block.
        } else if (e.getSource() == btnRemove) {
            DatabaseConnection databaseConnection = new DatabaseConnection();
            try {
                databaseConnection.statement.executeUpdate("delete from employee where cnic = '" + choice.getSelectedItem() + "'");
                JOptionPane.showMessageDialog(null, "Employee removed successfully");
                new AdminFrame().setVisible(true);
                setVisible(false);
            }catch (Exception ae){

            }


        } else if (e.getSource() == btnExit) {
            new AdminFrame().setVisible(true);
            this.setVisible(false);

        }

    }

}
