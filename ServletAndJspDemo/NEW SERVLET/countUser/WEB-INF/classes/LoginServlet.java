import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*; 
 
public class LoginServlet extends HttpServlet
{
public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
{
response.setContentType("text/html");
PrintWriter out=response.getWriter();
String n=request.getParameter("txtname");
String p=request.getParameter("txtpass");
out.println("welcome.."+n);
HttpSession sess=request.getSession();
out.println("<a href=logout>logout</a>");
out.println("<a href=count>count</a>");
}
}	

