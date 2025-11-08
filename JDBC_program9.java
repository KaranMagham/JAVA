import java.sql.*;

public class DisplayTableData {
    public static void main(String[] args) {
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/your_database_name",
                    "your_username",
                    "your_password"
            );
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM students");
            System.out.println("ID\tName\tCity");
            System.out.println("---------------------------");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + "\t" +
                                   rs.getString("name") + "\t" +
                                   rs.getString("city"));
            }
        }
        catch (Exception e) {
            System.out.println("Error: " + e);
        }
        finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            } catch(Exception e) {
                System.out.println(e);
            }
        }
    }
}
