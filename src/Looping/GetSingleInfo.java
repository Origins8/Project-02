package Looping;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GetSingleInfo extends DB.DBConnection{
    
    ResultSet rs;
    
    Student.StudentInfo objStudent = new Student.StudentInfo();
    DisplayInfo.FullInfo objInfoFull = new DisplayInfo.FullInfo();
    User.RetreiveSingleInfo objIdOnly = new User.RetreiveSingleInfo();
    
    public void LoopingStatementSingle() throws SQLException{ 
        DB.Retrieve_Specific_Info objSingle = new DB.Retrieve_Specific_Info();
        rs = stmt.executeQuery(objSingle.personal);
        
        while(rs.next()){
            //Retrieve by column name
            if(objStudent.getStId().equals(rs.getString("ID"))){
                objStudent.setStId(rs.getString("ID"));
                objStudent.setStName(rs.getString("NAME"));
                objStudent.setStAge(rs.getInt("AGE"));
                objStudent.setStAddress(rs.getString("ADDRESS"));
            
                objInfoFull.ShowFullInfo();
            }
            
        }
    }
}
