import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class WelcomeServlet extends HttpServlet
{
public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
{
PrintWriter out=response.getWriter();
out.println("<html>");
out.println("<body bgcolor=yellow>");
String nm=request.getParameter("txtname");
out.println("Welcome "+nm);
out.println("<br>");
out.println("this page is under construction.... ");

out.println("</body>");
out.println("</html>");
}

}











