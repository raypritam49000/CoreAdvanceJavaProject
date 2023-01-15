import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
 

public class ContextServlet1 extends HttpServlet
{

	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
          PrintWriter out= res.getWriter();
	ServletContext ctx=getServletContext();
	Object o=ctx.getAttribute("abc");
        out.println("Welcome="+o);
 
 }
 
}