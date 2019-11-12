import java.io.IOException;
import java.sql.SQLException;

public class loginServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String name=request.getParameter("name");
        String password=request.getParameter("password");
        request.getSession().setAttribute("Uid", name);
        Service s = new Service();
        String rs;
                try {
                    rs=s.sc(name, password);
                    if (rs != null) {
                        request.getRequestDispatcher("/Stumain.jsp").forward(request, response);
                    }
                    else { //System.out.println(rs+"fg2");
                        request.setAttribute("login", "1");
                        request.getRequestDispatcher("/index.jsp").forward(request, response);
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
