package DB;

import java.sql.SQLException;

public class Retrieve_Specific_Info extends DB.DBConnection{

    public String personal;
    
    public Retrieve_Specific_Info() throws SQLException{
    
        personal = "SELECT ID, NAME, AGE, ADDRESS FROM `student`";
        
        Looping.GetSingleInfo objSingle = new Looping.GetSingleInfo();
        objSingle.LoopingStatementSingle();
    }
}
