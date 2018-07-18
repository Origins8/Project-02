package Factory;

import User.userInput;

public class OperationSelection {
    
    User.userInput objInput = new User.userInput();
     
    public void Decision(){
     
        switch(objInput.getInput()){
        
        case 1:
            DB.Insert_query objInsert = new DB.Insert_query(); 
            break;
            
        case 2:
        
            break;
            
        case 3:
        
            break;
            
        default:
            System.out.println("Sorry your choice of action is incorrect. Please try again!");            
            break;
        }   
    }
}
