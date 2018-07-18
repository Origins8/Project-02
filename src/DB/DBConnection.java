package DB;

import java.sql.*;

public class DBConnection {
    
    public Connection conn = null;
    public Statement stmt = null;
    
    public void DBConnection() throws SQLException
    {     
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagementsystem","root","");//open a connection
        stmt = conn.createStatement();
    }
}
