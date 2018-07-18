package User;

public class UserDecision {
    
    private String Decision;

    public String getDecision() {
        return Decision;
    }

    public void setDecision(String Decision) {
        this.Decision = Decision;
    }
    
    public void YesOrNo(){
        System.out.println("\nDo You want to continue? y-yes / n-No");
        UserInputString objStringInput = new UserInputString();
        objStringInput.GetStringInput();
    }
}
