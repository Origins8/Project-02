package project.pkg02;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Project02 {
    
    public static void main(String[] args) {
               
        System.out.println("|||||||||||||||WELCOME TO STUDENT MANAGEMENT SYSTEM|||||||||||||||");
        
        try{
            DB.DBConnection objDBConnection = new DB.DBConnection();
        }catch(Exception e){
            e.printStackTrace();
            return;
        }
         
        User.userInputNumber objInput = new User.userInputNumber(); 
        objInput.GetNumberInput();
        
        User.UserDecision objDecision = new User.UserDecision();
        objDecision.YesOrNo();
    }
    
}
