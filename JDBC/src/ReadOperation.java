package src;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

 public class  ReadOperation{



        public static void readOperation(){
        // Get all employees
        try (Connection conn = ConnectionClass.getConnection();
             PreparedStatement query = conn.prepareStatement("SELECT * FROM employees");
             ResultSet rs = query.executeQuery()) {

            System.out.println("|  Id  |  First_Name  |  Last_Name  |  Email            |  Salary  |");
            System.out.println("|------|--------------|-------------|--------------------|----------|");

            while (rs.next()) {
                int id = rs.getInt("employee_id");
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
