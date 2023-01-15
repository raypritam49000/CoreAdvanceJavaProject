import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*; 
public class FirstServlet extends  HttpServlet
{
	
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		HttpSession s= req.getSession();
		 s.invalidate();
res.sendRedirect("home.html");
	}
}
       