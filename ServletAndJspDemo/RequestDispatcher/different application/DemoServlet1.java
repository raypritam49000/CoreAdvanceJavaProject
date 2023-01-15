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
	String s=("begore dispach");
	out.println(s);
	try
	{
	req.setAttribute("name","ducat");
	ServletContext ctx=getServletContext();
	ServletContext ctx1=ctx.getContext("http://localhost:7001/2/one");
	RequestDispatcher rd=ctx1.getRequestDispatcher("/one");
	rd.include(req,res);
	}
	catch(Exception e)
	{
	out.println("rd ");
	}
		out.println("after");
	out.println("</body></html>");
	}
}