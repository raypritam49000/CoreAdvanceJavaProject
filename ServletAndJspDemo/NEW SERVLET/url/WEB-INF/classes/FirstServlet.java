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
String p=request.getParameter("txtpass");

out.println("welcome:"+nm);
out.println("<br>");
out.println("<a href=next?name="+nm+"&pass="+p+">Next</a>");

out.println("</body>");
out.println("</html>");
}

}











