package src;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InsertOperation {
    public static void updateOperation(){
        // Get all employees
        try (Connection conn = ConnectionClass.getConnection();
             PreparedStatement query = conn.prepareStatement("SELECT * FROM employees");
             ResultSet rs = query.executeQuery()) {



            while (rs.next()) {
rs.setInt(1, "101");
                String firstname = rs.getString("first_name");
                String lastname = rs.getString("last_name");
                String email = rs.getString("email");
                int salary = rs.getInt("salary");

                System.out.printf("|  %-3d|  %-12s |  %-10s |  %-18s |  %-6d |\n",
                                  id, firstname, lastname, email, salary);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }

}

}
