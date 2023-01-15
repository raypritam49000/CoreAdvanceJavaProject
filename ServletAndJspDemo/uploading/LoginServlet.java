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
out.println("<html><body bgcolor=yellow>");
String nm=request.getParameter("txtname");
out.println("user Id:"+nm);
String p=this.getServletConfig().getServletContext().getRealPath("upload");
MultipartRequest mpr=new MultipartRequest(request,p,20*1024*1024);
String st=mpr.getOriginalFileName("file");
out.println(st);
String id=mpr.getParameter("txtname");
out.println("user Id="+id);
out.println(st+"file uloaded.....");
out.println("</body></html>");
out.close();

}
}

