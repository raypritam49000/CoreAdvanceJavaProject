import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ConfigServlet extends HttpServlet
{
          public void init(ServletConfig con)
          {
           try
{
          super.init(con);
        System.out.print(con);

 
}
catch(Exception e)
{}         }

	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
PrintWriter out=res.getWriter();
	ServletConfig con=this.getServletConfig();
        out.print(con);

	String image=con.getInitParameter("image");
	res.setContentType("text/html");
	
	out.print(image);
        out.print(con);
	out.println("<HTML><BODY background="+image+">");
	out.println("</body></html>");
	}
}