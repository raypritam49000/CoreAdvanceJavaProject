import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class MyFilterServlet1 extends HttpServlet
{
PrintWriter out;
public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
res.setContentType("text/html");
out=res.getWriter();
ServletContext ctx=getServletContext();
Integer count=(Integer)ctx.getAttribute("count");
out.println(count.intValue());
out.println("second servlet");
}}