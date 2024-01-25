package control;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class connector {

    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "");

            Statement statement = (Statement) connection.createStatement();

            statement.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println("SQL Exception" + e.toString());

        }

    }
}
