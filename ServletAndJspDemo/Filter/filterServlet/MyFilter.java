import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class MyFilter implements Filter
{

FilterConfig con;
public void init(FilterConfig con)throws ServletException
{
	this.con=con;

 }
	public void doFilter(ServletRequest req,ServletResponse res,FilterChain chain)throws ServletException,IOException
{
	ServletContext ctx=con.getServletContext();
	Integer count=(Integer)ctx.getAttribute("count");
	if(count==null)
	{
	count=new Integer(0);
	
	}
	count=new Integer(count.intValue()+1);
	ctx.setAttribute("count",count);
	PrintWriter out=res.getWriter();
	out.println("before");
	chain.doFilter(req,res);
	out.println("filter output");
}
public void destroy()
{}
}
