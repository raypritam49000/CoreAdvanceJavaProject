import javax.servlet.http.*;
import java.io.*;
public class DemoServlet extends HttpServlet
{ 
public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
{
res.setContentType("text/html");
PrintWriter out=res.getWriter();
out.println("<html><body bgcolor=orange>");
out.println("hello servlet from DOGET");

String nm=req.getParameter("txtname");
String ps=req.getParameter("txtpass");
out.println("ur Name is:"+nm);
out.println("<br>");
out.println("ur password is:"+ps);

String mname2=req.getMethod();
out.println("<br>");
out.println("Method is:"+mname2);
out.println("</body></html>");
}

public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
{
res.setContentType("text/html");
PrintWriter out=res.getWriter();
out.println("<html><body bgcolor=orange>");
out.println("hello servlet from DOPOST");

String nm=req.getParameter("txtname");
String ps=req.getParameter("txtpass");
out.println("ur Name is:"+nm);
out.println("<br>");
out.println("ur password is:"+ps);

String mname1=req.getMethod();
out.println("<br>");
out.println("Method is:"+mname1);
out.println("</body></html>");
}
/*
public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
{
res.setContentType("text/html");
PrintWriter out=res.getWriter();
out.println("<html><body bgcolor=orange>");
out.println("hello servlet from SERVICE");

String nm=req.getParameter("txtname");
String ps=req.getParameter("txtpass");
out.println("ur Name is:"+nm);
out.println("<br>");
out.println("ur password is:"+ps);

String mname=req.getMethod();
out.println("<br>");
out.println("Method is:"+mname);
out.println("</body></html>");
}
*/
}