package DB;

import java.sql.*;

public class Connection {
    
    java.sql.Connection conn = null;
    Statement stmt = null;
    
    public void connecting() throws SQLException
    {     
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagementsystem","root","");//open a connection
        stmt = conn.createStatement();
    }
}
