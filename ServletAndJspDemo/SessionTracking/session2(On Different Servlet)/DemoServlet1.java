import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class DemoServlet1 extends HttpServlet
{
public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
	res.setContentType("text/html");
	PrintWriter out=res.getWriter();
	HttpSession s=req.getSession();
	s.setAttribute("name","ducat");
	Integer count =(Integer)s.getAttribute("count");
	if(count==null)
	{
	count=new Integer(0);
	}
	count =new Integer(count.intValue()+1);
	s.setAttribute("count",count);
	out.println(count.intValue()+" "+s.isNew());
	}
}