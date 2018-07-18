package DB;

import java.sql.*;

public class DBConnection {
    
    private Connection conn = null;
    private Statement stmt = null;
    private ResultSet rs = null;

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    public Statement getStmt() {
        return stmt;
    }

    public void setStmt(Statement stmt) {
        this.stmt = stmt;
    }

    public ResultSet getRs() {
        return rs;
    }

    public void setRs(ResultSet rs) {
        this.rs = rs;
    }
    
    public void DBConnection() throws SQLException
    {     
        setConn(DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management_system_proj02","root",""));//open a connection       
        setStmt(getConn().createStatement());
    }
}
