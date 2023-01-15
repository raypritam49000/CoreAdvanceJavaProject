import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class Welcome extends HttpServlet
{
public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
res.setContentType("text/html");
PrintWriter out=res.getWriter();
String name=req.getParameter("name");
out.println("<html><body bgcolor=yellow>");
out.println("welcome:"+name);
out.println("</body></html>");

}
 
}