import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class NextServlet extends HttpServlet
{
public void service(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
{
PrintWriter out=response.getWriter();
out.println("<body bgcolor=yellow>");
out.println("<br>");
String n_options[]=request.getParameterValues("txtcheck");
out.println(n_options);
Cookie ck[]=request.getCookies();
if(ck==null)
{
out.println("<br>Cookies not founf.....");
}
else
{
out.println(ck.length);
for(int i=0;i<ck.length;i++)
{
out.println("<br>");
out.println(ck[i].getValue());
}}

String n_options1[]=request.getParameterValues("txtcheck1");
out.println(n_options1);
if(n_options1==null)
{
out.println("<br>No option Selected");
}
else
{
for(String s:n_options1)
{
out.println("<br>");
out.println(s);
out.close();
}
}
}

}






 