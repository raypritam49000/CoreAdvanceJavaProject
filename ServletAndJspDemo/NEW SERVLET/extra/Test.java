class FirstServlet extends HttpServlet
{
public void service()
{
ServletConfig cgf=this.getServletConfig();
System.out.println(cgf);
}
public static void main(String g[])
{
FirstServlet obj=new FirstServlet();
obj.service();
}
}