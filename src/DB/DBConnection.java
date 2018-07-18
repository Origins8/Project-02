package DB;

import java.sql.*;

public class DBConnection {
    
    public Connection conn = null;
    public Statement stmt = null;
    
    public void DBConnection() throws SQLException
    {     
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management_system_proj02","root","");//open a connection
        stmt = conn.createStatement();
    }
}
