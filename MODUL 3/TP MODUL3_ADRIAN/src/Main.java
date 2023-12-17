import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        int studentID = 0;
        ArrayList<String> enrolledCourse = new ArrayList<String>();

        String[] coursesList = {"Statistika Industri", "Pemodelan Proses Bisnis"};
        String[] courseID = {"101", "102"};
        String[][] students = {
            {"Harris", "Metta"}, 
            {"Windy", "Amalia"}};

        System.out.print("Enter student name : ");
        String studentName = input.nextLine();

        boolean isInt = true;
        while (isInt) {
            System.out.print("Enter student ID : ");
            try {
                studentID = input.nextInt();
                isInt = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input please enter a valid integer");
                input.nextLine();
            }
        }

        System.out.println("Enter courses to enroll in (separated by comma) : ");
        String courses = scan.nextLine();
        System.out.println();

        for(int i = 0; i < coursesList.length; i++){
            System.out.println("Course ID : " + courseID[i] + ", ");
            
            System.out.println("Course Name : " + coursesList[i]);

            for(int y = 0; y < students[i].length; y++) {
                System.out.println(" - Student : " + students[i][y]);
            }
            System.out.println();
        }

        String[] course = courses.split(",");
        for(String enrollCourse : course){
            enrolledCourse.add(enrollCourse);
        }

        Student studentSatu = new Student(studentName, studentID, enrolledCourse);
        System.out.println(studentSatu.getUserDetail());
        studentSatu.enrollCourse(courses);

        System.out.println();
        Teacher teacherSatu = new Teacher("Yoga", 1101010101);
        teacherSatu.teachClass("Pemodelan Proses Bisnis");

        Admin adminSatu = new Admin("Huza", 121202020);
        adminSatu.manageSystem("university system");
        System.out.println();

        input.close();
        scan.close();
    }
}
