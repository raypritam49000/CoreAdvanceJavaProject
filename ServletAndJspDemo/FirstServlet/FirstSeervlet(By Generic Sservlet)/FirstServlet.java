import javax.servlet.*;
import java.io.*;
public class FirstServlet extends GenericServlet
{
public void service(ServletRequest request,ServletResponse response) throws ServletException,IOException
{
PrintWriter out=response.getWriter();
out.println("<html>");
out.println("<body bgcolor=yellow>");
out.println("hello servlet form generic servlet class...");
out.println("<br>");
out.println("hii...");
out.println("</body>");
out.println("</html>");
}
}











