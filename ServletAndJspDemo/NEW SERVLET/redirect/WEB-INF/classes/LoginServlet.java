import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*; 
 
public class LoginServlet extends HttpServlet
{
public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
{
response.setContentType("text/html");
PrintWriter out=response.getWriter();
out.println("hello");
response.sendRedirect("abc.html");
}
}

