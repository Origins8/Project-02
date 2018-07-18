package Looping;

public class MainLoop {
    
    public void LoopingMain(){
        
        User.userInputNumber objInput = new User.userInputNumber(); 
        objInput.GetNumberInput();
        
        User.UserDecision objDecision = new User.UserDecision();
        objDecision.YesOrNo();
    }
}
