import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class DemoServlet extends HttpServlet
{ 
/*
public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
res.setContentType("text/html");
PrintWriter out=res.getWriter();
out.println("<html><body>");
out.println("hello servlet from Http servlet");
out.println("</body></html>");
}

public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
{
res.setContentType("text/html");
PrintWriter out=res.getWriter();
out.println("<html><body>");
out.println("hello servlet from servletRequest");
out.println("</body></html>");
}
*/
public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
res.setContentType("text/html");
PrintWriter out=res.getWriter();
out.println("<html><body>");
out.println("hello servlet from doGet");
out.println("</body></html>");
}

public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
res.setContentType("text/html");
PrintWriter out=res.getWriter();
out.println("<html><body>");
out.println("hello servlet from doPost");
out.println("</body></html>");
}


}