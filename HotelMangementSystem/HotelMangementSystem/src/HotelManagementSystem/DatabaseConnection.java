package HotelManagementSystem;

import java.sql.*;

public class DatabaseConnection {
    Connection connection;
    Statement statement;
    public DatabaseConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/HotelManagementSystem?autoReconnect=true&useSSl=false","root","tanzeel");
            statement = connection.createStatement();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
