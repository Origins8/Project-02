package project.pkg02;

import java.util.Scanner;

public class Project02 {

    public static void main(String[] args) {
        
        Scanner objUser = new Scanner(System.in);
        System.out.println("|||||||||||||||WELCOME TO STUDENT MANAGEMENT SYSTEM|||||||||||||||");
        
        DB.DBConnection objDBConnection = new DB.DBConnection();
        
        System.out.println("\nWhich operation do you want to do?\n\t1-Add new Student\n\t2-Get all Student informations\n\t3-Get one Student information\n");
        int UserChoice = objUser.nextInt(); //Get the input from the user 
    }
    
}
