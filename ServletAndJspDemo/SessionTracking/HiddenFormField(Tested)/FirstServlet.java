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
out.println("<body><form action=next method=post>");
out.println("<input type=hidden name=p1 value="+n+">");
out.println("<input type=hidden name=p2 value="+p+">");
out.println("<input type=submit value=next>");
out.println("</form></body></html>");
 
}

}