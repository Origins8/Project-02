package Factory;

public class ContinuationSelection {
    
    User.UserInputString objStringInput = new User.UserInputString();
    User.UserDecision objDecision = new User.UserDecision();
    Looping.MainLoop objLoop = new Looping.MainLoop();
    
    public void DecisionContinuation(String decision){
        
        if("y".equals(decision)){
            objLoop.LoopingMain();
        }else if ("n".equals(decision)){
            System.out.println("\nTHANK YOU!\n");
        }else{
            System.out.println("\nSorry wrong selection\n");
            objDecision.YesOrNo();
        }
    }
}
