import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class ContextServlet extends HttpServlet
{
	ServletContext ctx;
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
	ctx=getServletContext();
	String driver=ctx.getInitParameter("driver");
	String url=ctx.getInitParameter("url");
	String user=ctx.getInitParameter("user");
	String pass=ctx.getInitParameter("pass");
        res.setContentType("text/html");
	PrintWriter hathi=res.getWriter();
try
{
Class.forName(driver);
Connection c=DriverManager.getConnection(url,user,pass);
Statement s=c.createStatement();
ResultSet rs=s.executeQuery("select * from emp");
while(rs.next())
{
hathi.println("<hrml><body>");
hathi.println(rs.getString(1));
hathi.println(rs.getString(2));
hathi.println("<br>");
hathi.println("</body></html>");
}
}
catch(Exception e)
{
System.out.println(e);
}}
}