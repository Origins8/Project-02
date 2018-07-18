package DB;

import java.sql.*;

public class Insert_query {
    
    DB.DBConnection objDB = new DB.DBConnection();
    
    private String insert;

    public String getInsert() {
        return insert;
    }

    public void setInsert(String insert) {
        this.insert = insert;
    }
    
    public void InsertFunction(Student.StudentInfo objStudent) throws SQLException{
        objDB.DBConnection();
        setInsert("INSERT INTO student(ID, NAME, AGE, ADDRESS) VALUES ('" +objStudent.getStId()+ "','" +objStudent.getStName()+ "','" +objStudent.getStAge()+ "','" +objStudent.getStAddress()+ "')");
        objDB.getStmt().executeUpdate(getInsert());
    }
}