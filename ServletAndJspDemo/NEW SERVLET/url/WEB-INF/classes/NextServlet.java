import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class NextServlet extends HttpServlet
{
public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
{
PrintWriter out=response.getWriter();
out.println("<html>");
out.println("<body bgcolor=yellow>");
out.println("<br>");
String n=request.getParameter("name");
String p=request.getParameter("pass");

out.println("welcome "+n);
out.println("<br> Password is:"+p);

out.println("</body>");
out.println("</html>");
}

}











