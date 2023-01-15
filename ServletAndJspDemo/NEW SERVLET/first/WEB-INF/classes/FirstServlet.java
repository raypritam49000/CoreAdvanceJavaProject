import javax.servlet.*;
import java.io.*;
public class FirstServlet extends GenericServlet
{
public void init(ServletConfig config)
{
System.out.println("init config...");
init();
}
public void init()
{
System.out.println("init default...");
}

public void service(ServletRequest request,ServletResponse response) throws ServletException,IOException
{
System.out.println("service...");
PrintWriter out=response.getWriter();
out.println("<html>");
out.println("<body bgcolor=yellow>");
out.println("hello...");
out.println("<br>");
out.println("hii...");
out.println("</body>");
out.println("</html>");
}
}











