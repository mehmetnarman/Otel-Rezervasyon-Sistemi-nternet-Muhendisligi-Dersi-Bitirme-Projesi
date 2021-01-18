package connector;
import java.sql.*;


public class ConnectionOtel {
    private static Connection con;
    
    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/oteller?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey","root","123456");
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return con;
    }
}