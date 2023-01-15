import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class DemoServlet extends HttpServlet
{
	//public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException

public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
	res.setContentType("text/html");
	PrintWriter out=res.getWriter();
	out.println("<html><body>");
	String s=(String)req.getAttribute("name");
	out.println("hello servlet"+s);
	out.println("</body></html>");
	}
}