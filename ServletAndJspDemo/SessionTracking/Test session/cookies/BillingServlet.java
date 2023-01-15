import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class BillingServlet extends HttpServlet
{
public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
{
PrintWriter out=response.getWriter();
out.println("<html>");
out.println("<body bgcolor=yellow>");
String ck[]=request.getParameterValues("ck");
out.println("U hv selected:");
for(String c:ck)
{
out.println("<br>"+c);
}
out.println("</body>");
out.println("</html>");
}

}











