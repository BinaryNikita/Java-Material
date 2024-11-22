package src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionClass {

    private static final  String url = "jdbc:mysql://localhost:3306/newemployee";
  private static final String USER = "root";
    private static final String PASSWORD = "root";

public static Connection getConnection() throws SQLException{
    return DriverManager.getConnection(url, USER, PASSWORD);
}
}

