import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
public class DemoServlet1 extends HttpServlet
{
	
	PrintWriter out;
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
	//res.setContentType("application/vnd.ms-excel");
//res.setContentType("text/html");
//res.setContentType("application/vnd.ms-powerpoint");
//res.setContentType("application/vnd.ms-excel");
res.setContentType("application/msword");
//PrintWriter out=response.getWriter();


	out=res.getWriter();
	out.println("hello...");
	//out.println("name\thindi\teng\tmath\ttotal");
	//out.println("lalu\t12\t13\t14\t=SUM(B2:D2)");
	}
	
	
}