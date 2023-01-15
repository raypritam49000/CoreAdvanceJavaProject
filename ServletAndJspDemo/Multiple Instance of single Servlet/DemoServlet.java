import javax.servlet.*;
import java.io.*;

public class DemoServlet implements Servlet,SingleThreadModel
{

public void init(ServletConfig con)
{
System.out.println("init");
}
public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException
{
res.setContentType("text/html");
PrintWriter out=res.getWriter();
out.println("<html><body>");
out.println("hello servlet from demoservlet.................");
out.println("</body></html>");
}
public void destroy()
{
System.out.println("destroy");
}
public ServletConfig getServletConfig()
{
return null;
}
public String getServletInfo()
{
return null;
}
}