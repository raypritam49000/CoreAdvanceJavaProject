import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class DemoServlet1 extends HttpServlet
{
	

public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
	res.setContentType("text/html");
	PrintWriter out=res.getWriter();
	ServletContext ctx=getServletContext();
	Integer count =(Integer)ctx.getAttribute("count");
	if(count==null)
	{
	count=new Integer(0);
	}
	count =new Integer(count.intValue()+1);
	ctx.setAttribute("count",count);
	out.println(count.intValue());
	}
}