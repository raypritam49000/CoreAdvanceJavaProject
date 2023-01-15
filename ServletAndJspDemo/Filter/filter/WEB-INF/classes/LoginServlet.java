import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*; 
 
public class LoginServlet extends HttpServlet
{
public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
{
response.setContentType("text/html");
PrintWriter out=response.getWriter();
String n=request.getParameter("txtname");
String p=request.getParameter("txtpass");
out.println("<br>welcome..in Login Servlet"+n);
out.println("<br><a href=next>Next</a><br>");
}
}	

