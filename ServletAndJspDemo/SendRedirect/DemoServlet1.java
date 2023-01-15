import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class DemoServlet1 extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
 

	{
	res.setContentType("text/html");
	PrintWriter out=res.getWriter();
	out.println("<html><body>");
	out.println("I am");
     	//res.sendRedirect("run2");

	//res.sendRedirect("welcome.jsp");
        //res.sendRedirect("http://localhost:7001/a/index.html");
     
res.sendRedirect("http://localhost:8081/abc/index.html");
          
     out.println("I ");
	out.println("</body></html>");
	}
}