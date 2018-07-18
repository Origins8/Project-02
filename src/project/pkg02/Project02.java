package project.pkg02;

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
        
        Factory.OperationSelection objSelection = new Factory.OperationSelection();
        objSelection.Decision();
    }
    
}
