import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class DemoServlet1 extends HttpServlet
{
public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
	
	res.setContentType("text/html");
	PrintWriter out=res.getWriter();
	out.println("<html><body>");
	String s="before Dispatcher";
	out.println(s);
	try
	{
	ServletContext ctx=getServletContext();
	ServletContext ctx1=ctx.getContext("http://localhost:7001/s3");
	//RequestDispatcher rd=req.getRequestDispatcher("/run2");
	RequestDispatcher rd=ctx1.getRequestDispatcher("/run");
	
	//rd.forward(req,res);
	rd.include(req,res);
	}
	catch(Exception e)
	{
	out.println(e);
	}
	out.println("after Disptcher");
	out.println("</body></html>");
	}
}