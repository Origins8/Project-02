package DB;

import java.sql.SQLException;

public class Retrieve_Full_Info extends DB.DBConnection{
    
    public String all;
    
    public void RetrieveFullFunction() throws SQLException{
        all = "SELECT ID, NAME, AGE, ADDRESS FROM `student`";
        
        Looping.GetFullInfo objGetFullInfo = new Looping.GetFullInfo();
        objGetFullInfo.LoopingStatement(all);
    }   
}
