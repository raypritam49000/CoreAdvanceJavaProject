import java.io.*;
import java.sql.*;
public class StoreObject
{

Connection c;
public StoreObject(Connection c)
{
this.c=c;
}
public Connection getConnection()
{
return c;
}

}