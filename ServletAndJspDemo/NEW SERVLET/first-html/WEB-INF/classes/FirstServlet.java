import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class FirstServlet extends HttpServlet
{

public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
{
PrintWriter out=response.getWriter();
out.println("<html>");
out.println("<body bgcolor=yellow>");
out.println("DOGET");

String nm=request.getParameter("txtname");
String ps=request.getParameter("txtpass");
out.println("ur Name is:"+nm);
out.println("<br>");
out.println("ur password is:"+ps);
out.println("<br>");

String ck[]=request.getParameterValues("txtcheck");
for(String c:ck)
out.println(c);
String r=request.getParameter("txtrd");
out.println("<br>");
out.println(r);
String mname=request.getMethod();
out.println("<br>");
out.println("Method is:"+mname);

out.println("</body>");
out.println("</html>");
}
public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
{
PrintWriter out=response.getWriter();
out.println("<html>");
out.println("<body bgcolor=yellow>");
out.println("SERVICE");

String nm=request.getParameter("txtname");
String ps=request.getParameter("txtpass");
out.println("ur Name is:"+nm);
out.println("<br>");
out.println("ur password is:"+ps);
out.println("<br>");

String ck[]=request.getParameterValues("txtcheck");
for(String c:ck)
out.println(c);
String r=request.getParameter("txtrd");
out.println("<br>");
out.println(r);
String mname=request.getMethod();
out.println("<br>");
out.println("Method is:"+mname);

out.println("</body>");
out.println("</html>");
}

}











