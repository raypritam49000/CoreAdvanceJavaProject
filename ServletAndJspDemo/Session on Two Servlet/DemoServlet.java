import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class DemoServlet extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
	res.setContentType("text/html");
	PrintWriter out=res.getWriter();
	out.println("<html><body>");
	HttpSession s=req.getSession();
	String name =(String)s.getAttribute("name");
	out.println("hello"+name+s.isNew());
	out.println("</body></html>");
	}
}