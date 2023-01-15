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
	RequestDispatcher rd=req.getRequestDispatcher("/run2");       
	//rd.include(req,res);
	rd.forward(req,res);
	}
	catch(Exception e)
	{
	out.println(e);
	}
	out.println("after");
	out.println("</body></html>");
	}
}