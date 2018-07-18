package Looping;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GetFullInfo{
   
    DB.DBConnection objDB = new DB.DBConnection();
    Student.StudentInfo objStudent = new Student.StudentInfo();
    DisplayInfo.FullInfo objInfoFull = new DisplayInfo.FullInfo();
    
    public void LoopingStatement(String Query) throws SQLException{
  
        objDB.DBConnection();
        objDB.setRs(objDB.getStmt().executeQuery(Query));
        
        while(objDB.getRs().next()){
            //Retrieve by column name
            objStudent.setStId(objDB.getRs().getString("ID"));
            objStudent.setStName(objDB.getRs().getString("NAME"));
            objStudent.setStAge(objDB.getRs().getInt("AGE"));
            objStudent.setStAddress(objDB.getRs().getString("ADDRESS"));
            
            objInfoFull.ShowFullInfo(objStudent);
        }
    }
}
