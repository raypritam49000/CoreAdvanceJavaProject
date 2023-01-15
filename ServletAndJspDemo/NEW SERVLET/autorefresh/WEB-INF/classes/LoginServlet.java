import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*; 
 
public class LoginServlet extends HttpServlet
{
int i=0;
public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
{
response.setContentType("text/html");

//response.setHeader("refresh","1");
response.setHeader("refresh","3;URL=http://www.google.com");

PrintWriter out=response.getWriter();

out.println("hello..."+(++i));
}
}

