import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class LoginServlet extends HttpServlet
{
RequestDispatcher rd=null;
public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
res.setContentType("text/html");
PrintWriter out=res.getWriter();
out.println("<html><body>");
String name=req.getParameter("name");
String pass=req.getParameter("pass");
if(name.equals("sunlight") && pass.equals("java"))
{
rd=req.getRequestDispatcher("welcome");
out.println("sucess");
rd.forward(req,res);
}
else
{
out.println("<font color=red>Invalid Username or Password</font>");
rd=req.getRequestDispatcher("home.html");
rd.include(req,res);
 }
out.println("</body></html>");

}
 
}