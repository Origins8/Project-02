package User;

import java.util.Scanner;

public class RetreiveSingleInfo {
    
    private String StudentID;

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String StudentID) {
        this.StudentID = StudentID;
    }
    
    public void GetStudentID(){
        Scanner objInput = new Scanner(System.in);
        setStudentID(objInput.next());
    }
}
