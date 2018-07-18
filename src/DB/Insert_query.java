package DB;

import java.sql.*;

public class Insert_query extends DB.DBConnection{

    public void InsertFunction() throws SQLException{
        User.QueryInput objQueryInput = new User.QueryInput();
        objQueryInput.SetInfo();
          
        Student.StudentInfo objStudent = new Student.StudentInfo();
        
        String insert = "INSERT INTO student(ID, NAME, AGE, ADDRESS) VALUES ('" +objStudent.getStId()+ "','" +objStudent.getStName()+ "','" +objStudent.getStAge()+ "','" +objStudent.getStAddress()+ "')";
        stmt.executeUpdate(insert);
    }
}