import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ConfigServlet extends HttpServlet
{
	ServletConfig con;
	ServletContext ctx;
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
	ctx=getServletContext();
	con=getServletConfig();
	String image=con.getInitParameter("image");
	String driver=ctx.getInitParameter("driver");
	res.setContentType("text/html");
	PrintWriter out=res.getWriter();
	out.print(image);
	out.println("<HTML><BODY background="+image+">");
	out.println(driver);
	out.println("</body></html>");
	}
}