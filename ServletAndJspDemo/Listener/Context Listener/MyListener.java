import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;

public class MyListener implements ServletContextListener
{
public void contextInitialized(ServletContextEvent e)
{
try
{
ServletContext ctx=e.getServletContext();
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");

StoreObject o=new StoreObject(c);

ctx.setAttribute("con",o);

System.out.println("context created");
System.out.println("Connection="+c);

}
catch(Exception e1)
{}
}
public void contextDestroyed(ServletContextEvent e)
{

}
}