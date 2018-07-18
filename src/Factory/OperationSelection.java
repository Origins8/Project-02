package Factory;

import User.userInputNumber;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
            DB.Retrieve_Specific_Info objSpecific = new DB.Retrieve_Specific_Info();
            objSpecific.RetrieveSpecificInfo();
            break;
            
        default:
            System.out.println("Sorry your choice of action is incorrect. Please try again!");
            break;
        }   
    }
}
