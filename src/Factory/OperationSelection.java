package Factory;

import User.userInputNumber;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OperationSelection {
    
    User.userInputNumber objInput = new User.userInputNumber();
     
    public void Decision() throws SQLException{
     
        switch(objInput.getInput()){
        
        case 1:
            DB.Insert_query objInsert = new DB.Insert_query();
            objInsert.InsertFunction();
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
