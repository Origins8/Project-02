package User;

import java.sql.SQLException;
import java.util.Scanner;

public class RetreiveSingleInfo {
    
    private String StudentID;

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String StudentID) {
        this.StudentID = StudentID;
    }
    
    public void GetStudentID() throws SQLException{
        Scanner objInput = new Scanner(System.in);
        System.out.println("\nEnter Student ID        : ");
        setStudentID(objInput.next());
        
        Looping.GetSingleInfo objSingle = new Looping.GetSingleInfo();
        objSingle.LoopingStatementSingle(getStudentID());
    }
}
