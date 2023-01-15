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
Integer tobj=(Integer)ctx.getAttribute("tcounter");
Integer cobj=(Integer)ctx.getAttribute("ccounter");
out.println(" current users."+cobj);
out.println(" Total users."+tobj);

}
}


