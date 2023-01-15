import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;
public class ListenerServlet extends HttpServlet
{
PrintWriter out;
public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
res.setContentType("text/html");
out=res.getWriter();
out.println("<html><body>");
ServletContext ctx=getServletContext();
StoreObject o=(StoreObject)ctx.getAttribute("con");
Connection c=o.getConnection();
try
{
Statement s=c.createStatement();
ResultSet rs=s.executeQuery("select * from student1");
while(rs.next())
{

out.println("Name:"+rs.getString(1));
out.println("Pass:"+rs.getInt(2));
out.println("<br>");
}
}catch(Exception e)
{
System.out.println(e);
}
out.println("</body></html>");
}
}