import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class DemoServlet extends HttpServlet
{
	 
public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
	res.setContentType("text/html");
	PrintWriter out=res.getWriter();
	String s=(String)req.getAttribute("name");
        out.println("<html><body>");
	out.println("I redirect to demoservlet"+s);
	out.println("</body></html>");
	}
}