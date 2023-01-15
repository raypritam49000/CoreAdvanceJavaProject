import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class LoginServlet extends HttpServlet
{
Connection con;
PreparedStatement pst;

public void init(ServletConfig config)
{
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con=DriverManager.getConnection("jdbc:odbc:dsn2");
pst=con.prepareStatement("select * from login where username=? and password=?");
}
catch(Exception e)
{System.out.println(e);}
}

public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
{
PrintWriter out=response.getWriter();
out.println("<html>");
out.println("<body bgcolor=yellow>");
String nm=request.getParameter("txtname");
String pass=request.getParameter("txtpass");
try
{
pst.setString(1,nm);
pst.setString(2,pass);
ResultSet rs=pst.executeQuery();
RequestDispatcher rd=null;
if(rs.next())
{
out.println("success...");

rd=request.getRequestDispatcher("/welcome");
rd.forward(request,response);
}
else
{
out.println("Invalid Username or Password");
rd=request.getRequestDispatcher("/home.html");
rd.include(request,response);
}
}
catch(Exception e)
{}
out.println("</body>");
out.println("</html>");
}

public void destroy()
{
try
{
con.close();
}
catch(Exception e)
{}
}
}











