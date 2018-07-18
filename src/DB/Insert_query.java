package DB;

import java.sql.*;

public class Insert_query extends DB.DBConnection{

    public void InsertFunction(Student.StudentInfo objStudent) throws SQLException{
        
        String insert = "INSERT INTO student(ID, NAME, AGE, ADDRESS) VALUES ('" +objStudent.getStId()+ "','" +objStudent.getStName()+ "','" +objStudent.getStAge()+ "','" +objStudent.getStAddress()+ "')";
        getStmt().executeUpdate(insert);
    }
}