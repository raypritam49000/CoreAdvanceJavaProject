import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class NextServlet extends HttpServlet
{
public void service(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
{
response.setContentType("text/html");
PrintWriter out=response.getWriter();
out.println("<body bgcolor=yellow>");
 String n=request.getParameter("p1"); 
 String m=request.getParameter("p2");
out.println(n);
out.println("<br>"); 
out.println(m);
out.println("</body>");
 }
}
 
 


 