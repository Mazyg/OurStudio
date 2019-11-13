import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {
    public static Connection connectDB(){
        Connection con = null;
        String uri = "jdbc:mysql://localhost:3306/student?serverTimezone=GMT%2B8&useSSL=false&characterEncoding=UTF-8&allowPublicKeyRetrieval=true";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (Exception e){
            System.out.println(e);

        }
        try{
            con = DriverManager.getConnection(uri,"root","123456");
            System.out.println("JDBC successful connection");
        }
        catch (SQLException e){
            System.out.println(e);
        }
        if(con==null){
            System.out.println("22");
        }
        return con;
    }
    public static void close(Connection con){
        if(con != null){
            try{
                con.close();
            }
            catch (SQLException e){}
        }
    }
}
