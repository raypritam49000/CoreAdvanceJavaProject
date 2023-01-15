import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*; 
public class ViewServlet extends HttpServlet
{
public void service(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
{
String name=request.getParameter("name");
File f=new File(name);
String fname=f.getName();
response.setContentType("aplication/octet-stream");
OutputStream out1=response.getOutputStream();
String downPath="D:\\AdvanceJavaProgram\\Servlet1\\download"+"\\"+fname;
FileInputStream fin=new FileInputStream(downPath);
byte b[]=new byte[fin.available()];
fin.read(b);
out1.write(b);
out1.close();
fin.close();
}
}

