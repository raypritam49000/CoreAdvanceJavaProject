import javax.servlet.*;
import javax.servlet.http.*;
public class MyListener implements ServletContextListener,HttpSessionListener
{
public void contextInitialized(ServletContextEvent se)
{
ServletContext ctx=se.getServletContext();
System.out.println("context object is created...");
ctx.setAttribute("tcounter",0);
ctx.setAttribute("ccounter",0);
}
public void contextDestroyed(ServletContextEvent se)
{
System.out.println("context object is destroyed...");
}
public void sessionCreated(HttpSessionEvent he)
{
ServletContext se=he.getSession().getServletContext();
Integer cobj=(Integer)se.getAttribute("ccounter");
Integer tobj=(Integer)se.getAttribute("tcounter");
cobj++;
tobj++;
se.setAttribute("ccounter",cobj);
se.setAttribute("tcounter",tobj);
}
public void sessionDestroyed(HttpSessionEvent he)
{
ServletContext se=he.getSession().getServletContext();
Integer cobj=(Integer)se.getAttribute("ccounter");
cobj--;
se.setAttribute("ccounter",cobj);
}

}



