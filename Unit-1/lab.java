import java.sql.Connection;
import java.sql.DriverManager; 
import java.sql.ResultSet;
import java.sql.Statement;   

public class lab {
    public static void main(String[] args) {
        try {
            // 1. Updated for MySQL 8.0+ (added the ".cj")
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // 2. Added serverTimezone parameter to prevent MySQL 8.0 connection errors
            String url = "jdbc:mysql://localhost:3306/college?useSSL=false&serverTimezone=UTC";
            Connection con = DriverManager.getConnection(url, "root", "");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from student");
            
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }
            
            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace(); 
        }
    }
}
