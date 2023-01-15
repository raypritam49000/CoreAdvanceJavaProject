import java.io.*;
import javax.servlet.*;

public class MyFilter implements Filter{
	static int count=0;
	public void init(FilterConfig arg0) throws ServletException {}

	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
	
		PrintWriter out=res.getWriter();
		chain.doFilter(req,res);
		
		out.print("<br/>Total visitors "+(++count));
		out.close();
		
	}
	public void destroy() {}
}
