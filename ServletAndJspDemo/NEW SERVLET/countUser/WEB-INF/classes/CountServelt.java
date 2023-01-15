import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*; 
public class CountServelt extends HttpServlet
{
public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
{
response.setContentType("text/html");
PrintWriter out=response.getWriter();
ServletContext ctx=this.getServletContext();
Integer cobj=(Integer)ctx.getAttribute("ccounter");
Integer tobj=(Integer)ctx.getAttribute("tcounter");
out.println(" Total users."+tobj);
out.println(" current users."+cobj);
}
}


