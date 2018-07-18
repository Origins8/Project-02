package User;

import java.util.Scanner;

public class UserInputID {
   
    Scanner objInput = new Scanner(System.in);
    private String ID;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    
    public void IDInput(){
        System.out.print("\nEnter Student ID        : ");
        setID(objInput.next());
    }
}
