package DB;

import java.sql.SQLException;

public class Retrieve_Full_Info extends DB.DBConnection{
    
    public Retrieve_Full_Info() throws SQLException{
        String all = "SELECT ID, NAME, AGE, ADDRESS FROM `student`";
        rs = stmt.executeQuery(all);
    }
}
