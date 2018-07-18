package project.pkg02;

public class Project02 {
    
    public static void main(String[] args) {
               
        System.out.println("|||||||||||||||WELCOME TO STUDENT MANAGEMENT SYSTEM|||||||||||||||");
        
        try{
            DB.DBConnection objDBConnection = new DB.DBConnection();
            objDBConnection.DBConnection();
        }catch(Exception e){
            e.printStackTrace();
            return;
        }
        
        Looping.MainLoop objLoop = new Looping.MainLoop();
        objLoop.LoopingMain();
         
    }
    
}
