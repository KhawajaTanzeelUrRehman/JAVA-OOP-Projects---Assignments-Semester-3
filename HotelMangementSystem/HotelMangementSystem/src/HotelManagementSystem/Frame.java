package HotelManagementSystem;
import javax.swing.*;
import javax.swing.plaf.basic.BasicArrowButton;
import java.awt.*;
import java.awt.event.*;

// Created a class Frame to design the main frame
class Frame extends JFrame implements ActionListener {
    Frame() {
        setBounds(0, 0, 1920, 1080);

        // Adding frame in the background
        ImageIcon image1 = new ImageIcon(ClassLoader.getSystemResource("HotelManagementSystem/Pictures/frame2.jpg"));
        JLabel label1 = new JLabel(image1);
        label1.setBounds(0, 0, 1920, 1080);
        add(label1);

        // Adding a button on the main frame
        JButton btn1 = new JButton("NEXT");
        btn1.setBounds(890, 800, 150, 35);
        btn1.setFont(new Font("serif", Font.BOLD, 30));
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.BLACK);
        btn1.addActionListener(this);
        label1.add(btn1);
        setLayout(null);
        setVisible(true);
    }

    // Event Handling
    public void actionPerformed(ActionEvent ae) {
        new LogIN().setVisible(true);
    }

    public static void main(String[] args) {
        new Frame(); // Creating the object of the Class
    }
}
