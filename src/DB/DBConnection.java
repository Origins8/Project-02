package DB;

import java.sql.*;

public class DBConnection {
    
    java.sql.Connection conn = null;
    Statement stmt = null;
    
    public void DBConnection() throws SQLException
    {     
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagementsystem","root","");//open a connection
        stmt = conn.createStatement();
    }
}
