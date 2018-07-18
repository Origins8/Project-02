package DB;

import java.sql.SQLException;

public class Retrieve_Full_Info extends DB.DBConnection{
    
    private String all;

    public String getAll() {
        return all;
    }

    public void setAll(String all) {
        this.all = all;
    }
    
    Looping.GetFullInfo objGetFullInfo = new Looping.GetFullInfo();
    
    public void RetrieveFullFunction() throws SQLException{
        setAll("SELECT ID, NAME, AGE, ADDRESS FROM `student`");
        objGetFullInfo.LoopingStatement(getAll());
    }   
}
