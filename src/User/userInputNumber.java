package User;

import java.sql.SQLException;
import java.util.Scanner;

public class userInputNumber {

    private int input;

    Scanner objUser = new Scanner(System.in);

    public int getInput() {
        return input;
    }
   
    public void setInput(int input) {
        this.input = input;
    }   
    
    public void GetNumberInput(){
        System.out.println("\nWhich operation do you want to do?\n\t1-Add new Student\n\t2-Get all Student informations\n\t3-Get one Student information\n"); 
        setInput(objUser.nextInt());
        
        Factory.OperationSelection objSelection = new Factory.OperationSelection();
            try {
                objSelection.Decision(getInput());
            } catch (SQLException ex) {
                ex.printStackTrace();
            }   
    }
}
    
    
