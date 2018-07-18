package Factory;

import java.sql.SQLException;

public class OperationSelection {
     
    public void Decision(int number) throws SQLException{
     
        switch(number){
        
        case 1:
            Student.AddInformations objAdd = new Student.AddInformations();
            objAdd.GetForAdd();
            break;
            
        case 2:
            DB.Retrieve_Full_Info objFull = new DB.Retrieve_Full_Info();
            objFull.RetrieveFullFunction();
            break;
            
        case 3:
            User.RetreiveSingleInfo objSingle = new User.RetreiveSingleInfo();
            objSingle.GetStudentID();
            break;
            
        default:
            System.out.println("Sorry your choice of action is incorrect. Please try again!");
            break;
        }   
    }
}
