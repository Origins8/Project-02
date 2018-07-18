package User;

import java.util.Scanner;

public class QueryInput {
    
    public void SetInfo(){
        
        Student.StudentInfo objStudent = new Student.StudentInfo();
        Scanner onjInput = new Scanner(System.in);
        
        System.out.print("\nEnter Student ID        : ");
        objStudent.setStId(onjInput.next());
        System.out.print("Enter Student name      : ");
        objStudent.setStName(onjInput.next());
        System.out.print("Enter Student Age       : ");
        objStudent.setStAge(onjInput.nextInt());
        System.out.print("Enter Student address   : ");
        objStudent.setStAddress(onjInput.next());
    }
}
