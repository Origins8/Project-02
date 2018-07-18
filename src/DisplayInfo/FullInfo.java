package DisplayInfo;

public class FullInfo {
    
    public void ShowFullInfo(Student.StudentInfo objStudent){
        System.out.println("\nStudent ID        : " + objStudent.getStId());
        System.out.println("Student name      : " + objStudent.getStName());
        System.out.println("Student age       : " + objStudent.getStAge());
        System.out.println("Student address   : " + objStudent.getStAddress());
        System.out.println("\n-----------------------------------------------\n");
    }
}
