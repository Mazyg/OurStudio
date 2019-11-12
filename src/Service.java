import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Service {
    String sc(String name, String password) throws SQLException {
        String sql = "select * from user where uid = ? and upassward = ? ";
        Object[] sz = new Object[]{name, password};
        PreparedStatement ps;
        ResultSet rs;
        String rs1 = null;
        ps = DAO.getPreparedStatement(JDBC.connectDB(), sql, sz);
        rs = DAO.getResultSet(ps);
        while (rs.next()) {
            rs1 = rs.getString(1);
        }
        return rs1;

    }
}

