package liutenica.vegetables;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public enum DBManager {

    INSTANCE;
    Connection connection;

    private DBManager(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found");
        }
        try {
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema","root","qwercska");
        } catch (SQLException e) {
            System.out.println("connection failed");
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
