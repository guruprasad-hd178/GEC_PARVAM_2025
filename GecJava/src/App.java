import student.Student;

public class App {
    public static void main(String[] args) throws Exception {
        
        Student std1 = new Student( 1, "guru");
        Student std2 = new Student( 2, "abhi");

        System.out.println("The student details are ");

        System.out.println("ID : " + std1.stdID );
        System.out.println("Name : " + std1.stdName );
        

        System.out.println("ID : " + std2.stdID );
        System.out.println("Name : " + std2.stdName );
       
    }
}
