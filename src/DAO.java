import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {
    /*Connection con;
    ResultSet rs;
    PreparedStatement preSql;
    int rs1;*/
    public static PreparedStatement getPreparedStatement(Connection con, String sql, Object[] obj){
        PreparedStatement preSql=null;
        if(con!=null){
            try{
                preSql = con.prepareStatement(sql);
                if(obj==null){
                    return preSql;
                }else{
                for(int i=0;i<obj.length;i++){
                    preSql.setObject(i+1,obj[i]);
                }
                }
            }
            catch (SQLException e){}
        }
        return preSql;
    }
    public static ResultSet getResultSet(PreparedStatement preSql){
        ResultSet rs=null;
        try{
              rs = preSql.executeQuery();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return rs;
    }
    public static int ex(PreparedStatement preSql){
        int rs = 0;
        try{
            rs = preSql.executeUpdate();
        }
        catch (SQLException e){
        }
        return rs;
    }

}

