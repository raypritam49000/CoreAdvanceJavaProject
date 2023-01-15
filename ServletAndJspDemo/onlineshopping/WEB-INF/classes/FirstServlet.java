import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class FirstServlet extends HttpServlet
{
public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
{
PrintWriter out=response.getWriter();
String f_options[]=request.getParameterValues("txtcheck");
out.println(f_options);
if(f_options==null)
{
out.println("<br> No option is selected...");
}
else
{ 
 int i=0;
 for(String l:f_options)
  {
    Cookie ck=new Cookie("n"+i,l);
    ck.setMaxAge(10);
    response.addCookie(ck);
    i++;
  }
}
out.println("<body bgcolor=yellow>");
out.println("<br>");
out.println("<form action=next>");
out.println("HDD<input type=checkbox name=txtcheck1 value=HDD>");
out.println("<br>");
out.println("speaker<input type=checkbox name=txtcheck1 value=Spkr>");
out.println("<br>");
out.println("<input type=submit value=Bill>");
out.println("</form>");
out.println("</body>");
out.close();
}
}





