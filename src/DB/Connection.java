package DB;

import java.sql.*;

public class Connection {
    
    java.sql.Connection conn = null;
    private Statement stmt = null;

    public Statement getStmt() {
        return stmt;
    }

    public void setStmt(Statement stmt) {
        this.stmt = stmt;
    }
    
    public void connecting() throws SQLException
    {     
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagementsystem","root","");//open a connection
        stmt = conn.createStatement();
    }
}
