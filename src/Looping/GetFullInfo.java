package Looping;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GetFullInfo extends DB.DBConnection{
    
    public void LoopingStatement() throws SQLException{
        
        DB.Retrieve_Full_Info objFull = new DB.Retrieve_Full_Info();
        ResultSet rs;
        
        rs = stmt.executeQuery(objFull.all);
        
        Student.StudentInfo objStudent = new Student.StudentInfo();
        DisplayInfo.FullInfo objInfoFull = new DisplayInfo.FullInfo();
        
        while(rs.next()){
            //Retrieve by column name
            objStudent.setStId(rs.getString("ID"));
            objStudent.setStName(rs.getString("NAME"));
            objStudent.setStAge(rs.getInt("AGE"));
            objStudent.setStAddress(rs.getString("ADDRESS"));
            
            objInfoFull.ShowFullInfo();
        }
    }
}
