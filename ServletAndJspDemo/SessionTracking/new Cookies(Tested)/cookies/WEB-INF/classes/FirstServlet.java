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
Cookie ck=new Cookie("name",nm);
ck.setMaxAge(20);
response.addCookie(ck);
out.println("<br>");
out.println("<form action=next>");
out.println("<input type=checkbox name=ck value=A> A</br>");
out.println("<input type=checkbox name=ck value=B> B</br>");
out.println("<input type=checkbox name=ck value=C> C</br>");
out.println("<input type=checkbox name=ck value=D> D</br>");
out.println("<input type=submit Value=Next></br>");
out.println("</form>");
out.println("</body>");
out.println("</html>");
}
}