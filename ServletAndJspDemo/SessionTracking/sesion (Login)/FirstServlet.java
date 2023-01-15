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
String pass=request.getParameter("txtpass");

HttpSession sess=request.getSession();
out.println(sess.isNew());
sess.setAttribute("n",nm);
sess.setAttribute("p",pass);
 
out.println("welcome:"+nm);
out.println("<br>");

//sess.setMaxInactiveInterval(20);
//out.println("<a href=next>Next</a>");

 
 String encodeUrl=response.encodeURL("next");
out.println(encodeUrl);
out.println("<br><a href="+encodeUrl+">Next</a>");
 
 out.println("</body>");
out.println("</html>");

}

}











