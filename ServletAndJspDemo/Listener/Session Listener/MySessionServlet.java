import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class MySessionServlet extends HttpServlet
{
public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
res.setContentType("text/html");
PrintWriter out=res.getWriter();
out.println("<html><body>");
out.println("hello servlet from Http servlet");
HttpSession s=req.getSession();
Object s1=s.getAttribute("name");
System.out.println(s1);
out.println("</body></html>");

}

}