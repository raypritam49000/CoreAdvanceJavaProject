class HttpServlet implements Servlet 
{
public ServletConfig getServletConfig()
{
return new ServletConfigImp();
}
}