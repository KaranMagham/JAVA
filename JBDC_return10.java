import java.sql.*;
import java.util.Scanner;

public class FetchSingleRecord {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        Scanner sc = new Scanner(System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/your_database_name",
                    "your_username",
                    "your_password"
            );
            System.out.print("Enter Student ID to Search: ");
            int id = sc.nextInt();
            pst = con.prepareStatement("SELECT * FROM students WHERE id = ?");
            pst.setInt(1, id);
            rs = pst.executeQuery();
            if (rs.next()) {
                System.out.println("Record Found:");
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("City: " + rs.getString("city"));
            } else {
                System.out.println("No record found for ID " + id);
            }
        }
        catch (Exception e) {
            System.out.println("Error: " + e);
        }
        finally {
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                if (con != null) con.close();
            } catch(Exception e) {
                System.out.println(e);
            }
        }
    }
}
