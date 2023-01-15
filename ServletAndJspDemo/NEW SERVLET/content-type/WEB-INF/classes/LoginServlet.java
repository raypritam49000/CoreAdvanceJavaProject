import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*; 
 
public class LoginServlet extends HttpServlet
{
public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
{
//response.setContentType("text/html");

response.setContentType("application/vnd.ms-powerpoint");
//response.setContentType("application/vnd.ms-excel");
//response.setContentType("application/msword");
PrintWriter out=response.getWriter();
out.println("hello...");
}
}

