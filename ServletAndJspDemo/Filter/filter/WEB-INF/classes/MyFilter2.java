import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class MyFilter2 implements Filter
{
public void doFilter(ServletRequest req,ServletResponse resp,FilterChain chain) throws ServletException,IOException
{
PrintWriter out=resp.getWriter();
out.println("request passed from MyFilter 2<br>");

chain.doFilter(req,resp);

out.println("<br>response passed from MyFilter 2");
}
public void init(FilterConfig cgf)
{}
public void destroy()
{} 

}
