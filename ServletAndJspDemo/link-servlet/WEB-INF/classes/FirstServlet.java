import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class FirstServlet extends HttpServlet
{

public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
{
PrintWriter out=response.getWriter();
out.println("<html>");
out.println("<body bgcolor=yellow>");

String nm=request.getParameter("txtname");
out.println("welcome:"+nm);
out.println("<br>");
ServletConfig cfg=this.getServletConfig();
ServletContext ctx=cfg.getServletContext();
String p=ctx.getInitParameter("param1");
out.println("param1="+p);

out.println("<a href=next>Next</a>");

out.println("</body>");
out.println("</html>");
}

}











