package Looping;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GetSingleInfo {
    
    DB.DBConnection objDB = new DB.DBConnection();
    Student.StudentInfo objStudent = new Student.StudentInfo();
    DisplayInfo.FullInfo objInfoFull = new DisplayInfo.FullInfo();
    
    public void LoopingStatementSingle(String Personal) throws SQLException{ 

        objDB.DBConnection();
        objDB.setRs(objDB.getStmt().executeQuery(Personal));
        
        while(objDB.getRs().next()){
            //Retrieve by column name
            if(objStudent.getStId().equals(objDB.getRs().getString("ID"))){
                
                objStudent.setStId(objDB.getRs().getString("ID"));
                objStudent.setStName(objDB.getRs().getString("NAME"));
                objStudent.setStAge(objDB.getRs().getInt("AGE"));
                objStudent.setStAddress(objDB.getRs().getString("ADDRESS"));
            
                objInfoFull.ShowFullInfo(objStudent);
            }
            
        }
    }
}
