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
Cookie ck[]=request.getCookies();
if(ck.length>0)
{
out.println("Cookie is:"+ck[0]);
out.println("<br>Name of Cookie is:"+ck[0].getName());
out.println("<br>Value of Cookie is:"+ck[0].getValue());
}
out.println("<br>");
out.println("<form action=bill>");
out.println("<input type=checkbox name=ck value=D> D</br>");
out.println("<input type=checkbox name=ck value=E> E</br>");
out.println("<input type=checkbox name=ck value=G> F</br>");
out.println("<input type=checkbox name=ck value=H> G</br>");
out.println("<input type=submit Value=Billing></br>");
out.println("</body>");
out.println("</html>");
}

}











