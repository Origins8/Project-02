package Looping;

import java.sql.SQLException;

public class GetSingleInfo {
    
    DB.DBConnection objDB = new DB.DBConnection();
    Student.StudentInfo objStudent = new Student.StudentInfo();
    DisplayInfo.FullInfo objInfoFull = new DisplayInfo.FullInfo();
    DB.Retrieve_Specific_Info objSpecific = new DB.Retrieve_Specific_Info();
    
    public void LoopingStatementSingle(String id) throws SQLException{ 
  
        objDB.DBConnection();
        objSpecific.RetrieveSpecificInfo();
        objDB.setRs(objDB.getStmt().executeQuery(objSpecific.getPersonal()));
                            
        while(objDB.getRs().next()){
            //Retrieve by column name
            if(id.equals(objDB.getRs().getString("ID"))){  
                objStudent.setStId(objDB.getRs().getString("ID"));
                objStudent.setStName(objDB.getRs().getString("NAME"));
                objStudent.setStAge(objDB.getRs().getInt("AGE"));
                objStudent.setStAddress(objDB.getRs().getString("ADDRESS"));
            
                objInfoFull.ShowFullInfo(objStudent);
            }
            
        }
    }
}
