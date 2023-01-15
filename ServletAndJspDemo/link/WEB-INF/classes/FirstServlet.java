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
out.println("<a href=http://www.gmail.com>Gmail</a>");
out.println("<br>");
out.println("<a href=http://www.yahoo.com>yahoo</a>");
out.println("<br>");
out.println("<a href=http://www.google.com>google</a>");
out.println("<a href=http://localhost:8090/autorefresh/run>run</a>");

out.println("</body>");
out.println("</html>");
}

}











