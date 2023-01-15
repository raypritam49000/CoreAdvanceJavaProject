import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*; 
import com.oreilly.servlet.*; 
public class LoginServlet extends HttpServlet
{
public void service(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
{
response.setContentType("text/html");
PrintWriter out=response.getWriter();
String nm="d:\\abc";
MultipartRequest mpr=new MultipartRequest(request,nm,20*1024*1024);
String st=mpr.getParameter("txtname");
out.println(st);
out.close();

}
}

