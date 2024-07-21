package Project;
import java.sql.*;

public class ConnectionProvider {
    public static Connection getcon() throws ClassNotFoundException{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/raj","root","Active@53");
            return con;
        }catch(SQLException e){
            return null;
        }
    }
}
