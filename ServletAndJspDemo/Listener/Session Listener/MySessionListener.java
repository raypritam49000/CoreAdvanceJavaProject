import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class MySessionListener implements HttpSessionListener
{
public void sessionCreated(HttpSessionEvent e)
{
try
{
HttpSession s=e.getSession();
s.setAttribute("name","ducat");
System.out.println("Session create");
}catch(Exception e1){ }
}
public void sessionDestroyed(HttpSessionEvent e)
{
}
}