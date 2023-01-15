import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class FirstServlet extends HttpServlet
{
public void service(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
{
response.setContentType("text/html");
PrintWriter out=response.getWriter();
out.println("<body bgcolor=yellow>");
String n=request.getParameter("txtname"); 
String p=request.getParameter("txtpass");
out.println("welcome........."+n);
out.println("<br>Password is:"+p); 
out.println("</body>");
out.println("<br><a href=next?p1="+n+"&p2="+p+">Next</a>");

}

}