package Factory;

import User.userInputNumber;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OperationSelection {
    
    User.userInputNumber objInput = new User.userInputNumber();
     
    public void Decision(){
     
        switch(objInput.getInput()){
        
        case 1:
        { 
            try {
                DB.Insert_query objInsert = new DB.Insert_query();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
            break;
            
        case 2:
        {
            try {
                DB.Retrieve_Full_Info objFull = new DB.Retrieve_Full_Info();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
            break;
            
        case 3:
        {
            try {
                DB.Retrieve_Specific_Info objSpecific = new DB.Retrieve_Specific_Info();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
            break;
            
        default:
            System.out.println("Sorry your choice of action is incorrect. Please try again!");
            User.UserDecision objContinuation = new User.UserDecision();
            objContinuation.YesOrNo();
            break;
        }   
    }
}
