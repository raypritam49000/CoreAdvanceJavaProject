import java.io.*;
import java.util.Enumeration;
import javax.servlet.*;
import javax.servlet.http.*;
 

public class ConfigServlet extends HttpServlet {
public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {

	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	
	ServletConfig config=getServletConfig();
	Enumeration e=config.getInitParameterNames();
		
	String str=" ";
	while(e.hasMoreElements())
       {
	str=(String)e.nextElement();
	out.print("<br>Name: "+str);
	out.print(" value: "+config.getInitParameter(str));
	}
		
	out.close();
}

}


