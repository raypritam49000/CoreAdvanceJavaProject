import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
 

public class ContextServlet extends HttpServlet
{

	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
         PrintWriter p=res.getWriter(); 
	ServletContext ctx=getServletContext();
	ctx.setAttribute("abc","Baba");
        p.println("<a href='run2'/>Click here for next Servlet"); 
  
 }
}