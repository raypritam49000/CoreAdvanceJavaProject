import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.*;
import java.text.*;
public class RefreshServlet extends HttpServlet
{
int count=0;
public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
res.setContentType("text/html");
PrintWriter out=res.getWriter();
res.setHeader("Refresh","3");
out.println(new Date().toString()+" "+count++);
}

} 