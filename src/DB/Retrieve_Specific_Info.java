package DB;

import java.sql.SQLException;

public class Retrieve_Specific_Info extends DB.DBConnection{

    private String personal;

    public String getPersonal() {
        return personal;
    }

    public void setPersonal(String personal) {
        this.personal = personal;
    }
    
    Looping.GetSingleInfo objSingle = new Looping.GetSingleInfo();
    
    public void RetrieveSpecificInfo() throws SQLException{
    
        setPersonal("SELECT ID, NAME, AGE, ADDRESS FROM `student`");
        objSingle.LoopingStatementSingle(getPersonal());
    }
}
