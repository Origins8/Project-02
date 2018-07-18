package User;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class QueryInput {
    
    public void SetInfo(){
        
        Student.StudentInfo objStudent = new Student.StudentInfo();
        Scanner onjInput = new Scanner(System.in);
        
        System.out.print("\nEnter Student ID        : ");
        objStudent.setStId(onjInput.next());
        System.out.print("Enter Student name      : ");
        objStudent.setStName(onjInput.next());
        System.out.print("Enter Student Age       : ");
        objStudent.setStAge(onjInput.nextInt());
        System.out.print("Enter Student address   : ");
        objStudent.setStAddress(onjInput.next());

        DB.Insert_query objInsert = new DB.Insert_query();
        try {
            objInsert.InsertFunction(objStudent);
        } catch (SQLException ex) {
            Logger.getLogger(QueryInput.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
