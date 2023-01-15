import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.*;
import java.io.*;

@WebServlet("/run")
public class DemoServlet extends HttpServlet
{
protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
res.setContentType("text/html");
PrintWriter out=res.getWriter();
out.println("<html><body>");
out.println("hello servlet from annotation");
out.println("</body></html>");
}
}