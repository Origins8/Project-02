package User;

import java.util.Scanner;

public class UserInputString {
    private String input;

    Scanner objUser = new Scanner(System.in);
 
    public String getInput() {
        return input;
    }
   
    public void setInput(String input) {
        this.input = input;
    } 
    
    public void GetStringInput(){
        setInput(objUser.next());
        Factory.ContinuationSelection objContinueSelection = new Factory.ContinuationSelection();
        objContinueSelection.DecisionContinuation();
    }
    
}
