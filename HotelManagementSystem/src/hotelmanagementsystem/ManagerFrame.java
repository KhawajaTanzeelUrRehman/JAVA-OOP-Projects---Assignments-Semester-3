package HotelManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class ManagerFrame extends JFrame implements ActionListener {
    JLabel l1;
    JButton b1, b2, b3, b4, b5, b6, b7, b8;

    ManagerFrame() {
        setBounds(0, 0, 1920, 1080);

        // Imported the picture
        ImageIcon ic = new ImageIcon(ClassLoader.getSystemResource("HotelManagementSystem/Pictures/Add Roomss.jpg"));
        JLabel label1 = new JLabel(ic);
        label1.setBounds(0, 0, 1920, 1080);
        add(label1);

        // Created the button for adding rooms
        b1 = new JButton("Add Rooms");
        b1.setBounds(140, 430, 190, 35);
        b1.setFont(new Font("serif", Font.BOLD, 30));
        b1.setForeground(Color.BLACK);
        b1.setBackground(Color.WHITE);
        label1.add(b1);
        b1.addActionListener(this);

        // Created the button for Room Info
        b2 = new JButton("Room Info");
        b2.setBounds(640, 430, 190, 35);
        b2.setFont(new Font("serif", Font.BOLD, 30));
        b2.setForeground(Color.BLACK);
        b2.setBackground(Color.WHITE);
        label1.add(b2);
        b2.addActionListener(this);

        // Created the button for updating room status
        b3 = new JButton("Update Room Status");
        b3.setBounds(1070, 430, 305, 40);
        b3.setFont(new Font("serif", Font.BOLD, 30));
        b3.setForeground(Color.BLACK);
        b3.setBackground(Color.WHITE);
        label1.add(b3);
        b3.addActionListener(this);
        // Created the button for Searching rooms
        b4 = new JButton("Search Rooms");
        b4.setBounds(1605, 430, 215, 35);
        b4.setFont(new Font("serif", Font.BOLD, 30));
        b4.setForeground(Color.BLACK);
        b4.setBackground(Color.WHITE);
        label1.add(b4);
        b4.addActionListener(this);
        // Created the button for check in status
        b5 = new JButton("Check in Status");
        b5.setBounds(345, 840, 235, 35);
        b5.setFont(new Font("serif", Font.BOLD, 30));
        b5.setForeground(Color.BLACK);
        b5.setBackground(Color.WHITE);
        label1.add(b5);
        b5.addActionListener(this);
        // Created the button for new customer form
        b6 = new JButton("New Customer Form");
        b6.setBounds(850, 840, 300, 35);
        b6.setFont(new Font("serif", Font.BOLD, 30));
        b6.setForeground(Color.BLACK);
        b6.setBackground(Color.WHITE);
        label1.add(b6);
        b6.addActionListener(this);
        // Created the button for customer info
        b7 = new JButton("Customer Info");
        b7.setBounds(1400, 840, 220, 35);
        b7.setFont(new Font("serif", Font.BOLD, 30));
        b7.setForeground(Color.BLACK);
        b7.setBackground(Color.WHITE);
        label1.add(b7);
        b7.addActionListener(this);
        // Created the button for logging out
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

    public static void main(String[] args) {
        new ManagerFrame(); // Created the object of class
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1){
            new AddRooms();
            this.setVisible(false);

        } else if (e.getSource() == b2) {
            new RoomInfo();
            this.setVisible(false);

        } else if (e.getSource() == b3) {
            new UpdateRoomStatus();
            this.setVisible(false);

        } else if (e.getSource() == b4) {
            try {
                new SearchRoom();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            this.setVisible(false);

        } else if (e.getSource() == b5) {
            try {
                new UpdateCheck();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            this.setVisible(false);

        } else if (e.getSource() == b6) {
            new NewCustomer();
            this.setVisible(false);

        } else if (e.getSource() == b7) {
            new CustomersInfo();
            this.setVisible(false);

        } else if (e.getSource() == b8) {
            new LogIN();
            this.setVisible(false);

        }

    }
}