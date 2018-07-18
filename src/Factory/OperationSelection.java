package Factory;

import User.userInputNumber;

public class OperationSelection {
    
    User.userInputNumber objInput = new User.userInputNumber();
     
    public void Decision(){
     
        switch(objInput.getInput()){
        
        case 1:
            DB.Insert_query objInsert = new DB.Insert_query(); 
            break;
            
        case 2:
            DB.Retrieve_Full_Info objFull = new DB.Retrieve_Full_Info();
            break;
            
        case 3:
            DB.Retrieve_Specific_Info objSpecific = new DB.Retrieve_Specific_Info();
            break;
            
        default:
            System.out.println("Sorry your choice of action is incorrect. Please try again!");
            User.UserDecision objContinuation = new User.UserDecision();
            objContinuation.YesOrNo();
            break;
        }   
    }
}
