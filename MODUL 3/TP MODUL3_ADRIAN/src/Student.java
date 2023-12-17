import java.util.ArrayList;

public class Student extends User {
    protected ArrayList<String> enrolledCourse = new ArrayList<String>();

    public Student(String name, int ID, ArrayList<String> enrolledCourse) {
        super(name, ID);
        this.enrolledCourse = enrolledCourse;
    }
    
    public void enrollCourse(String course){
        System.out.println("Enrolled Courses : " + enrolledCourse);
    }

    @Override
    public String getUserDetail(){
        return "Student - Name : " + this.name + ", " + this.ID;
    }

}
