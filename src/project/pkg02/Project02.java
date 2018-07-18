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
        
        System.out.println("\nWhich operation do you want to do?\n\t1-Add new Student\n\t2-Get all Student informations\n\t3-Get one Student information\n");      
        User.userInput objInput = new User.userInput(); 

    }
    
}
