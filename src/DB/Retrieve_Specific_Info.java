package DB;

import java.sql.SQLException;

public class Retrieve_Specific_Info {

    private String personal;

    public String getPersonal() {
        return personal;
    }

    public void setPersonal(String personal) {
        this.personal = personal;
    }
    
    public void RetrieveSpecificInfo() throws SQLException{
        setPersonal("SELECT ID, NAME, AGE, ADDRESS FROM `student`");   
    }
}
