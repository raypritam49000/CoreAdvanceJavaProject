import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*; 
public class LogoutServelt extends HttpServlet
{
public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
{
response.setContentType("text/html");
PrintWriter out=response.getWriter();
HttpSession sess=request.getSession();
sess.invalidate();
response.sendRedirect("home.html");
}
}


