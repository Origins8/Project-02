package User;

import java.util.Scanner;

public class userInput {

    private int input;

    Scanner objUser = new Scanner(System.in);
    
    public userInput() {
        this.input = objUser.nextInt();
    }
      
    public int getInput() {
        return input;
    }
   
    public void setInput(int input) {
        this.input = input;
    }   
}
    
    
