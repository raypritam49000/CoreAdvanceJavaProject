import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;

public class RequestServlet extends HttpServlet
{
/*
public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
res.setContentType("text/html");
PrintWriter out=res.getWriter();
out.println("<html><body>");
String name=req.getParameter("name");
String pass=req.getParameter("pass");
if(name.equals("DUCAT") && pass.equals("DUCAT"))
out.println("user is valid through service method");
else
out.println("user is Invalid through service method");
out.println("</body></html>");
}
*/
public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
res.setContentType("text/html");
PrintWriter out=res.getWriter();
out.println("<html><body>");
String name=req.getParameter("name");
String pass=req.getParameter("pass");
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
Statement s=c.createStatement();
int x=s.executeUpdate("insert into emp20 values(' " +name+" ',' "+pass+ " ')");
ResultSet rs=s.executeQuery("select * from emp20");
while(rs.next())
{
out.println(rs.getString(1));
out.println(rs.getString(2));
out.println("<br>");
}
}catch(Exception e){}

if(name.equals("DUCAT") && pass.equals("DUCAT"))
out.println("user is valid through post method");
else
out.println("user is invalid through post method");

out.println("<html><body>");
}
 
 public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
res.setContentType("text/html");
PrintWriter out=res.getWriter();
out.println("<html><body>");
String name=req.getParameter("name");
String pass=req.getParameter("pass");
out.println("Your Name is="+name);
out.println("<br>");
out.println("Your Pass is="+pass);

if(name.equals("DUCAT") && pass.equals("DUCAT"))
out.println("user is valid through Get method");
else
out.println("user is invalid through Get method");
out.println("<html><body>");

} 
 
}