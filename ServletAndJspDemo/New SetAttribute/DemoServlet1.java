import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class DemoServlet1 extends HttpServlet
{
PrintWriter out=null;
public void doGet(HttpServletRequest req,HttpServletResponse res)
{
try{

res.setContentType("text/html");
out=res.getWriter();

ServletContext context=getServletContext();

context.setAttribute("name","baba");

out.println("Welcome to first servlet");

out.println("<a href='servlet2'>visit</a>");

out.close();

}

catch(Exception e)
{
out.println(e);
}

}}

