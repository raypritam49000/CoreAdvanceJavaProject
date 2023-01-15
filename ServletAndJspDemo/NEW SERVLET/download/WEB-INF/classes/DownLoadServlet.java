import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*; 
public class DownLoadServlet extends HttpServlet
{
public void service(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
{
String name=request.getParameter("name");
File f=new File(name);
String fname=f.getName();
response.setHeader("content-disposition","attachment;filename="+fname);
response.setContentType("aplication/octet-stream");
OutputStream out1=response.getOutputStream();
String downPath="d:\\abc"+"\\"+fname;
FileInputStream fin=new FileInputStream(downPath);
byte b[]=new byte[fin.available()];
fin.read(b);
out1.write(b);
out1.close();
fin.close();
}
}

