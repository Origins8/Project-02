package Factory;

public class ContinuationSelection {
    
    User.UserInputString objStringInput = new User.UserInputString();
    User.UserDecision objDecision = new User.UserDecision();
    
    public void DecisionContinuation(){
        
        if("y".equals(objStringInput.getInput())){
            
        }else if ("n".equals(objStringInput.getInput())){
            System.out.println("\nTHANK YOU!\n");
        }else{
            System.out.println("Sorry wrong selection\n");
            objDecision.YesOrNo();
        }
    }
}
